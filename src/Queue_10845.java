

import java.util.*;

public class Queue_10845 {

	public static void main(String[] args) {
		Deque<Integer> deq=new LinkedList();
		Scanner scan = new Scanner(System.in); 
		int size = scan.nextInt();        

		for(int i=0;i<size;i++) {
			String inst = scan.next();
			if(inst.contains("push")) {
				int value=scan.nextInt();
				deq.offer(value);
			}else if(inst.equals("pop")) {
				System.out.println(deq.isEmpty()? -1 : deq.poll());
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
