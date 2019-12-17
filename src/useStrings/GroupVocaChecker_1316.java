package useStrings;

import java.util.Scanner;

public class GroupVocaChecker_1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int wc = scan.nextInt();
		int count = 0;
		
		while(wc-- > 0) {
			String word = scan.next().trim();
			if(check(word)) {
				count++;
			}
		}
		
		System.out.print(count);
	}
	
	private static boolean check(String input) {
		boolean[] al = new boolean[26];
		
		for(int i=0;i<input.length();i++) {
			char temp = input.charAt(i);
			if(al[temp-'a']) {
				return false;
			} else {
				if()
			}
		}
	}

}
