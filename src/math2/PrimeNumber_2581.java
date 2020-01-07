package math2;

import java.util.*;

public class PrimeNumber_2581 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int total=0;
		int i, j;

		int m = s.nextInt();
		int n = s.nextInt();
		int min=10001;
		int check[] = new int[n+1];

		for(i=0;i<=n;i++) check[i]=0;
		check[1]=1;

		for(i=2;i<=n;i++)
			for(j=2;i*j<=n;j++)
				check[i*j]=1;

		for(i=m;i<=n;i++) {
			if(check[i]!=1) {
				total+=i;
				if(min>i) min=i;
			}
		}

		s.close();

		if(min==10001) {
			System.out.println("-1");
		} else {
			System.out.println(total);
			System.out.println(min);
		}
	}
}
