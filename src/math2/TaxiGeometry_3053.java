package math2;

import java.util.*;

public class TaxiGeometry_3053 {

	final static double pi = 3.14159265358979323846;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double r = (double) scan.nextInt();
		// ��Ŭ���� �����п��� ���� ����
		System.out.printf("%.6f", r*r*pi);
		System.out.println();
		// �ý� �����п��� ���� ����
		System.out.printf("%.6f",2*r*r);
	}

}
