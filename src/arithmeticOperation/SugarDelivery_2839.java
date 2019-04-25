package arithmeticOperation;

import java.util.Scanner;

public class SugarDelivery_2839 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input = scan.nextInt(), t=0;
		int f=input/5; input%=5;
		
		while(f >= 0) {
			if(input%3==0) {
				t=input/3;
				input%=3;
				break;
			}
			f--;
			input+=5;
		}
		
		System.out.println(input==0? f+t:-1);
		scan.close();
	}

}
