package method;

public class Task3 {
	//main関数
	public static void main(String[] args) {
		System.out.println(add("文字列１", "文字列２"));
		System.out.println(add(3, 5));
		System.out.println(add(3.5, 5.5));
	}
	//引数が文字列だけの場合
	public static String add(String a, String b){
		System.out.println("--①文字列だけの場合---");
		return a + b;
	}
	//引数が整数だけの場合
	public static int add(int a, int b){
		System.out.println("---②整数だけの場合----");
		return a + b;
	}
	//引数が少数だけの場合
	public static double add(double a, double b){
		System.out.println("---③小数だけの場合----");
		return a + b;
	}

}
