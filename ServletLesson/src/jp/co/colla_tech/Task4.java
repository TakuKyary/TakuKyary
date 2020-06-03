package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task4")
public class Task4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		Random random =new Random();
		String[] kuji = new String[]{"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		int index = random.nextInt(kuji.length); 
		
		HtmlTemplate.header(out);
		out.println("<p1>↓占い結果↓</p1>");
		out.println("<h1>" + kuji[index] + "</h1>");
		HtmlTemplate.footer(out);
	}

}
