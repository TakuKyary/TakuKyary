package vrietyArray;

import java.util.HashMap;

public class Task3 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> fruit = new HashMap<>();
		fruit.put("りんご", 130);
		fruit.put("みかん", 120);
		fruit.put("バナナ", 98);
		fruit.put("メロン", 6000);

		for(HashMap.Entry<String, Integer> f : fruit.entrySet()) {
			System.out.println(f.getKey() + ":" + f.getValue() + "円");
		}
		
	}
}
