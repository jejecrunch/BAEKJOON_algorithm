package useStrings;

import java.util.Scanner;

public class LJESNJAK_2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String input=scan.next();
		String[] crotia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0;i<crotia.length;i++) {
			input = input.replace(crotia[i], "x");
		}
		
		System.out.println(input.length());
	}

}


