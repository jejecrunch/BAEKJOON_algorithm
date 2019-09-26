package useStrings;
import java.util.*;

public class FindAlphabet_10809 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		int[] check = new int[26];
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<check.length;j++) {
				char che = (char) (j+97);
				if(s.contains(String.valueOf(che))) {
					check[j]=s.indexOf(che);
				} else {
					check[j]=-1;
				}
			}
		}
		
		for(int i=0;i<check.length;i++)
			System.out.print(check[i]+" ");
	}

}
