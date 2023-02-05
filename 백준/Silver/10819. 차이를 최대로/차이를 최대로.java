import java.io.*;

public class Main {
    private static int N;
    private static int[] nums;
    private static int[] arr;
    private static boolean[] isVisited;
    private static int max = Integer.MIN_VALUE;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        arr = new int[N];
        isVisited = new boolean[N];
        
        // 입력숫자들 배열에 저장
        String[] s = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        
        sol(0);
        
        System.out.println(max);
    }
    
    private static void sol(int depth) {
        // 종료조건
        if (depth == N) {
            
            int result = 0;
            for (int i=0; i<N-1; i++) {
                /* 문제 예시 |A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]| 에서
                || 이 기호는 절대값을 의미한다.*/
                result += Math.abs(arr[i] - arr[i+1]);
            }
            
            if (result > max) max = result;
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