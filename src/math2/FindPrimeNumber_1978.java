package math2;

import java.util.*;

public class FindPrimeNumber_1978 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int count=0;
		
		for(int i=0;i<n;i++) {
			int a=s.nextInt();
			if(a!=1&&depart(n)>1) count++;
		}
		
		System.out.println(count);
	}
	
	private static int depart(int n) {
		int result=0;
		for(int i=2;i<=n;i++) {
			while(n%i==0) {
				n/=i;
				result++;
			}
		}
		return result;
	}

}
