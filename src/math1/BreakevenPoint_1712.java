package math1;

import java.util.Scanner;

public class BreakevenPoint_1712 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c, result=-1, n=1;
		
		a=s.nextInt(); b=s.nextInt(); c=s.nextInt();
		
		while(true) {
			if(a+(b*n)<c*n) {
				result=n;
				break;
			}
			n++;
		}
		
		System.out.println(result);
	}

}
