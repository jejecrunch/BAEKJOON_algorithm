package math1;

import java.util.*;

public class VicePresident_2775 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		
		for(int i=0;i<t;i++) {
			int k=s.nextInt();
			int n=s.nextInt();
			
			System.out.println(cal(k, n));
		}
	}
	
	private static int cal(int k, int n) {
		if(n==0) return 0;
		else if(k==0) return n;
		else {
			return cal(k, n-1)+cal(k-1, n);
		}
	}

}
