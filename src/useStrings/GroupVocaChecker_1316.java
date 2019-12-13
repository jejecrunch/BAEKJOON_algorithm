package useStrings;

import java.util.Scanner;

public class GroupVocaChecker_1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int wc = scan.nextInt();
		String[] input = new String[wc];
		
		for(int i=0;i<wc;i++) input[i]=scan.next();
		scan.close();
	}

}
