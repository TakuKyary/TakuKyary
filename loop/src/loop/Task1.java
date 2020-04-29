package loop;
import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		System.out.print("数字を入力してください:");
		
		Scanner sc = new Scanner(System.in); //標準入力
		int num = sc.nextInt();
		sc.close();	
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		switch(num) {
		case 1: //1～1までの合計と表示されるのを避けるための場合分け
			System.out.print("合計:" + sum); 
			break;
		default:
			System.out.print(1 + "～" + num + "までの合計:" + sum);
			break;
		}
	}
}
