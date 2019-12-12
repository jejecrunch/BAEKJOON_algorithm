package useStrings;

import java.util.Scanner;

public class Dial_5622 {

	public static void main(String[] args) {
		Dial d = new Dial();
		Scanner scan = new Scanner(System.in); 
		String input=scan.nextLine().trim();
		input=input.toLowerCase();
		char[] chs = input.toCharArray();
		int time=0;
		
		for(int i=0;i<chs.length;i++) {
			time+=d.checkAlphabet(chs[i]);
		}
		
		System.out.println(time);
	}

}

class Dial {
	char[][] dial;
	
	void setDial(){
		dial = new char[8][4];
		dial[0][0]='a'; dial[0][1]='b'; dial[0][2]='c';
		dial[1][0]='d'; dial[1][1]='e'; dial[1][2]='f';
		dial[2][0]='g'; dial[2][1]='h'; dial[2][2]='i';
		dial[3][0]='j'; dial[3][1]='k'; dial[3][2]='l';
		dial[4][0]='m'; dial[4][1]='n'; dial[4][2]='o';
		dial[5][0]='p'; dial[5][1]='q'; dial[5][2]='r'; dial[5][3]='s';
		dial[6][0]='t'; dial[6][1]='u'; dial[6][2]='v';
		dial[7][0]='w'; dial[7][1]='x'; dial[7][2]='y'; dial[7][3]='z';
	}
	
	int checkAlphabet(char ap) {
		for(int i=0;i<dial.length;i++) {
			for(int j=0;j<dial[i].length;j++) {
				if(dial[i][j]==ap) {
					return (i+3);
				} else
					continue;
			}
		}
		
		return 0;
	}
}
