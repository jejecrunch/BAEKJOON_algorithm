package useForGrammar;

import java.util.Scanner;

public class SumOfNumber_11720 {

	public static void main(String[] args) {
		// N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
