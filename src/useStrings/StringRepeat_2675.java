package useStrings;
import java.util.*;

public class StringRepeat_2675 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		int t = c.nextInt();
		for(int i=0;i<t;i++) {
			int r = c.nextInt();
			String s = c.nextLine();
			
			String result="";
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<r;k=k++)
					result += s.charAt(j);
			}
			result=result.replaceAll(" ", "");
			System.out.println(result);
		}
		c.close();
	}

}
