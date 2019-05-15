package userIfGrammer;

import java.io.*;

public class OverAverage_4344 {
	
	static double average(String[] arr, int num) {
		double sum=0;
		for(int i=1;i<=num;i++) {
			sum+=Double.parseDouble(arr[i]);
		}
		return sum/num;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(bf.readLine());
		String[][] r=new String[test_case][1000];
		double[] avg=new double[test_case];
		
		for(int i=0;i<test_case;i++) {
			r[i]=bf.readLine().split(" ");
			avg[i]=average(r[i], Integer.parseInt(r[i][0]));
		}
		
		for(int i=0;i<test_case;i++) {
			int count=0;
			for(int j=0;j<r[i].length;j++) {
				if((Double.parseDouble(r[i][j])) > avg[i]) ++count;
			}
			
			System.out.format("%.3f%%\n", (double)(count/Double.parseDouble(r[i][0])) * 100.0 );
		}
	}

}
