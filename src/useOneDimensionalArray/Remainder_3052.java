package useOneDimensionalArray;
import java.util.*;

public class Remainder_3052 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] inputs = new int[10];
		List<int[]> list = Arrays.asList(inputs);
		int count=1;
		
		for(int i=0;i<inputs.length;i++) {
			inputs[i]=s.nextInt(); // �Է¹ް�
			inputs[i]=inputs[i]%42; // ������ ����
		}
		
		for(int i=0;i<inputs.length;i++) {
			if(list.contains(inputs[i])) count++;
		}
		
		System.out.println(count);
	}

}
