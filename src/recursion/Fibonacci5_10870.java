package recursion;

import java.util.Scanner;

public class Fibonacci5_10870 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		System.out.println(f(t));
	}

	private static int f(int a) {
		if(a<2) {
			return a; 
		} else {
			return f(a-1)+f(a-2);
		}
	}

}
