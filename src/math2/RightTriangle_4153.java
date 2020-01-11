package math2;

import java.util.*;

public class RightTriangle_4153 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			
			if(a==0&&b==0&&c==0) break;
			if (a > 0 && a <= 30000 && b > 0 && b <= 30000 && c > 0 && c <= 30000) {

				int a2 = (int) Math.pow(a, 2);
				int b2 = (int) Math.pow(b, 2);
				int c2 = (int) Math.pow(c, 2);

				if (a2 == b2 + c2 || b2 == a2 + c2 || c2 == a2 + b2) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else {
				System.out.println("모든 정수는 0보다 커야하고, 30000보다 작아야 합니다.");
			}
		}

	}

}
