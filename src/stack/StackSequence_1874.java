package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence_1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine()); // 수열 크기
		int num = 1; // 1~n이 되는 수
		int[] arr = new int[n]; // 수열이 저장될 배열
		
		boolean able = true; // 가능한지
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			// 수열 입력
			arr[i]=Integer.parseInt(br.readLine());
			
			if(able){
				if(num <= arr[i]) {
					while(num <= arr[i]) {
						stack.push(num++);
						sb.append("+\n");
					}
				}
				if(stack.isEmpty()) able = false;
				else {
					while(stack.peek() >= arr[i]) { // 스택의 top이 arr[i]보다 작아질 때까지
						stack.pop(); // pop 실행
						sb.append("-\n");
						if(stack.isEmpty()) { // 스택에 값이 없으면 반복문 멈추기
							break;
						}
					}
				}
			}
		}
		
		if(able) {
			System.out.println(sb.toString());
		} else {
			System.out.println("NO");
		}
	}

}
