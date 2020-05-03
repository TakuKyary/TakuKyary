package vrietyArray;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<String> japan = new ArrayList<>();
		japan.add("北海道");
		japan.add("東北");
		japan.add("関東");
		japan.add("中部");
		japan.add("近畿");
		japan.add("中国");
		japan.add("九州");

		for(String j : japan){
			System.out.println(j);
		}
	}
}
