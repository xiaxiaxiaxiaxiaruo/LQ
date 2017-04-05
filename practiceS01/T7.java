package 省赛训练1_16省B;

import java.util.Arrays;
import java.util.HashSet;

public class T7 {
	static boolean vis[]=new boolean[14];
	static boolean book[]=new boolean[14];
	static int a[]=new int[5];
	static int g[][]=new int[3][6];
	static int sum,sum1;
	static int flag;
	static int next[]={1,-1,4,-4};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<3;i++){
			for(int j=1;j<=4;j++){
				g[i][j]=i*4+j;
			}
		}
		System.out.println(Arrays.deepToString(g));
		int cnt=0;
		for( a[0]=1;a[0]<=12;a[0]++ ){
			book[a[0]]=true;
			for( a[1]=1;a[1]<=12;a[1]++)
				if(book[a[1]]==false){
					book[a[1]]=true;
					for(a[2]=1;a[2]<=12;a[2]++)
						if(book[a[2]]==false){
							book[a[2]]=true;
							for(a[3]=1;a[3]<=12;a[3]++)
								if(!book[a[3]]){
									book[a[3]]=true;
									for(a[4]=1;a[4]<=12;a[4]++)
										if(!book[a[4]]){
											book[a[4]]=true;
											sum1++;
											Arrays.fill(vis, false);
											flag=0;
											int b[]=new int[5];
											for(int i=0;i<5;i++)b[i]=a[i];
											Arrays.sort(b);
											dfs(a[0]);
											
											if(flag==5){
												String s=Arrays.toString(b);
												if(set.contains(s));
												else {
													set.add(s);
													System.out.println(s);
												}
												sum++;
												//System.out.println(Arrays.toString(a));
											}
											book[a[4]]=false;
										}
									book[a[3]]=false;
								}
							book[a[2]]=false;
						}											
					book[a[1]]=false;
				}
			book[a[0]]=false;
		}
		System.out.println(sum1+" "+12*11*10*9*8);
		System.out.println(sum);//abcde的全排列有120种
		System.out.println(sum/120);
		System.out.println(set.size());
	}

	private static void dfs(int t) {
		// TODO Auto-generated method stub
		flag++;
		vis[t]=true;
		for(int i=0;i<4;i++){
		
		if(t+next[i]>0&&t+next[i]<=12&&!vis[t+next[i]]&&book[t+next[i]]){
			if(t%4==0&&next[i]==1)continue;
			if(t%4==1/*-1*/&&next[i]==-1)continue;//
			
			dfs(t+next[i]); //加一减一要在同一行、加四减四要在同一列
		}
		}
	}

}
