package useStrings;
import java.util.*;

public class StringRepeat_2675 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		int t = c.nextInt();
		char[] result;
		char[] a;
		
		for(int i=0;i<t;i++) {
			int r = c.nextInt();
			String s = c.next();
			
			a = s.toCharArray();
			result=new char[r*a.length];
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<result.length;k=k+r) {
					result[k]=a[j];
					System.out.print(result[k]);
				}
			}
			
			System.out.println();
		}
		
	}

}
