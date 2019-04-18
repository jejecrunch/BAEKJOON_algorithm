package inputAndOutput;

import java.util.Scanner;

public class InputOutput2_11719 {

	public static void main(String[] args) {
		// 입력 받은 대로 출력하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in); 

        while(scan.hasNextLine()){
            String s=scan.nextLine();
            System.out.println(s);
        }
        scan.close();
	}

}
