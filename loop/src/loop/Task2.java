package loop;
import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		System.out.print("数字を入力してください: ");

		Scanner sc = new Scanner(System.in); //標準入力

		int num = sc.nextInt();

		sc.close();

		int sum = 0; //和を表す変数

		System.out.print(1);

		for(int i = 1; i <= num; i++) {
			sum += i; //和の計算
			System.out.print(" + " + (i + 1)); //結果の出力
		}

		System.out.print(" = " + sum); //結果の出力

	}
}