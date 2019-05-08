package useForGrammar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Year2007_1924 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //¼±¾ð
		String[] s = bf.readLine().split(" "); //String
		int m = Integer.parseInt(s[0]);
		int d = Integer.parseInt(s[1]);
		int totalD=0;
		
		for(int i=1;i<m;i++) {
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
				totalD+=31;
			} else if(i==4||i==6||i==9||i==11) {
				totalD+=30;
			} else if(i==2) {
				totalD+=28;
			}
		}
		
		totalD+=d;
		int day = totalD%7;
		
		switch(day) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		}
	}

}
