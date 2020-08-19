package queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Deque_10866 {

	public static void main(String[] args) {
		Deque<Integer> deq=new LinkedList();
		Scanner scan = new Scanner(System.in); 
		int size = scan.nextInt();        

		for(int i=0;i<size;i++) {
			String inst = scan.next();
			if(inst.contains("push_front")) {
				int value=scan.nextInt();
				deq.offerFirst(value);
			} else if(inst.contains("push_back")) {
				int value = scan.nextInt();
				deq.offerLast(value);
			} else if(inst.equals("pop_front")) {
				System.out.println(deq.isEmpty()? -1 : deq.pollFirst());
			} else if(inst.equals("pop_back")) {
				System.out.println(deq.isEmpty()? -1 : deq.pollLast());
			} else if(inst.equals("size")) {
				System.out.println(deq.size());
			} else if(inst.equals("empty")) {
				System.out.println(deq.isEmpty()? 1:0);
			} else if(inst.equals("front")) {
				System.out.println(deq.isEmpty()? -1 : deq.getFirst());
			} else if(inst.equals("back")) {
				System.out.println(deq.isEmpty()? -1 : deq.getLast());
			}
		}

	}

}
