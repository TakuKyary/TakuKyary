package standardClass;
import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		String str = "ABCDGOPQRSYZ";

		System.out.print("探したい文字: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		if(str.indexOf(input) >= 0) {
			System.out.println(str + "は" + input + "を含む");
		}else {
			System.out.println(str + "は" + input + "を含まない");
		}
	}
}