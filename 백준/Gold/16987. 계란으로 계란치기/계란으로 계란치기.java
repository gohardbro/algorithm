import java.io.*;

public class Main {
    private static int N;
    private static int[] hp;
    private static int[] weight;
    private static int max = Integer.MIN_VALUE;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        hp = new int[N];
        weight = new int[N];
        
        for (int i=0; i<N; i++) {
            String[] s = br.readLine().split(" ");
            hp[i] = Integer.parseInt(s[0]);
            weight[i] = Integer.parseInt(s[1]);
        }
        
        sol(0, 0);
        
        System.out.println(max);
    }
    
    private static void sol(int cnt, int depth) {
        if (depth == N) {
            if (cnt > max) max = cnt;
            return;
        }
        // 손에있는 계란이 깨진계란이거나, 모든계란이 깨져있다면 다음계란잡기
        if (hp[depth] < 1 || cnt == N-1) {
            sol(cnt, depth+1);
            return;
        }
        
        int nowCnt = cnt;
        for (int i=0; i<N; i++) {
            if (depth == i || hp[i] < 1) continue;
            
            hp[depth] -= weight[i]; // 현재 들고있는 계란 hp
            hp[i] -= weight[depth]; // 때려지는 계란 hp
            
            if (hp[depth] < 1) cnt++;
            if (hp[i] < 1) cnt++;
            sol(cnt, depth+1);
            
            // 다시 복구
            hp[depth] += weight[i]; 
            hp[i] += weight[depth];
            cnt = nowCnt;
        }
    }
}