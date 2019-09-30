package useOneDimensionalArray;
import java.util.*;

public class OXquiz_8958 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt(); // 테스트 개수
		String[] test = new String[c]; 

		for(int i=0;i<c;i++) {
			test[i]=s.nextLine();
		}
		s.close();

		int count, total;
		for(String x : test) {
			count=0;
			total=0;
			for(int i=0;i<x.length();++i) {
				if(x.charAt(i)=='O')
					total+= ++count;
				else
					count = 0;
			}
			System.out.println(total);
		}
	}

}
