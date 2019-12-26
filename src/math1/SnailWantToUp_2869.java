package math1;

import java.util.*;

public class SnailWantToUp_2869 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a=s.nextInt(), b=s.nextInt(), c=s.nextInt();
		int result = c/(a-b)-1;

		System.out.println(result);
		
		s.close();
	}

}
