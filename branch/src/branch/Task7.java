package branch;
import java.util.Scanner;

public class Task7 {
	public static void main(String args[]) {
		System.out.println("病院に行く曜日を入力してください");
		System.out.println("【日曜,月曜,火曜,水曜,木曜,金曜,土曜】");
		
		Scanner sc = new Scanner(System.in); //標準入力
		String strA = sc.nextLine();
		sc.close();	
		
		String strB;
		
		switch(strA) {
			case "月曜":
			case "火曜":	
			case "水曜":
			case "木曜":
			case "金曜":
				strB = "午前診療と午後診療があります";
				break;
			case "土曜":
				strB = "土曜は午前診療のみです";
				break;
			case "日曜":
				strB = "日曜は休診です";
				break;
			default:
				strB = "入力を確認してください";
				break;
		}
		System.out.print(strB);
		
	}

}