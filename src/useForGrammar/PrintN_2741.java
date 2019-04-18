package useForGrammar;

import java.util.Scanner;

public class PrintN_2741 {

	public static void main(String[] args) {
		// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		int a;
        Scanner s=new Scanner(System.in);
        
        a=s.nextInt();
        
        for(int i=1;i<=a;i++)
            System.out.println(i);
	}

}
