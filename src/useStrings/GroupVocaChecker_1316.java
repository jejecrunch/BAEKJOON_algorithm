package useStrings;

import java.util.Scanner;

public class GroupVocaChecker_1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int wc = scan.nextInt();
		int count = 0;
		
		while(wc-- > 0) {
			String word = scan.next().trim();
			if(check(word)) {
				count++;
			}
		}
		
		System.out.print(count);
	}
	
	private static boolean check(String input) {
		boolean[] al = new boolean[26];
		
		char temp;
		
		for(int i=0;i<input.length();i++) {
			temp = input.charAt(i);
			if(al[temp-'a']) // 이미 알파벳이 한번이라도 나온 적이 있는 경우
				return false; // 그룹 단어가 아니다
			else { // 알파벳이 한번이라도 나온 적이 없고
				if(i<input.length()-1 && temp != input.charAt(i+1)) { // 글자 수보다 i가 작고, 다음 알파벳과 현재의 알파벳이 동일하지 않는 경우
					al[temp-'a']=true; // 나온 알파벳이라는 것을 확인하기 위해 true 값을 대입
				}
			}
		}
		
		return true;
	}

}
