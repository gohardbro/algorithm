import java.io.*;
// N과 M (2)
/*
1. 아이디어
    - dfs로 재귀함수를 이용 백트래킹
    - 재귀 depth == M 이면 종료
    - 가지치기: 방문한 숫자는 탐색제외로 
    - 결과수열이 중복 불가이기 때문에 재귀호출 logic에서 부모노드+1 숫자부터 탐색해야한다.

2. 시간복잡도
    - n!
    
3. 자료구조
    - 결과값 저장 int[] arr
    - 방문여부 확인 boolean[] isVisited
*/
public class Main {
    private static int N, M;
    private static int[] arr;
    private static boolean[] isVisited;
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        arr = new int[M];
        isVisited = new boolean[N];
        
        dfs(0, 0);
        
        System.out.println(sb);
    }
    
    private static void dfs(int nowNum, int depth) {
        // 종료조건
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            
            sb.append("\n");
            return;
        }
    
        // logic
        for (int i=nowNum; i<N; i++) {
            if (isVisited[i]) continue;
            
            isVisited[i] = true;
            arr[depth] = i+1;
            dfs(i+1, depth+1);
            isVisited[i] = false;
        }
    }
}