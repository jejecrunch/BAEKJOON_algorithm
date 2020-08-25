package tree;

import java.util.*;

public class FindParentsByTree_11725 {
	
	static int[] parents;
	static List<Integer>[] list;
	static boolean[] visit;
	static int n;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 노드 개수 n
		n = s.nextInt();
		// 부모 노드 저장
		parents = new int[n+1];
		// 방문했는지 파악
		visit = new boolean[n+1];
		// 연결리스트
		list = new ArrayList[n+1];

		for(int i = 1; i <= n; i++) list[i] = new ArrayList<>();
		// 첫째 줄 부터 n-1째 줄까지 연결된 정점 주어짐
		for(int i=0;i<n-1;i++) {
			// 연결된 두 정점 a, b
			int a = s.nextInt(), b = s.nextInt();
			list[a].add(b);
			list[b].add(a);
		}

		// 깊이 우선 탐색
		dfs(1);
		for(int i=2;i<=n;i++) System.out.println(parents[i]);

	}

	// 깊이 우선 탐색
	static void dfs(int v) {
		// 정점 v를 방문했으므로 true로 저장
		visit[v] = true;

		// list[v]를 돌아보고
		for(int i : list[v]) {
			if(!visit[i]) { // 정점 i를 방문하지 않았다면
				parents[i] = v; // parents에 v를 삽입
				dfs(i); // 다시 dfs 호출
			}
		}
	}

}