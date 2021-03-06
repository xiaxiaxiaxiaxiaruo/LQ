
public class T4 {

	static int compare(String s1, String s2) {
		if (s1 == null && s2 == null)
			return 0;
		if (s1 == null)
			return -1;
		if (s2 == null)
			return 1;

		if (s1.isEmpty() && s2.isEmpty())
			return 0;
		if (s1.isEmpty())
			return -1;
		if (s2.isEmpty())
			return 1;

		char x = s1.charAt(0);
		char y = s2.charAt(0);

		if (x < y)
			return -1;
		if (x > y)
			return 1;

		int t = compare(s1.substring(1), s2.substring(1));//递归 数层数
if (t == 0)
			return 0;

		return t > 0 ? t + 1 : t - 1; // 填空位置
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compare("abc", "abk"));
		System.out.println(compare("abc", "a"));
		System.out.println(compare("abcde", "abcda"));

	}

}
