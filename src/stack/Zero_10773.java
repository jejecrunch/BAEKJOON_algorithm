package stack;

import java.util.Scanner;
import java.util.Stack;

public class Zero_10773 {

	public static void main(String[] args) {
		Stack<Integer> a=new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		for(int i=0;i<size;i++) {
			int value = scan.nextInt();
			
			if(value == 0) a.pop();
			else a.push(value);
		}
		
		int sum=0;
		
		while(!a.isEmpty()) {
			sum+=a.pop();
		}
		
		System.out.println(sum);
	}
}
