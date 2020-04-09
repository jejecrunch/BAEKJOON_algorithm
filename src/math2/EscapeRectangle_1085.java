package math2;

import java.util.*;

public class EscapeRectangle_1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		System.out.println(Math.min(Math.min(w-x, x),Math.min(h-y, y)));
	}

}
