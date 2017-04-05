package 省赛训练1_16省B;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		table1:
			for (int i = 1; i <= 200; i++) {
			sum = 0;
			for (int j = i; j <= 200; j++) {
				sum += j;
				if (sum == 236) {
					System.out.println(j);
					break table1;
				}
			}
		}
	}

}
