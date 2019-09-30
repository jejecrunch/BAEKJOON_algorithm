package useStrings;
import java.util.*;

public class Sangsu_2908 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a=s.nextInt(), b=s.nextInt();
		
		a=reverse(a);
		b=reverse(b);
		
		System.out.println(a>b?a:b);
	}
	
	public static int reverse(int value) {
		String result = "";
		
		while(value != 0) {
			result += (value%10);
			value /= 10;
		}
		
		return Integer.parseInt(result);
	}

}
