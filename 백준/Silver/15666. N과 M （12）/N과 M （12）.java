import java.io.*;
import java.util.*;

public class Main {
    private static int N, M;
    private static int[] nums;
    private static int[] arr;
    private static Set<String> set = new LinkedHashSet<>();
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        nums = new int[N];
        arr = new int[M];
        
        s = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        
        Arrays.sort(nums);
        sol(0, 0);
        
        StringBuilder sb = new StringBuilder();
        for (String str : set) {
            sb.append(str).append("\n");
        }
        
        System.out.println(sb);
    }
    
    private static void sol(int index, int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            
            set.add(sb.toString());
            return;
        }
        
        for (int i=index; i<N; i++) {
            arr[depth] = nums[i];
            sol(i, depth+1);
        }
    }
}