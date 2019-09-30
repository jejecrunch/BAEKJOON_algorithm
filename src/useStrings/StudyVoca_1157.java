package useStrings;
import java.util.*;

public class StudyVoca_1157 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] alpha = new int[26];
		int max = 0;
		char result = '?';
		
		String test = s.nextLine().toUpperCase();
		
		for(int i=0;i<test.length();i++) {
			alpha[test.charAt(i) - 65]++;
			if(max < alpha[test.charAt(i) - 65]) {
				max = alpha[test.charAt(i) - 65];
				result = test.charAt(i);
			} else if (max == alpha[test.charAt(i) - 65]) {
				result = '?';
			}
		}
		System.out.println(result);
		
		s.close();
		
	}

}
