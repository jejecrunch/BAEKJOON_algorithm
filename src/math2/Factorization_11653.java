package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization_11653 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //¼±¾ð
		String s = bf.readLine(); //String
		int input = Integer.parseInt(s); //Int
		
		for(int i=2;i<=input;i++) {
			while(input % i == 0) {
				input /= i;
				System.out.println(i);
			}
		}
	}
}
