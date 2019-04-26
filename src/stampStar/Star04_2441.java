package stampStar;

import java.util.Scanner;

public class Star04_2441 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row = scan.nextInt();
		scan.close();

		for(int i=row;i>0;i--) {
			for(int j=0;j<row;j++) {
				if(j<=row-i-1) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
