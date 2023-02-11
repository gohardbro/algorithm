import java.io.*;

public class Main {
    private static int N; // 수열의 크기
    private static int S; // 부분수열을 더한 목표값
    private static int[] nums; // 입력된 수열
    private static int cnt = 0;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        
        N = Integer.parseInt(str[0]);
        S = Integer.parseInt(str[1]);
        nums = new int[N];
        
        // 입력한 수열 저장
        str = br.readLine().split(" ");
        
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        
        sol(0, 0);
        /* S 가 0 인 경우, sol(); 에서 아무것도 안골랐을때 
        sum=0, S=0 이라 카운트조건인 sum==S 가 ture가 되어 cnt가 오르기때문에 
        그 경우 카운트하지 않기 위해 -1 해준다*/
        if (S==0) System.out.println(cnt-1);  
        else System.out.println(cnt);
    }
    
    private static void sol(int sum, int depth) {
        // 종료조건
        if (depth == N) {
            if (sum == S) cnt++;
            return;
        }
        
        // logic
        sol(sum + nums[depth], depth+1); // 숫자를 고르거나
        sol(sum, depth+1); // 고르지 않거나
    }
}