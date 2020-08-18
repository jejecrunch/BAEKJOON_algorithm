package stack;

import java.util.Scanner;
import java.util.Stack;

public class VPSCheck_9012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		String input;

		while(size-->0) {
			boolean result = true;
			input = scan.next();
			Stack<Character> a=new Stack<Character>();
			
			char testCh;
			for(int j=0;j<input.length();j++) {
				testCh=input.charAt(j);
				
				if(testCh=='(') {
					a.push(')');
				} else {
					if(a.isEmpty()) {
						result = false;
						break;
					}
					a.pop();
				}
			}
			
			if(a.isEmpty() && result)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

}
