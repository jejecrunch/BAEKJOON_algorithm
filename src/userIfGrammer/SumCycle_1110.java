package userIfGrammer;

import java.util.*;

public class SumCycle_1110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		
		int result=num, i=0;
		
		do {
			result = result%10*10 + (result/10 + result%10)%10;
			i++;
		}while(num!=result);

		System.out.println(i);
		
	}
}
