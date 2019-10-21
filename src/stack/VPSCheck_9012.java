package stack;

import java.util.Scanner;
import java.util.Stack;

public class VPSCheck_9012 {

	public static void main(String[] args) {
		Stack<Character> a=new Stack<Character>();
		Scanner scan = new Scanner(System.in);
		String input;
		char testCh;
		char openPair;
		boolean result=true;

		int size = scan.nextInt();

		for(int i=0;i<size;i++) {
			input = scan.nextLine();
			for(int j=0;j<input.length();j++) {
				testCh=input.charAt(j);

				switch(testCh) {
				case '(':
					a.push(testCh);
					result=false;
					break;
				case ')':
					if(a.isEmpty()) {
						result=false;
						break;
					} else {
						openPair = a.pop();
						if((openPair=='(')&&(testCh!=')')) {
							result = false;
							break;
						} else {
							result = true;
							break;
						}
					}
				}
			}

			if(result == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
