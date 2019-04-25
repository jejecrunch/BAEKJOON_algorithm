package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_10828 {

	public static void main(String[] args) {
		Stack<Integer> a=new Stack<Integer>();
		Scanner scan = new Scanner(System.in); 
		int size = scan.nextInt();        
		
		for(int i=0;i<size;i++) {
			String inst = scan.next();
			if(inst.contains("push")) {
				int value=scan.nextInt();
				a.push(value);
			} else if(inst.equals("pop")) {
				System.out.println(a.isEmpty()? -1 : a.pop());
			} else if(inst.equals("top")) {
				System.out.println(a.isEmpty()? -1 : a.peek());
			} else if(inst.equals("size")) {
				System.out.println(a.size());
			} else if(inst.equals("empty")) {
				System.out.println(a.isEmpty()? 1:0);
			}
		}
	}

}
