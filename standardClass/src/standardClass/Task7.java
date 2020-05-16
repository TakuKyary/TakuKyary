package standardClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Task7 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Date now = new Date();

		cal1.setTime(now);
		cal2.setTime(now);
		System.out.println("現在日時: " + sdf.format(now));

		cal1.add(Calendar.DAY_OF_MONTH, 7);
		Date d1 = cal1.getTime();
		System.out.println("１週間後: " + sdf.format(d1));

		cal2.set(Calendar.YEAR, 2021);
		Date d2 = cal2.getTime();
		System.out.print("１年後　: " + sdf.format(d2));

		switch(Calendar.DAY_OF_WEEK) {
		case 1:
			System.out.print("(月)");
			break;
		case 2:
			System.out.print("(火)");
			break;
		case 3:
			System.out.print("(水)");
			break;
		case 4:
			System.out.print("(木)");
			break;
		case 5:
			System.out.print("(金)");
			break;
		case 6:
			System.out.print("(土)");
			break;
		default:
			System.out.print("(日)");

		}
	}
} 
