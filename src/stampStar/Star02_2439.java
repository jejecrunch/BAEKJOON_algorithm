package stampStar;

import java.util.Scanner;

public class Star02_2439 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row = scan.nextInt();
		scan.close();

		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(j<row-i-1) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
