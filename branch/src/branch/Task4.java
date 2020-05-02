package branch;
import java.util.Scanner;
public class Task4 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in); //標準入力

		int numA = sc.nextInt();
		int numB = sc.nextInt();
		sc.close();

		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);

		if(numA <= 0 	|| numB <= 0){ //0未満から0以下に修正しました
			System.out.println("正の数を入力してください");
		}else if(numA % numB == 0) {
			System.out.println(numB + "は" + numA + "の約数です");
		}else{
			System.out.println(numB + "は" + numA + "の約数ではありません");
		}

	}
}

//15行目。numAが0以下なら、わざわざnumB(右辺）を評価する必要がない為、|ではなく||が適当
