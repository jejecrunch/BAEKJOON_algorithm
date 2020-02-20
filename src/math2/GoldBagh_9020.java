package math2;

import java.util.*;

public class GoldBagh_9020 {
	public static final int MAX = 10000;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		StringBuilder sb = new StringBuilder();
		boolean[] isPrime = new boolean[MAX+1];
		isPrime[1]=true;
		for(int i=2;i<=MAX;i++) {
			for(int j=2;i*j<=MAX;j++) {
				isPrime[i*j]=true;
			}
		}
		
		for(int k=0;k<t;k++) {
			int n = s.nextInt();
			
			for(int i=n/2;i>0;i--) {
				int idx1 = i;
				int idx2 = n-i;
				if(!isPrime[idx1] && !isPrime[idx2]) {
					sb.append(idx1 + " " + idx2+"\n");
					break;
				}
			}
		}
		
		System.out.println(sb.toString());
	}

}
