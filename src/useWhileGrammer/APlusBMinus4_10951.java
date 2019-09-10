package useWhileGrammer;

import java.util.Scanner;

public class APlusBMinus4_10951 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0, b=0;
		
		while(s.hasNextInt()) {
			a=s.nextInt(); b=s.nextInt();
			System.out.println(a+b);
		}
		
	}

}
