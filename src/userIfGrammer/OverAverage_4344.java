package userIfGrammer;

import java.io.*;

public class OverAverage_4344 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(bf.readLine());
		int n, total, count;
		double avg;
		int scores[] = new int[1000];
		
		for(int i=0;i<test_case;i++) {
			n=Integer.parseInt(bf.readLine());
			total=0;
			count=0;
			for(int j=0;j<n;j++) {
				scores[j]=Integer.parseInt(bf.readLine());
				total+=scores[j];
			}
			avg=(double)total/n;
			
			for(int j=0;j<n;j++) {
				if(scores[j]>avg) count++;
			}
			
			System.out.printf("%.3f", 100.0*count/n);
			System.out.println("%");
		}
		
	}

}
