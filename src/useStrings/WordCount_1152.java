package useStrings;

import java.util.Scanner;

public class WordCount_1152 {

	public static void main(String[] args) {
		// ���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
		Scanner scan = new Scanner(System.in); 
        String input=scan.nextLine().trim();
        scan.close();
        
        if(input.isEmpty()){
            System.out.println(0);
        } else {
            System.out.println(input.split(" ").length);
        }
	}

}
