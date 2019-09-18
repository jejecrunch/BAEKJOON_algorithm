package useOneDimensionalArray;
import java.util.*;

public class Remainder_3052 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> inputs = new ArrayList<Integer>(10);
		int count=0, input;
		
		for(int i=0;i<10;i++) {
			input=s.nextInt(); // 입력받고
			inputs.add(input%42); // 나머지 저장
		}
		
		for(int i=1;i<inputs.size()-1;i++) {
			if(inputs.subList(0, i-1).contains(inputs.get(i))||inputs.subList(i+1, inputs.size()-1).contains(inputs.get(i)))
				++count;
		}
		
		System.out.println(count);
	}

}
