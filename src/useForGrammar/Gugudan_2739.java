package useForGrammar;

import java.util.Scanner;

public class Gugudan_2739 {

	public static void main(String[] args) {
		// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		int a;
        Scanner s=new Scanner(System.in);
        
        a=s.nextInt();
        
        for(int i=1;i<10;i++)
           System.out.println(a+" * "+i+" = "+a*i);
	}

}
