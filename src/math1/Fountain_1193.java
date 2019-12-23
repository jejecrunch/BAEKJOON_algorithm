package math1;

import java.util.*;

public class Fountain_1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();	
		int i = 0 , bot=0, top=0, cnt = 0;
		
		while(true) {
			if(x>cnt && cnt+i>=x) {
				if(i%2==0) {
					bot=i+1-(x-cnt);
					top=x-cnt;
				} else {
					bot=x-cnt;
					top=i+1-(x-cnt);
				}
				break;
			}
			cnt+=i;
			i++;
		}

		System.out.println(top+"/"+bot);
	}

}
