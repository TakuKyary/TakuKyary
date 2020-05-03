package loop;
import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		System.out.print("数字を入力してください:");

		Scanner sc = new Scanner(System.in); //標準入力

		int num = sc.nextInt();

		sc.close();

		int count = 0; //桁数を表す変数

		while(num != 0){ //numを割った回数をカウント
			num = num / 10;
			count++; //count += 1から修正しました。
		}

		System.out.print("桁数: " + count); //結果の出力

	}
}