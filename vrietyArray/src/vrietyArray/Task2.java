package vrietyArray;

import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {

		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		ArrayList<Integer> evenNum = new ArrayList<>();
		ArrayList<Integer> oddNum = new ArrayList<>();

		for(int i = 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				evenNum.add(array[i]);
			}else{
				oddNum.add(array[i]);
			}
		}

		System.out.println(evenNum);
		System.out.println(oddNum);

	}
}
