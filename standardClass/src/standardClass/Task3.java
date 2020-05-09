package standardClass;

public class Task3 {
	public static void main(String[] args) {
		String str = "ABCDEFG";

		System.out.println("文字列: " + str);

		for(int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println(": 列字文");
	}
}