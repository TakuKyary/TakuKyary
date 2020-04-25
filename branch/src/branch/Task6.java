package branch;
import java.util.Scanner;

public class Task6 {
	public static void main(String args[]) {
		System.out.println("1から5までの数字を入力してください");
		
		Scanner sc = new Scanner(System.in); //標準入力
		int num = sc.nextInt();
		sc.close();	
		
		String str;
		
		switch(num) {
			case 1:
				str = "Ⅰ";
				break;
			case 2:
				str = "Ⅱ";
				break;
			case 3:
				str = "Ⅲ";
				break;
			case 4:
				str = "Ⅳ";
				break;
			case 5:
				str = "Ⅴ";
				break;
			default:
				str = "unknown";
				break;
		}
		System.out.print(num + "->" + str);
		
	}

}
