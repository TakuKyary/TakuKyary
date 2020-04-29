package branch;
import java.util.Scanner;
public class Task3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();	
		if(a > 0) {
			System.out.println("入力された値は正の数です。");
		}
		else if(a == 0) {
			System.out.println("入力された値は0です。");
		}
		else {
			System.out.println("入力された値は負の数です。");
		}
		
	}
}

