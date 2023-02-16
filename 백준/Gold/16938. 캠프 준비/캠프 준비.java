import java.io.*;
import java.util.*;

public class Main {
    private static int N, L, R, X;
    private static int cnt = 0;
    private static int[] nums;
    
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
        
        Arrays.sort(nums);
        
        sol(0, 0, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        
        System.out.println(cnt);
    }
    
    private static void sol(int index, int sum, int depth, int min, int max) {
        if (depth >= 2) {
            if (sum >= L && sum <= R && max - min >= X) cnt++;
        }
        
        for (int i=index; i<N; i++) {
            sol(i+1, sum+nums[i], depth+1, Math.min(min, nums[i]), Math.max(max, nums[i]));
        }
    }
}