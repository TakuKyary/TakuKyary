package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class Task4 {
	public static void main(String[] args) {

		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		ArrayList<Integer> evenNum = new ArrayList<>();
		ArrayList<Integer> oddNum = new ArrayList<>();
		HashMap<String, ArrayList<Integer>> hashmap = new HashMap<>();

		hashmap.put("偶数: ", evenNum);
		hashmap.put("奇数: ", oddNum);

		for(int i= 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				evenNum.add(array[i]);
			}else{
				oddNum.add(array[i]);
			}
		}	
		System.out.println(hashmap);
	}
}
