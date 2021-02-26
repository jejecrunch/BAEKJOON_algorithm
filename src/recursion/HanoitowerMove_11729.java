package recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HanoitowerMove_11729 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int n = Integer.parseInt(bf.readLine()); // Int : 원판의 개수

		System.out.println((int) Math.pow(2, n) - 1);
		f(1, 3, n);
		bw.close();
	}

	private static void f(int from, int to, int n) throws IOException {
		if (n > 0) {
			f(from, 6 - (from + to), n - 1);
			bw.write(from + " " + to + "\n");
			f(6 - (from + to), to, n - 1);
		}
	}
}
