package queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Queue2_18258 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine()); // 명령 수 
		Queue2 que = new Queue2(size); 

		for(int i=0;i<size;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 명령
			String cmd = st.nextToken();

			if(cmd.contains("push")) {
				que.push(Integer.parseInt(st.nextToken()));
			}else if(cmd.equals("pop")) {
				que.pop();
			} else if(cmd.equals("size")) {
				que.size();
			} else if(cmd.equals("empty")) {
				que.empty();
			} else if(cmd.equals("front")) {
				que.front();
			} else if(cmd.equals("back")) {
				que.back();
			}
		}


		que.bw.flush();
	}
}

class Queue2 {
	int[] queue;
	int next=0;
	int first=0;
	BufferedWriter bw;

	Queue2(int n){
		queue = new int[n];
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	void push(int n) {
		queue[next]=n;
		next++;
	}

	void pop() throws IOException {
		if(next == first) {
			bw.write("-1");
		} else {
			bw.write(queue[first]+"");
			queue[first]=0;
			first++;
		}
		bw.newLine();
	}

	void size() throws IOException {
		bw.write(next-first+"");
		bw.newLine();
	}

	void empty() throws IOException {
		if(next == first) {
			bw.write("1");
		} else {
			bw.write("0");
		}
		bw.newLine();
	}

	void front() throws IOException {
		if(next == first) {
			bw.write("-1");
		} else {
			bw.write(queue[first] + "");
		}
		bw.newLine();
	}

	void back() throws IOException {
		if(next == first) {
			bw.write("-1");
		} else {
			bw.write(queue[next-1] + "");
		}
		bw.newLine();
	}

}
