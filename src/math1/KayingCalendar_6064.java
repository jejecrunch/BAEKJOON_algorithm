package math1;
import java.util.*;

public class KayingCalendar_6064 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ǥ�� �Է�
		// �׽�Ʈ �������� ���� �Է�
		int t = scan.nextInt();
		// �� ���� ������ �������� �����ؼ� �Է¹ޱ�
		int[][] arr = new int[t][5];
		for(int i=0;i<t;i++) {
			for(int j=0;j<4;j++) {
				// M N x y ��
				arr[i][j]=scan.nextInt();
			}
			
			// �� �׽�Ʈ �����Ϳ� ���� k(=arr[t][5])��° ������ ���
			while(arr[i][2]==0||arr[i][3]==0) {
				++arr[i][5];
				if(arr[i][2]<arr[i][0]) --arr[i][2];
				else if(arr[i][2]>=arr[i][0]) arr[i][2]=1;
					
				if(arr[i][3]<arr[i][1]) --arr[i][3];
				else if(arr[i][3]>=arr[i][1]) arr[i][3]=1;
			}
		}
		
		// ǥ�� ���
		
		// ��ȿ���� ������ -1 
	}

}
