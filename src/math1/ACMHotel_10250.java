package math1;

import java.util.*;

public class ACMHotel_10250 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t=s.nextInt();
		int stair, room, guest, count;
		int[] result=new int[t];
		
		for(int i=0;i<t;i++)
		{
			count=1;
			stair=s.nextInt();
			room=s.nextInt();
			guest=s.nextInt();
			
			if((guest%stair)==0)
					result[i]=(guest/stair)*100+room;
			else result[i]=(guest%stair)*100+((guest/stair)+1);
		}
		
		for(int i=0;i<t;i++) {
			System.out.println(result[i]);
		}
		
	}

}
