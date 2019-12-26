package math1;

import java.util.*;

public class ACMHotel_10250 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t=s.nextInt();
		int[] result=new int[t];
		
		for(int i=0;i<t;i++)
		{
			int h=s.nextInt();
			int w=s.nextInt();
			int q=s.nextInt();
			int floor=q%h, room=q/h+1;
			
			if((q%h)==0){
				floor=h;
				room=q/h;
			}
			
			result[i]=floor*100+room;
		}
		
		for(int i=0;i<t;i++) {
			System.out.println(result[i]);
		}
		
	}

}
