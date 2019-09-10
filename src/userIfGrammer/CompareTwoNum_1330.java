package userIfGrammer;

import java.util.Scanner;

public class CompareTwoNum_1330 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=scan.nextInt(), b=scan.nextInt();
		
		if(a>b)
			System.out.println(">");
		else if(a<b)
			System.out.println("<");
		else
			System.out.println("==");
	}

}
