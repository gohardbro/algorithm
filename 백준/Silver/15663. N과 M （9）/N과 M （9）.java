import java.io.*;
import java.util.*;

public class Main {
    private static int N, M;
    private static int[] nums;
    private static int[] arr;
    private static boolean[] isVisited;
    // 오름차순 순서를 유지해야하기때문에 순서가있는 LinkedHashSet을 사용
    private static Set<String> set = new LinkedHashSet<>();
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        nums = new int[N];
        arr = new int[M];
        isVisited = new boolean[N];
        
        s = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        
        Arrays.sort(nums);
        
        sol(0);
        
        for (String str : set) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
    
    private static void sol(int depth) {
        // 종료조건
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int n : arr) {
                sb.append(n).append(" ");
            }
            
            set.add(sb.toString());
            return;
        }
        
        // logic
        for (int i=0; i<N; i++) {
            if (isVisited[i]) continue;
            
            isVisited[i] = true;
            arr[depth] = nums[i];
            sol(depth+1);
            isVisited[i] = false;
        }
    }
}