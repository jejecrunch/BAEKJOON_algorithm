package math2;

import java.util.*;

public class FindPrimeNumber_1978 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int count=0;
		boolean flag=true;

		for(int i=0;i<n;i++) {
			int a=s.nextInt();

			if(a<=1) flag=false;
			else {
				for(int j=2;j<=a/2;j++) {
					if(a%j==0) { // 소수가 아니면
						flag = false;
						break;
					}
				}
			}

			if(flag) count++;
			flag = true;
		}

		System.out.println(count);
	}
}
