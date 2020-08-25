package tree;

import java.util.*;

public class FindParentsByTree_11725 {
	
	static int[] parents;
	static List<Integer>[] list;
	static boolean[] visit;
	static int n;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// ��� ���� n
		n = s.nextInt();
		// �θ� ��� ����
		parents = new int[n+1];
		// �湮�ߴ��� �ľ�
		visit = new boolean[n+1];
		// ���Ḯ��Ʈ
		list = new ArrayList[n+1];

		for(int i = 1; i <= n; i++) list[i] = new ArrayList<>();
		// ù° �� ���� n-1° �ٱ��� ����� ���� �־���
		for(int i=0;i<n-1;i++) {
			// ����� �� ���� a, b
			int a = s.nextInt(), b = s.nextInt();
			list[a].add(b);
			list[b].add(a);
		}

		// ���� �켱 Ž��
		dfs(1);
		for(int i=2;i<=n;i++) System.out.println(parents[i]);

	}

	// ���� �켱 Ž��
	static void dfs(int v) {
		// ���� v�� �湮�����Ƿ� true�� ����
		visit[v] = true;

		// list[v]�� ���ƺ���
		for(int i : list[v]) {
			if(!visit[i]) { // ���� i�� �湮���� �ʾҴٸ�
				parents[i] = v; // parents�� v�� ����
				dfs(i); // �ٽ� dfs ȣ��
			}
		}
	}

}