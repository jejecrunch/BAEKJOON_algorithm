package math2;

import java.util.*;

public class TaxiGeometry_3053 {

	final static double pi = 3.14159265358979323846;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double r = (double) scan.nextInt();
		// 유클리드 기하학에서 원의 넓이
		System.out.printf("%.6f", r*r*pi);
		System.out.println();
		// 택시 기하학에서 원의 넓이
		System.out.printf("%.6f",2*r*r);
	}

}
