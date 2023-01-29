/*
1. 아이디어
    - dfs 이용
    - 한 행이나 열에서 놓을수있는 칸에 체스놓기 재귀호출 반복
    - 종료조건: depth == N (즉, 체스를 다놓았을때)
    - 마지막 체스를 놓으면 카운트

2. 시간복잡도
    - n * n^n+1

3. 자료구조
    - 체스위치를 저장할 int[] : index = 행, value = 열
*/
import java.io.*;

public class Main {
    private static int N;
    private static int[] arr;
    private static int cnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        
        dfs(0);
        
        System.out.println(cnt);
    }
    
    private static void dfs(int depth) {
        // 종료조건
        if (depth == N) {
            cnt++;
            return;
        }
        
        // logic
        for (int i=0; i<N; i++) {
            arr[depth] = i;
            
            if (isPossible(depth))
                dfs(depth+1);
        }
    }
    
    // 가능한 칸 인지 확인
    private static boolean isPossible(int col) {
        //이전 열의 체스들 비교해서
        for (int i=0; i<col; i++) {
            //  같은 행이면 false
            if (arr[col] == arr[i]) return false; // arr[col] = 현재 깊이의 체스의 행 위치
            // 대각선 공격범위에 위치하면 false
            if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) return false;
        }
        
        return true;
    }
}