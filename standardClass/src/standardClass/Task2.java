package standardClass;

public class Task2 {
	public static void main(String[] args) {
		String str1 = "Java Programming Training";
		String str2 = str1.substring(17);
		String str3 = str1.substring(0, 16);
		System.out.println("変更前: " + str2);
		System.out.println("変更後: " + str3);
	}

}
