package calc;

public class Task2 {
	public static void main(String args[]) {
		int a = 10, b = 12, c = 13;
		int sum = a + b + c;
		int ave1 = (a + b + c)/3;
		double ave2 = (a + b + c)/3.0;
		System.out.println("合計: " + sum);
		System.out.println("平均(3で割った時): " + ave1);
		System.out.println("平均(3.0で割った時): " + ave2);
	}
}