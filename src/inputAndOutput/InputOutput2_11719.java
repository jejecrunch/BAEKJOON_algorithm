package inputAndOutput;

import java.util.Scanner;

public class InputOutput2_11719 {

	public static void main(String[] args) {
		// �Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner scan = new Scanner(System.in); 

        while(scan.hasNextLine()){
            String s=scan.nextLine();
            System.out.println(s);
        }
        scan.close();
	}

}
