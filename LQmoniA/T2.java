

import java.util.Arrays;

//凑公式、找公式
public class T2 {
	static int[] factor = new int[6];// 公式中共出现6个整数
	static int[] count = new int[10];// 对0-9的出现次数做统计

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 对每个***遍历；在test（）中检测每个factor位数及每位数字的出现频率；
		// table1:
		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
				factor[0] = i;
				factor[1] = j;
				factor[2] = (j % 10) * i;
				factor[3] = (j / 10 % 10) * i;
				factor[4] = (j / 100) * i;
				factor[5] = i * j;
				if (test()) {
					System.out.println(factor[2] + " " + factor[3] + " " + factor[4]);
					System.out.println(i + "*" + j + "=" + (i * j));
				}
				;
			}
		}
		System.out.println("end");
	}

	private static boolean test() {
		// TODO Auto-generated method stub
		Arrays.fill(count, 0);// count清零
		int b;
		for (int i = 0; i < 5; i++) {
			b = factor[i];
			if (b / 1000 != 0 || b / 100 == 0)
				return false;
			while (b != 0) {
				if (count[b % 10] >= 2)
					return false;
				count[b % 10]++;
				b /= 10;
			}
		}
		b = factor[5];
		if (b / 100000 != 0)
			return false;
		while (b != 0) {
			if (count[b % 10] >= 2)
				return false;
			count[b % 10]++;
			b /= 10;
		}
		return true;
	}

}
