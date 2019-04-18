package useForGrammar;

import java.util.Scanner;

public class Sum_8393 {

	public static void main(String[] args) {
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		int a;
        int sum=0;
        Scanner scan = new Scanner(System.in); 
        a=scan.nextInt();
        
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        
        System.out.println(sum);
	}

}
