package useForGrammar;

import java.util.Scanner;

public class SumOfNumber_11720 {

	public static void main(String[] args) {
		// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		int sum=0;
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String s=scan.next();
		scan.close();

		for(int i=0;i<a;i++)
			sum+=Integer.parseInt(s.substring(i, i+1));

		System.out.println(sum);
	}

}
