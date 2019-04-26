package stampStar;

import java.util.Scanner;

public class Star03_2440 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row = scan.nextInt();
		scan.close();

		for(int i=row;i>0;i--) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
