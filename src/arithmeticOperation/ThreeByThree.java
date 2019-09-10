package arithmeticOperation;

import java.util.Scanner;

public class ThreeByThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=scan.nextInt();
		
		int b=scan.nextInt();
		int b1=b%10;
		int b2=b%100/10;
		int b3=b/100;
		
		int c1=a*b1;
		int c2=a*b2;
		int c3=a*b3;
		
		System.out.printf("%d\n%d\n%d\n%d",c1, c2, c3, a*b);
	}

}
