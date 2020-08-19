package queue;

import java.util.*;

public class Card2_2164 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt(); // ¸í·É ¼ö
		Queue<Integer> que = new LinkedList<>();
		
		for(int i=1;i<=size;i++) {
			que.add(i);
		}
		
		for(int i=1;i<=size;i++) {
			if(que.size()==1) {
				System.out.println(que.poll());
				break;
			}
			que.poll();
			que.add(que.poll());
		}
	}

}