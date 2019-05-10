package useForGrammar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TenPrint_11721 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //¼±¾ð
		String s = bf.readLine(); //String

		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			if(i%10==9)
				System.out.println();
		}
		
	}

}
