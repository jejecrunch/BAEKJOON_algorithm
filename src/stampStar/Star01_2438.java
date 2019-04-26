package stampStar;

import java.util.Scanner;

public class Star01_2438 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int row = scan.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
