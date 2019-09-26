package useStrings;
import java.util.*;

public class FindAlphabet_10809 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		int[] check = new int[26];
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<check.length;j++) {
				if(s.contains(Integer.toString(j+97))) {
					check[j]=s.indexOf(Integer.toString(j+97));
				} else {
					check[j]=-1;
				}
				System.out.print(check[j]+" ");
			}
		}
	}

}
