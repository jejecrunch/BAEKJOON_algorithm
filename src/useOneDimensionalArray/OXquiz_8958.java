package useOneDimensionalArray;
import java.util.*;

public class OXquiz_8958 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt(); // �׽�Ʈ ����
		
		int[] result = new int[c]; 

		s.nextLine(); // �׽�Ʈ ���� �����ϰ� �Է¹ޱ� ����
		
		int count;
		for(int i=0;i<c;i++) {
			String tmp = s.nextLine();
			count=0;
			
			for(int j=0;j<tmp.length();++j) {
				if(tmp.charAt(j)=='O') {
					result[i] += ++count;
				}
				else
					count = 0;
			}
		}
		
		for(int i=0;i<c;i++) {
			System.out.println(result[i]);
		}
	}

}
