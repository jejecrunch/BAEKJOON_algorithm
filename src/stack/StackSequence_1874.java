package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence_1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine()); // ���� ũ��
		int num = 1; // 1~n�� �Ǵ� ��
		int[] arr = new int[n]; // ������ ����� �迭
		
		boolean able = true; // ��������
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			// ���� �Է�
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
					while(stack.peek() >= arr[i]) { // ������ top�� arr[i]���� �۾��� ������
						stack.pop(); // pop ����
						sb.append("-\n");
						if(stack.isEmpty()) { // ���ÿ� ���� ������ �ݺ��� ���߱�
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
