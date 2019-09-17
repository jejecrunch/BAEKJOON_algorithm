package useOneDimensionalArray;
import java.util.*;

public class CountNum_2577 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] count = new int[10];
		int a=s.nextInt(), b=s.nextInt(), c=s.nextInt();
		String r1=String.valueOf(a*b*c);
		
		for(int i=0;i<r1.length();++i) {
			count[r1.charAt(i)-'0']++;
		}
		
		for(int i=0;i<count.length;i++) {
			System.out.println(count[i]);
		}
	}

}
