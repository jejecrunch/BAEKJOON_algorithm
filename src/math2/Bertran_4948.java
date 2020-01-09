package math2;

import java.util.*;

public class Bertran_4948 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n;
		while(true) {
			n=s.nextInt();
			if(n==0) break;
			System.out.println(prime(n));
		}

	}

	private static int prime(int n) {
		int i, j, count=0;
		int check[] = new int[(2*n)+1];
		check[1]=1;

		for(i=2;i<=2*n;i++) check[i]=0;
		for(i=2;i<=2*n;i++)
			for(j=2;i*j<=2*n;j++)
				check[i*j]=1;

		for(i=n+1;i<check.length;i++)
			if(check[i]!=1) count++;

		return count;

	}

}
