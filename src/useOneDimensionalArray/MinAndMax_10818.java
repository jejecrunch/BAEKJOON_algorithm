package Array_1;
import java.util.*;

public class MinAndMax_10818 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int cnt=s.nextInt(), min, max;
		int[] a=new int[cnt];
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		min=max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<=min) {
				min=a[i];
			} else if(a[i]>min&&a[i]>max){
				max=a[i];
			}
		}
		
		System.out.println(min+" "+max);
	}

}
