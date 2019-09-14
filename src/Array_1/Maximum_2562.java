package Array_1;
import java.util.*;

public class Maximum_2562 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] a=new int[9];

		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}

		int max=a[0], index=0;

		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				index=i+1;
			}
		}

		System.out.println(max+"\n"+index);
	}

}
