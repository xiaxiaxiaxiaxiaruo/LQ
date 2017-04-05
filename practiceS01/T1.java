package 省赛训练1_16省B;

public class T1 {
//煤球数目
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ceng = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			ceng += i;
			sum += ceng;
		}
		System.out.println(sum);
	}

}
