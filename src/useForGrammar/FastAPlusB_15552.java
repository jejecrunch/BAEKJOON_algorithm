package useForGrammar;

import java.io.*;

public class FastAPlusB_15552 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(bf.readLine().trim());
		
		for(int i=0;i<count;i++) {
			String[] temp=bf.readLine().split(" ");
			bw.write((Integer.parseInt(temp[0])+Integer.parseInt(temp[1]))+"\n");
		}
		bw.flush();
		bw.close();
	}

}
