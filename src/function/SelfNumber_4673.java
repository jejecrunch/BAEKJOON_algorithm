package function;

public class SelfNumber_4673 {

	public static void main(String[] args) {
		boolean[] arr = new boolean[101];
		for(int i=1;i<101;i++) {
			arr[selfNumCheck(i)]=true;
		}
		
		for(int i=1;i<101;i++) {
			if(!arr[i]) System.out.println(i);
		}

	}
	
	private static int selfNumCheck(int a) {
		if(a/10==0) return a;
		else if(a/100==0) return a+(a/10)+(a%10);
		else if(a/1000==0) return a+(a/100)+(a%100/10)+(a%100%10);
		else if(a/10000==0) return a+(a/1000)+(a%1000/100)+(a%1000%100/10)+(a%1000%100%10);
		else return 0;
	}

}
