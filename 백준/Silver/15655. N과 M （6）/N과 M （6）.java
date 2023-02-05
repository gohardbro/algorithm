import java.io.*;
import java.util.*;

public class Main {
    private static int N, M;
    private static int[] nums;
    private static int[] arr;
    private static boolean[] isVisited;
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        nums = new int[N];
        arr = new int[M];
        isVisited = new boolean[N];
        
        // 입력숫자 배열에 저장
        s = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        
        Arrays.sort(nums);
        
        sol(0, 0);
        
        System.out.println(sb);
    }
    
    private static void sol(int index, int depth) {
        // 종료조건
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            
            sb.append("\n");
            return;
        }
        
        for (int i=index; i<N; i++) {
            if (isVisited[i]) continue;
            
            isVisited[i] = true;
            arr[depth] = nums[i];
            sol(i+1, depth+1);
            isVisited[i] = false;
        }
    }
}