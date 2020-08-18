package stack;

import java.io.*;
import java.util.Stack;

public class BalanceWorld_4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String input = br.readLine();
			
			if(input.equals(".")) {
				bw.flush();
				return;
			}
			
			bw.write(isBalanced(input));
		}
		
		
	}
	
	static String isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		boolean result=true;
		
		for(char temp : s.toCharArray()) {
			if(temp == '(' || temp == '[') {
				stack.push(temp);
			} else if (temp == ')') {
				if(stack.isEmpty() || stack.pop() != '(' ) {
					result = false;
					break;
				}
			} else if (temp == ']') {
				if(stack.isEmpty() || stack.pop() != '[') {
					result = false;
					break;
				}
			}
		}
		
		if(!stack.isEmpty()) result = false;
		return result ? "yes\n":"no\n";
	}

}
