import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple_1629 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //¼±¾ð
		String[] s = bf.readLine().split(" "); //String
		long multiply=Integer.parseInt(s[0])%Integer.parseInt(s[2]);
		long temp=1;
		
		
		while (Integer.parseInt(s[1])>0) {
			if(Integer.parseInt(s[1])%2==1) {
				temp*=multiply;
				temp%=Integer.parseInt(s[2]);
			}
			
			multiply=((multiply%Integer.parseInt(s[2]))*(multiply%Integer.parseInt(s[2])))%Integer.parseInt(s[2]);
			s[1]=Integer.toString(Integer.parseInt(s[1])/2);
		}

		System.out.println(temp);
	}

}
