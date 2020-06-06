package practice;

import java.io.IOException;
import java.util.Date;
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
		Random random =new Random();
		String[] fortune = new String[]{"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		Date today = new Date();
		int index = random.nextInt(fortune.length);
		
		FortuneBean fortuneData = new FortuneBean();
		fortuneData.setToday(today);
		fortuneData.setFortune(fortune[index]);
		request.setAttribute("SAMPLE", fortuneData);
		request.getRequestDispatcher("WEB-INF/jsp/fortune_result.jsp").forward(request, response);
	}
}
