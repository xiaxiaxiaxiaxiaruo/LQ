
import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int benjin = 10000 * 100;// fen
		int n;
		double r;

		// r = read.nextDouble();
		r=Double.parseDouble(read.nextLine()); //6.85
		n = read.nextInt();  
		//精度误差
		//r /= 100D; //0.06849999999999999;
        System.out.println(r+" "+n);
        
		int huan = 0, min_diff = Integer.MAX_VALUE;
		int ans = 0;
		int tmp;
		int lixi;
		for (huan = benjin / n; huan <= (1.0 + r) * benjin / n; huan++) {
			tmp = benjin;
			for (int i = 0; i < n; i++) {
				// 计算结果会四舍五入到“分”。

				// if(tmp>0)lixi=(int) (tmp*(r/12D));
				// (int)强制类型转换直接截尾只保留整数部分；
				// 而要求四舍五入，可以Math.round()
				// 也可以+0.5再截尾
				lixi = (int) (tmp * (r /100/ 12) + 0.5);

				tmp = tmp + lixi - huan;
			}
			if (Math.abs(tmp) < min_diff) {
				min_diff = Math.abs(tmp);
				ans = huan;
			}
		}
		System.out.println(ans);
	}

}
