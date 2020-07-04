package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CountSession")
public class CountSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title> 訪問回数 </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>訪問回数テスト（セッション）</h1>");

		HttpSession session = request.getSession();
		Integer num = (Integer)session.getAttribute("count");

		if(num != null) {
			session.setAttribute("count", num + 1);
			out.println("<p>" + num + "回目の訪問です</p>");
		}else {
			out.println("<p>初めての訪問です</p>");
			HttpSession newSession = request.getSession();
			newSession.setAttribute("count", 1);
		}

		out.println("<a href=\"/dataOperation/CountSession\">画面を再訪問</a>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
