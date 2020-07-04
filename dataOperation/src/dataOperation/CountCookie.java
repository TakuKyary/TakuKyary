package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
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
		out.println("<h1>訪問回数テスト（クッキー）</h1>");

		Cookie [] cookies = request.getCookies();
		Cookie cookie = null;

		if(cookies != null) {
			for(int i = 0; i < cookies.length ; i++) {
				if(cookies[i].getName().equals("count")){
					cookie = cookies[i];
				}
			}
		}

		if(cookie != null) {
			int count = Integer.parseInt(cookie.getValue()) + 1;
			out.println("<p>" + count + "回目の訪問です。</p>");
			cookie.setValue(Integer.toString(count));
			cookie.setMaxAge(300);
			response.addCookie(cookie);
		}else {
			out.println("<p>初めての訪問です。</p>");
			Cookie newCookie = new Cookie("count", "1");
			newCookie.setMaxAge(300);
			response.addCookie(newCookie);
		}

		out.println("<a href=\"/dataOperation/CountCookie\">画面を再訪問</a>");
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
