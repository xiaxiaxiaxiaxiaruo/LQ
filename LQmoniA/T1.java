public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;// 枚举年龄//暴力检测
		for (a = 0; a < 200; a++) {
			if (a * a - a >= 1800 && a * a - a < 1900) {
				break;
			}
		}
		System.out.printf("%d\n%d", a, a * a - a);

	}

}
