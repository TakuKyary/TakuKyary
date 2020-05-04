package method;

public class Task1 {
	//main関数
	public static void main(String[] args) {
		myProfile("コラボ", 30, 178);
	}
	//自己紹介
	public static void myProfile(String name, int age, double height) {
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("よろしくお願いします。");
	}

}
