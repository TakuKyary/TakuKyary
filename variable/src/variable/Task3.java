package variable;

public class Task3 {
	public static void main(String args[]) {
		int intNum = 219;
		double doubleNum = 364.2;
		long longNum = 123456L; 
		System.out.println("変更前");
		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNum);
		long a = intNum;
		float b = (float) doubleNum;
		double c = longNum;
		System.out.println("変更後");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
