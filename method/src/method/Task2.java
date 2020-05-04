package method;

public class Task2 {
	//main関数
	public static void main(String[] args) {
		System.out.println("三角形の面積");
		System.out.print(getTriangleArea(27,10));

	}
	//三角形の面積計算
	public static double getTriangleArea(double base, double height) {
		return Math.round(base * height / 2); //戻り値の四捨五入
	}

}
