import java.io.*;

public class Main {
    private static int N; // 수의 개수
    private static int[] nums; // 주어진 숫자
    private static int[] operatorCnt = new int[4];
    private static int max = -1000000001;
    private static int min = 1000000001;
    private static int result;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        String[] s = br.readLine().split(" ");
        
        // 입력 숫자 저장
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        
        result = nums[0];
        s = br.readLine().split(" ");
        
        // 연산자 개수 저장
        for (int i=0; i<4; i++) {
            operatorCnt[i] = Integer.parseInt(s[i]);
        }
        
        sol(result, 0);
        
        sb.append(max).append("\n").append(min);
        
        System.out.println(sb);
    }
    
    private static void sol(int result, int depth) {
        // 종료조건
        if (depth == N-1) {
            if (max < result) max = result;
            if (min > result) min = result;
            return;
        }
        
        // logic
        for (int i=0; i<4; i++) {
            if (operatorCnt[i] > 0) {
                operatorCnt[i]--;
                
                switch (i) {
                    case 0:
                        sol(result + nums[depth+1], depth + 1);
                        break;
                    case 1:
                        sol(result - nums[depth+1], depth + 1);
                        break;
                    case 2:
                        sol(result * nums[depth+1], depth + 1);
                        break;
                    case 3:
                        sol(result / nums[depth+1], depth + 1);
                        break;
                }
                
                operatorCnt[i]++;
            }
        }
    }
}