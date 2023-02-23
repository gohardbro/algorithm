import java.io.*;

public class Main {
    private static int N;
    private static int[] arr;
    private static boolean[] isVisited;
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        isVisited = new boolean[N+1]; // index 1 부터 쓰기 위해 N+1 함
        
        sol(0);
        
        System.out.println(sb);
    }
    
    private static void sol(int depth) {
        if (depth == N) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            
            sb.append("\n");
            return;
        }
        
        for (int i=1; i<=N; i++) {
            if (isVisited[i]) continue;
            
            isVisited[i] = true;
            arr[depth] = i;
            
            sol(depth+1);
            
            isVisited[i] = false;
        }
    }
}