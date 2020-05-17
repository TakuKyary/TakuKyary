package method;

public class Task4 {
	//main関数
	public static void main(String[] args) {
		String[] array1 = {"a", "b", "c"};
		String[] array2 = {"a", null, "c"};
		boolean b1 = nullCheck(array1);
		System.out.println("---配列にnullがない場合---");
		System.out.println(b1);
		boolean b2 = nullCheck(array2);
		System.out.println("---配列にnullがある場合---");
		System.out.println(b2);
	}
	//nullcheck関数
	/*public static boolean nullCheck(String[] array) {
		if(array[0] == null || array[1] == null || array[2] == null) {
			System.out.println("---配列にnullがある場合---");
			return true;
		}else {
			System.out.println("---配列にnullがない場合---");
			return false;
		}
	}*/

	public static boolean nullCheck(String[] array) {
		for(String str: array) {
			if(str == null) {
				return true;
			}
		}
		return false;
	}
}
