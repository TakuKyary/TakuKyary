package object;

public class Dog extends Animal{
	//重さ
	double weight;
	//コンストラクタ
	public Dog() {};
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	//runメソッド
	public void run() {
		System.out.println(this.name + "は走った");
	}
	//sleepメソッド
	public void sleep() {
		super.sleep(); //スーパークラスのメソッド呼び出し
		System.out.println(this.name + "は眠った");
	}
}
