package useStrings;

import java.util.Scanner;

public class LJESNJAK_2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String input=scan.nextLine().trim();
		scan.close();
		char[] che = input.toCharArray();
		int cnt=0;
		
		for(int i=0;i<input.length();i++) {
			if(che[i]=='c'&&che[i+1]=='=') {
				continue;
			} else if (che[i]=='c'&&che[i+1]=='-') {
				continue;
			} else if (che[i]=='d'&&che[i+1]=='z'&&che[i+2]=='=') {
				continue;
			} else if (che[i]=='d'&&che[i+1]=='-') {
				continue;
			} else if (che[i]=='l'&&che[i+1]=='j') {
				continue;
			} else if (che[i]=='n'&&che[i+1]=='j') {
				continue;
			} else if (che[i]=='s'&&che[i+1]=='=') {
				continue;
			} else if (che[i]=='z'&&che[i+1]=='=') {
				continue;
			}
			cnt++;
		}
		
		System.out.println(cnt);
	}

}


