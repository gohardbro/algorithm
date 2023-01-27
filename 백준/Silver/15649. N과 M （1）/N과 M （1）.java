import java.io.*;
/*
1. 아이디어
    - 백트래킹 재귀함수 안에서, for 돌면서 숫자 선택(이때 방문여부 확인)
    - 재귀함수에서 M개를 선택할경우 print

2. 시간복잡도
    - N! > 가능

3. 자료구조
    - 결과값 저장 int[]
    - 방문여부 확인 boolean[]
*/

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static int[] arr; // 결과 배열
    private static boolean[] isVisited; // 방문 여부
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        final int N = Integer.parseInt(s[0]);
        final int M = Integer.parseInt(s[1]);
        
        arr = new int[M]; 
        isVisited = new boolean[N]; 
        
        sol(N, M);
        
        System.out.println(sb);
    }
    
    private static void sol(int N, int M) {
        sol(N, M, 0);
    }
    
    private static void sol(int N, int M, int depth) {
        // 종료 조건
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            
            sb.append("\n");
            return;
        }
        
        // logic
        for (int i=0; i<N; i++) {
            if (isVisited[i]) continue; // 방문한 숫자면 스킵
            // 아니면 숫자 저장 
            arr[depth] = i+1;
            isVisited[i] = true;
            sol(N, M, depth + 1);
            // 재귀가 마지막 depth 까지 실행되었을때 root 숫자 방문여부를 false로 초기화
            isVisited[i] = false;
        }
        
    }
}