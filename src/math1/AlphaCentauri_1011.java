package math1;

import java.util.*;

public class AlphaCentauri_1011 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		
		for(int i=0;i<t;i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			int d = 0, xm=0, ym=0;
			
			while(true) {
				d++;
				
				x+=d; xm++;
				if(x>=y) break;
				
				y-=d; ym++;
				if(y<=x) break;
			}
			
			System.out.println(xm+ym);
		}
		
		s.close();
	}

}
