package LQMoNiA;

import java.util.Arrays;
import java.util.Scanner;

public class T6 {
	// 看这个题居然第一反应是建一个九个点点图，然后搜错所有可行路径去判是否包含给定的子路径
	// 题解居然只是9层for循环加回溯就搞定，简直被鄙视了

	static int re[][] = new int[10][10];
	static int vis[] = new int[10];
	static int a[] = new int[10];
	static int ans[] = new int[10];
	static int sum = 0;

	static int mp[][] = new int[10][10];
	static int n;
	static int result;

	// static int re[][];
	// static int vis[];
	// static int a[];
	// static int ans[];
	// static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// re = new int[10][10];
		// vis = new int[10];
		// a = new int[10];
		// ans = new int[10];
		// sum = 0;

		re[1][3] = re[3][1] = 2;
		re[4][6] = re[6][4] = 5;
		re[7][9] = re[9][7] = 8;

		re[1][7] = re[7][1] = 4;
		re[2][8] = re[8][2] = 5;
		re[3][9] = re[9][3] = 6;

		re[1][9] = re[9][1] = 5;
		re[3][7] = re[7][3] = 5;

		Scanner read = new Scanner(System.in);
		n = read.nextInt();
		int a, b;
		for (int i = 0; i < n; i++) {
			a = read.nextInt();
			b = read.nextInt();
			mp[a][b] = mp[b][a] = 1;
		}
		read.close();

		dfs(0);
		System.out.println(Arrays.toString(ans));
		System.out.println(sum);
		System.out.println(result);

	}

	private static void dfs(int t) {
		// TODO Auto-geterated method stub
		if (t >= 4) {
			ans[t]++;
			sum++;
		}
		if (t >= n) {
			if (judge(t))
				result++;
		}

		for (int i = 1; /* i = 0; */ i < 10; i++) {
			if (vis[i] == 0) {
				if (t == 0 || re[a[t]][i] == 0 || vis[re[a[t]][i]] != 0) {
					vis[i] = 1;
					a[t + 1] = i;
					dfs(t + 1);
					vis[i] = 0;
				}
			}
		}
	}

	private static boolean judge(int t) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for (int i = 1; i < t; i++) {
			if (mp[a[i]][a[i + 1]] == 1)
				cnt++;//计数		
}
		if (cnt == n)
			return true;
		return false;
	}

}
