package recursion;

import java.util.*;

public class Star10_2447 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		f(n);
	}

	private static void f(int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int x=i, y=j;
				while(x>0) {
					if(x%3==1&&y%3==1) {
						break;
					}
					
					x/=3;
					y/=3;
				}
				
				sb.append(x==0?'*':' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
