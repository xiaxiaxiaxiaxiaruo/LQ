package LQMoNiA;

//全排列 康拓展开
//next_permutation() in C++
public class T3 {
	static long[] fac = { 1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L,
			6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L,
			121645100408832000L };
	// i的阶乘为fac[i];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;

		String s = "abcdefghijklmnopq";
		String t = "bckfqlajhemgiodnp";
		System.out.println(KT(s.length(), s));

		System.out.println(KT(t.length(), t));
	}

	private static long KT(int length, String s) {
		// TODO Auto-generated method stub
		long sum = 0;
		int i, j, t = 0;
		for (i = 0; i < length; i++) {
			t = 0;// 统计第i位的逆序//s[i]在未访问的元素中是第t小；
			for (j = i + 1; j < length; j++) {
				if (s.charAt(j) < s.charAt(i))
					t++;
			}
			sum += fac[length - i - 1] * t;
		}
		return sum;
	}

}
