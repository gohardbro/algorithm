// N과 M (3)
/*
1. 아이디어
    - dfs로 탐색, logic : 다음 depth로 넘어갈때마다 동일하게 1 ~ N 까지 저장, 종료조건: depth == M
2. 시간복잡도
    - n^n
3. 자료구조
    - 결과값 저장 int[]
*/
import java.io.*;

public class Main {
    private static int N, M;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        arr = new int[M];
        
        dfs(0);
        
        System.out.println(sb);
    }
    
    private static void dfs(int depth) {
        // 종료조건
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            
            sb.append("\n");
            return;
        }
        
        // logic
        for (int i=0; i<N; i++) {
            arr[depth] = i+1;
            dfs(depth+1);
        }
    }
}