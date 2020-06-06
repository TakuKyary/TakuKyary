package practice;

import java.io.Serializable;
import java.util.Date;

public class FortuneBean implements Serializable{
	//フィールド
	private Date today;
	private String fortune;

	//引数なしのコンストラクタ
	public FortuneBean(){};

	//dateフィールドのgetter
	public Date getToday() {
		return this.today;
	}
	//dateフィールドのsetter
	public void setToday(Date today) {
		this.today = today;
	}
	
	//fortuneフィールドのgetter
	public String getFortune() {
		return this.fortune;
	}
	//fortuneフィールドのsetter
	public void setFortune(String fortune) {
		this.fortune = fortune;
	}
}
