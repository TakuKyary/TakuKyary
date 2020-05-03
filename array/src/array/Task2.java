package array;

public class Task2 {
	public static void main(String[] args) {

		int[] array = new int[7]; //配列の作成

		for(int i = 0; i < array.length; i++) {

			array[i] = array.length - i;

			if(i == 0){
				System.out.print(array[i]); //配列の先頭の表示（i=0）
			}else{
				System.out.print("," + array[i]); //配列の末尾表示
			}

		}

		System.out.println();

		for(int i = array.length - 1; i >= 0; i--){ //配列の要素を逆順で表示

			if(i == array.length - 1){
				System.out.print(array[i]);
			}else{
				System.out.print("," + array[i]);
			}
		}

	}
}
