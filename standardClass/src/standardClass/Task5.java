package standardClass;

public class Task5 {
	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		int catCount = 0;
		int mouseCount = 0;
		//"_"で要素を区切り単語数をカウント
		String[] strAray = str.split("_");
		for(String str1 : strAray) {
			if(str1.equals("cat")) {
				catCount++;
			}else {
				mouseCount++;
			}
		}
		//if文によって場合分け
		if(catCount > mouseCount) {
			System.out.print("catの方が多い");
		}else if(mouseCount > catCount){
			System.out.print("mouseの方が多い");
		}else {
			System.out.print("catとmouseは同数");
		}
	}
}
