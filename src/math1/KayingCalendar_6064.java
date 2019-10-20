package math1;
import java.util.*;

public class KayingCalendar_6064 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 표준 입력
		// 테스트 데이터의 개수 입력
		int t = scan.nextInt();
		// 네 개의 정수를 공백으로 구분해서 입력받기
		int[][] arr = new int[t][5];
		for(int i=0;i<t;i++) {
			for(int j=0;j<4;j++) {
				// M N x y 순
				arr[i][j]=scan.nextInt();
			}
			
			// 각 테스트 데이터에 대해 k(=arr[t][5])번째 해인지 계산
			while(arr[i][2]==0||arr[i][3]==0) {
				++arr[i][5];
				if(arr[i][2]<arr[i][0]) --arr[i][2];
				else if(arr[i][2]>=arr[i][0]) arr[i][2]=1;
					
				if(arr[i][3]<arr[i][1]) --arr[i][3];
				else if(arr[i][3]>=arr[i][1]) arr[i][3]=1;
			}
		}
		
		// 표준 출력
		
		// 유효하지 않으면 -1 
	}

}
