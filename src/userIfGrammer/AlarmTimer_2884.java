package userIfGrammer;

import java.util.Scanner;

public class AlarmTimer_2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h, m, h1, m1;
		
		// ����̰� ������� �˶� �ð�
		do {
			h=scan.nextInt(); m=scan.nextInt();
		} while(h<0&&h>23&&m<0&&m>59);
		
		// â���� ����� ����� �� ����� �ϴ� �˶� �ð�
		h1 = h;
		m1 = m-45;
		if(m1<0) {
			m1+=60;
			h1--;
			if(h1<0) {
				h1 += 24;
			}
		}
		
		System.out.printf("%d %d", h1, m1);
	}

}
