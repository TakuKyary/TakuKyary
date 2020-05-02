package array;

public class Task1 {
	public static void main(String[] args) {
		
		int[] array = {4,9,19,5,8,21,42,64,73,18,2}; //配列の作成


		for(int i = 0; i < array.length; i++) {
			if(i == 0){
				System.out.print("配列: [" + array[i]); //配列の先頭の表示（i=0）
			}else if(i > 0 && i < array.length - 1){
				System.out.print("," + array[i]);
			}else{
				System.out.println("," + array[i] + "]"); //配列の末尾表示
			}
		}

		int sum = 0;

		for(int j : array){ //配列の要素の合計の計算
			sum += j;
		}

		System.out.print("合計: " + sum);
		
	}
}
