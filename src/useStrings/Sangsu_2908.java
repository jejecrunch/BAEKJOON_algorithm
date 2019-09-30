package useStrings;
import java.util.*;

public class Sangsu_2908 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String a=s.nextLine();
		String[] temp=a.split(" ");
		
		char tmp=temp[0].charAt(0);
		temp[0]=temp[0].replace(temp[0].charAt(0), temp[0].charAt(2)).substring(0, 2);
		temp[0]+=tmp;
		
		tmp=temp[1].charAt(0);
		temp[1]=temp[1].replace(temp[1].charAt(0), temp[1].charAt(2)).substring(0, 2);
		temp[1]+=tmp;
		
		if(Integer.parseInt(temp[0]) >= Integer.parseInt(temp[1])) {
			System.out.println(temp[0]);
		} else
			System.out.println(temp[1]);
	}

}
