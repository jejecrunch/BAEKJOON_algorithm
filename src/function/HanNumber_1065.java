package function;

import java.util.Scanner;

public class HanNumber_1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt();
		System.out.print(hanNum(n));
		scan.close();
	}

	private static int hanNum(int input) {
		int count=0, k;
		int[] arr=new int[3];
		for(int i=1;i<=input;i++) {
			if(0 < i && i < 100) count=i;
			else if(i==1000) break;
			else {
				k=2; int t=i;
				while(t>0) {
					arr[k]=t%10;
					t/=10; k--;
				}
				if (arr[0]-arr[1]==arr[1]-arr[2]) count++;
			}
		}

		return count;
	}

}
