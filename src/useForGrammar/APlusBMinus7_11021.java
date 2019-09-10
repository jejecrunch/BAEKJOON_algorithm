package useForGrammar;

import java.util.Scanner;

public class APlusBMinus7_11021 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int cnt = s.nextInt();
		
		for(int i=1;i<=cnt;i++) {
			int a=s.nextInt(), b=s.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}
		
	}

}
