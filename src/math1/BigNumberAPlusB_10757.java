package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigNumberAPlusB_10757 {

	public static void main(String[] args) throws IOException {
		// ó���� �õ������� package �����ؼ� �����ؼ� ��Ÿ�ӿ��� ��
		/*Scanner scan = new Scanner(System.in);

		String s1 = scan.next();
		String s2 = scan.next();
		
		BigInteger a = new BigInteger(s1);
		BigInteger b = new BigInteger(s2);
		
		System.out.println(a.add(b));*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		System.out.println(new BigInteger(arr[0]).add(new BigInteger(arr[1])));
	}

}
