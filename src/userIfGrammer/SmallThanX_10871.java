package userIfGrammer;

import java.io.*;

public class SmallThanX_10871 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] s = bf.readLine().split(" ");
		String[] in = bf.readLine().split(" ");
		int[] A=new int[Integer.parseInt(s[0])];

		for(int i=0;i<A.length;i++) {
			A[i]=Integer.parseInt(in[i]);
			if(A[i]<Integer.parseInt(s[1]))
				System.out.print(A[i]+" ");
		}
		
		System.out.println();
	}

}
