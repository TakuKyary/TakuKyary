import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public register() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?serverTimezone=JST", "root", "");
			System.out.println("DB接続が成功しました。");

			String sql = "INSERT INTO employee(id, name, birthday, age) VALUES(?, ?, ?, ?)";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);
			String id = request.getParameter("id");
			int i = Integer.parseInt(id);
			ps.setInt(1, i);
			String name = request.getParameter("name");
			ps.setString(2, name);
			String birthday = request.getParameter("birthday");
			Date b =Date.valueOf(birthday);
			ps.setDate(3, b);
			String age = request.getParameter("age");
			int a = Integer.parseInt(age);
			ps.setInt(4, a);

			int result = ps.executeUpdate();

			ps.close();

			System.out.println(result + "行が追加されました");

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
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
