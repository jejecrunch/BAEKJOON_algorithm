package dynamicPlanBasic;

import java.util.Scanner;

public class Fibonacci_1003 {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		int t=s.nextInt();
		int[][] fibonacci = new int[41][2];
		
		fibonacci[0][0]=1;
		fibonacci[1][1]=1;
		
		for(int i=2;i<41;i++) {
			for(int j=0;j<2;j++) {
				fibonacci[i][j]=fibonacci[i-1][j]+fibonacci[i-2][j];
			}
		}
		
		for(int i=0;i<t;i++) {
			int a=s.nextInt();
			System.out.println(fibonacci[a][0]+" "+fibonacci[a][1]);
		}
		s.close();
	}

}
