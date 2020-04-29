package calc;
import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();	
		int sum = a + b + c;
		double ave1 = (a + b + c) / 3.0;
		int ave2 = (int)ave1;
		System.out.println("合計: " + sum);
		System.out.println("平均(3で割った時): " + ave2);
		System.out.println("平均(3.0で割った時): " + ave1);	
	}
}
