package useForGrammar;

import java.util.Scanner;

public class NtnirP_2742 {

	public static void main(String[] args) {
		// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		int a;
        Scanner s=new Scanner(System.in);
        
        a=s.nextInt();
        
        for(int i=a;i>0;i--)
            System.out.println(i);
	}

}
