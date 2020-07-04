package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")

public class Result extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		String textbox = request.getParameter("txt");
		String radiobtn = request.getParameter("sex");
		String select = request.getParameter("question");
		String text = request.getParameter("textArea");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>想定画面02</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>以下の内容でお問合せしました。回答をお待ちください。</p>");
		out.println();
		out.println("<p>名前:" + textbox + "様</p>");
		out.println("<p>性別:" + radiobtn + "性</p>");
		out.println("<p>お問い合わせ種類:" + select + "</p>");
		out.println("お問い合わせ内容:" + text);
		out.println("</body>");
		out.println("</html>");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
	}

}
