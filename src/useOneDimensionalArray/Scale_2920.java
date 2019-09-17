package useOneDimensionalArray;
import java.util.*;

public class Scale_2920 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] input = new int[8];
		String output="";
		
		for(int i=0;i<input.length;i++) {
			input[i]=s.nextInt();
		}
		
		for(int i=0;i<input.length-1;i++) {
			if(input[i]==input[i+1]-1)
				output="ascending";
			else if(input[i]==input[i+1]+1)
				output="descending";
			else {
				output="mixed";
				break;
			}
		}
		
		System.out.println(output);
	}

}
