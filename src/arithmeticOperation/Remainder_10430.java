package arithmeticOperation;

import java.util.Scanner;

public class Remainder_10430 {

	public static void main(String[] args) {
		// (A+B)%C�� (A%C + B%C)%C �� ������?
		// (A��B)%C�� (A%C �� B%C)%C �� ������?
		// �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b, c;
        Scanner s=new Scanner(System.in);
        
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        
        System.out.println((a+b)%c);
        System.out.println((a%c+b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%c*b%c)%c);
	}

}
