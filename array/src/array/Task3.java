package array;
import java.util.Random;
public class Task3 {
	public static void main(String[] args) {

		int[] array =new int[6]; //配列の作成

		for(int i = 0; i < array.length; i++) { //配列にランダムで値を代入する。
			Random random = new Random();
			int r = random.nextInt(10);
			array[i] = r;
		}

		System.out.print("[");

		for(int i = 0; i < array.length; i++) {
			if(i == 0){
				System.out.print(array[i]); //配列の先頭の表示
			}else{
				System.out.print("," + array[i]);
			}
		}

		System.out.println("]");

		int max = array[0]; //仮の最大値をarray[0]とする。
		int min = array[0]; //仮の最小値をarray[0]とする。

		for(int i = 0; i < array.length; i++) {
			if(max < array[i]){
				max = array[i];
			}
			if(min > array[i]){
				min = array[i];
			}
		}

		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);

	}
}
