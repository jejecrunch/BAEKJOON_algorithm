package math2;
import java.util.*;

public class Terret_1002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 테스트 개수
		int tco = scan.nextInt();
		int[][] t = new int[tco][7];
		
		// 반복문으로 테스트케이스 받기
		for(int i=0;i<tco;i++) {
			// x1, y1, r1, x2, y2, r2 순으로 입력받음
			for(int j=0;j<6;j++) {
				t[i][j]=scan.nextInt();
			}
			// 두 반지름의 합
			double sum=t[i][2]+t[i][5];
			// 두 반지름의 차
			double min=Math.abs(t[i][2]-t[i][5]);
			// 중심거리 d
			double d = Math.sqrt(Math.pow(t[i][0]-t[i][3],2) + Math.pow(t[i][1]-t[i][4], 2));
			
			if(d==0 && min==0) t[i][6]=-1;
			else if(d<min || d>sum) t[i][6]=0;
			else if(d==min || d==sum) t[i][6]=1;
			else t[i][6]=2;
		}

		// 위치의 개수 출력
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i][6]);
		}
		
	}

}
