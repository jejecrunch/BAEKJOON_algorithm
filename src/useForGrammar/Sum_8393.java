package useForGrammar;

import java.util.Scanner;

public class Sum_8393 {

	public static void main(String[] args) {
		// n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
