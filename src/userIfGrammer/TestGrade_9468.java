package userIfGrammer;

import java.util.Scanner;

public class TestGrade_9468 {

	public static void main(String[] args) {
		// ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a;
        Scanner s=new Scanner(System.in);
        
        a=s.nextInt();
        
        if(a>=90&&a<=100)
            System.out.println("A");
        else if(a>=80&&a<=89)
            System.out.println("B");
        else if(a>=70&&a<=79)
            System.out.println("C");
        else if(a>=60&&a<=69)
            System.out.println("D");
        else
            System.out.println("F");
	}

}
