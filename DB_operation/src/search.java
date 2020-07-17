import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public search() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>検索結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>検索結果</p>");

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?serverTimezone=JST", "root", "");
			System.out.println("DB接続が成功しました。");
			String sql = "SELECT * FROM employee WHERE name LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			String name = request.getParameter("name");
			ps.setString(1, "%" + name + "%");

			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				out.println("ID:" + rs.getInt("id") + "<br>");
				out.println("名前:" + rs.getString("name") + "<br>");
				out.println("生年月日:" + rs.getDate("birthday") + "<br>");
				out.println("年齢:" + rs.getInt("age") + "<br>");
			}

			rs.close();
			ps.close();

		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if (con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}

		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
