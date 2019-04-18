package userIfGrammer;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumbers_10817 {

	public static void main(String[] args) {
		// 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
		int[] num=new int[3];
		Scanner scan = new Scanner(System.in); 
		
        for(int i=0;i<num.length;i++){
            num[i]=scan.nextInt();
        }
        scan.close();
        
        Arrays.sort(num);
        
        System.out.println(num[1]);
	}

}
