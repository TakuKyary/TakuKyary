package calc;
import java.util.Scanner;
public class Task5 {
	public static void main(String args[]) {
		String str = "ノートPCの値段: ";
		int num = 89800;
		char ch = '円';
		System.out.println(str + num + ch);
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();	
		System.out.println(str1 + str2);
	}
}
