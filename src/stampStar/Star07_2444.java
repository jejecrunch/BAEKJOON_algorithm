package stampStar;

import java.util.Scanner;

public class Star07_2444 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row = scan.nextInt();
		scan.close();

		for(int i=0;i<row-1;i++) {
			for(int j=0;j<row-i-1;j++) System.out.print(" ");
			for(int k=0;k<2*i+1;k++) System.out.print("*");
			System.out.print("\n");
		}
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<row-i-1;j++) System.out.print(" ");
			for(int k=0;k<2*i+1;k++) System.out.print("*");
			System.out.print("\n");
		}
	}

}
