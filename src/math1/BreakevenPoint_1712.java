package math1;

import java.util.Scanner;

public class BreakevenPoint_1712 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a, b, c, result=0, n=1;
		
		a=s.nextInt(); b=s.nextInt(); c=s.nextInt();
		
		if(c-b<=0) result=-1;
		else result=(a/(c-b)+1);
		
		System.out.println(result);
	}

}
