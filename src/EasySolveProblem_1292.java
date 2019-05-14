import java.io.*;
import java.util.*;

public class EasySolveProblem_1292 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		int cnt=0, sum=0;
		for(int i=1;i<=a2;) {
			++cnt;
			for(int j=1;j<=cnt;++j) {
				if(a1<=i&&i<=a2)
					sum+=cnt;
				++i;
			}
		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
	}

}
