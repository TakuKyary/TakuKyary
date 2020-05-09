package standardClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//作成途中です。
public class Task7 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.DATE, 7);
		System.out.println(cal.getTime());

		SimpleDateFormat sdf1 = new SimpleDateFormat("現在日時: yyyy年MM月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("一週間後: yyyy年MM月dd日");
		SimpleDateFormat sdf3 = new SimpleDateFormat("一年後　: yyyy年MM月dd日()");
	}
}