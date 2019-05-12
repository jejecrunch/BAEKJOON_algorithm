package userIfGrammer;

import java.io.*;

public class Average_1546 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int count=Integer.parseInt(bf.readLine());
		String[] s = bf.readLine().split(" ");
		double[] arr1=new double[count];
		double max=arr1[0];
		double sum=0;
		
		for(int i=0;i<count;i++) {
			arr1[i]=Integer.parseInt(s[i]);
			if(max<arr1[i]) max=arr1[i];
		}
		
		for(int i=0;i<count;i++) {
			arr1[i]=arr1[i]/max*100;
			sum+=arr1[i];
		}
		
		System.out.printf("%.2f", sum/count);
	}

}
