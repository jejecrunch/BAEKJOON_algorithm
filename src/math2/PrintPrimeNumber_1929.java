package math2;

import java.util.*;

public class PrintPrimeNumber_1929 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int i, j;

		int m = s.nextInt();
		int n = s.nextInt();
		int check[] = new int[n+1];
		
		for(i=0;i<=n;i++) check[i]=0;
		check[1]=1;

		for(i=2;i<=n;i++)
			for(j=2;i*j<=n;j++)
				check[i*j]=1;
		
		for(i=m;i<=n;i++)
			if(check[i]!=1) System.out.println(i);
		
		s.close();
	}
}
