package branch;
import java.util.Scanner;

public class Task5 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in); //標準入力

		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();

		sc.close();

		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);
		System.out.println("numC:" + numC);

		int max = numA; //maxを仮の最大値としました

		if(max < numB){
			max = numB;
		}

		if(max < numC){
			max = numC;
		}

		System.out.println("最大値: " + max);

	}
}

//23,26,27行目インデント修正済