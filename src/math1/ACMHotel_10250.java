package math1;

import java.util.*;

public class ACMHotel_10250 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t=s.nextInt();
		int stair=1, room, guest=0, result, count=1;
		
		for(int i=0;i<t;i++)
		{
			stair=s.nextInt();
			room=s.nextInt();
			guest=s.nextInt();
			
			int temp=guest;
			
			while(temp/stair!=0) {
				temp-=stair;
				count++;
			}
			
			result=(guest%stair)*100+count;
			
			System.out.println(result);
		}
		
	}

}
