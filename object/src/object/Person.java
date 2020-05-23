package object;

public class Person {
	//お財布(静的フィールド）
	static int wallet = 0;
	//名前	
	private String name = "";
	//年齢
	private int age = 0;

	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}

	public Person(){
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person(int num){
		this.wallet += num;
	}
	//nameフィールドのgetter
	public String getName() {
		return this.name;
	}
	//nameフィールドのsetter
	public void setName(String name) {
		this.name = name;
	}
	//ageフィールドのgetter
	public int getAge() {
		return this.age;
	}
	//ageフィールドのsetter
	public void setAge(int age) {
		this.age = age;
	}
}
