package branch;
import java.util.Scanner;
public class Task2 {
	public static void main(String args[]) {
		System.out.println("10以上の数字を入力してください");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if(a < 10){
			System.out.println("値:" + 0 + a);
		}

		if(a >= 10){
			System.out.println("値:" + a);
		}
	}
}
