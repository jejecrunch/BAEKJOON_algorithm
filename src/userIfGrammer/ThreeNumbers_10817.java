package userIfGrammer;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumbers_10817 {

	public static void main(String[] args) {
		// �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
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
