package useOneDimensionalArray;
import java.util.*;

public class Remainder_3052 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] inputs = new int[10];
		int count=1;
		
		for(int i=0;i<inputs.length;i++) {
			inputs[i]=s.nextInt(); // 입력받고
			inputs[i]=inputs[i]%42; // 나머지 저장
		}
		
		for(int i=1;i<inputs.length;i++) {
			if(Arrays.asList(inputs).contains(inputs[i])) ++count;
		}
		
		System.out.println(count);
	}

}
