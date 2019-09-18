package useOneDimensionalArray;
import java.util.*;

public class Remainder_3052 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean[] arr = new boolean[42];
		int count=0, input;
		
		for(int i=0;i<10;i++) {
			input=s.nextInt(); // 입력받고
			if(!arr[input%42]) {
				arr[input%42]=true;
				++count;
			}
		}
		
		
		System.out.println(count);
	}

}
