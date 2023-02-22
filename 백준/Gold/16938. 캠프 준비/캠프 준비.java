import java.io.*;

public class Main {
    private static int N, L, R, X;
    private static int[] nums;
    private static int cnt = 0;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        L = Integer.parseInt(s[1]);
        R = Integer.parseInt(s[2]);
        X = Integer.parseInt(s[3]);
        nums = new int[N];
        
        s = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        
        sol(0, 0, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        
        System.out.println(cnt);
    }
    
    private static void sol(int sum, int index, int depth, int min, int max) {
        if (depth > N) return;
        if (sum >= L && sum <= R && max - min >= X) {
            cnt++;
        }
        
        for (int i=index; i<N; i++) {
            sol(sum + nums[i], i+1, depth+1, Math.min(min, nums[i]), Math.max(max, nums[i]));
        }
    }
}