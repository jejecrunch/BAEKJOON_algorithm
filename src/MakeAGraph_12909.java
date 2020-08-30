import java.util.Scanner;

public class MakeAGraph_12909 {

	static int[] score;
	static int[][] dp;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 그래프의 정점의 개수  n
		int n = scan.nextInt();
		// 각 차수의 점수가 주어짐
		score = new int[n-1];
		dp = new int[52][52];
		for(int i=0;i<score.length;i++) {
			score[i]=scan.nextInt();
		}
		// 점수가 최대가 되는 것의 점수
		int max = rec(n, 0);
		
		System.out.println(max);
	}
	
	static int rec(int n, int d) {
		if(n==1) return score[d];
		int ret = dp[n][d];
		if(ret != -1) return ret;
		ret = score[d+n-1];
		for(int i=1;i<n;i++) {
			ret = Math.max(ret, rec(i, 1)+rec(n-i,d+1));
		}
		return ret;
	}
}
