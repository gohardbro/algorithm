import java.io.*;

public class Main {
    private static int k; // 숫자 개수
    private static int[] nums; // 집합의 숫자들
    private static StringBuilder sb = new StringBuilder();
    private static boolean[] isVisited;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String readLine = br.readLine();
            
            if (readLine.equals("0")) break;
            
            String[] s = readLine.split(" ");
            k = Integer.parseInt(s[0]);
            nums = new int[k];
            isVisited = new boolean[k];
        
            // 입력숫자들 배열에 저장
            for (int i=0; i<k; i++) {
                nums[i] = Integer.parseInt(s[i+1]);
            }
        
            sol(0, 0);
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
    
    private static void sol(int index, int depth) {
        // 종료조건
        if (depth == 6) {
            for (int i=0; i<k; i++) {
                if (isVisited[i]) {
                    sb.append(nums[i]).append(" ");
                }
            }
            
            sb.append("\n");
            return;
        }
        
        // logic
        for (int i=index; i<k; i++) {
            if (isVisited[i]) continue;
            
            isVisited[i] = true;
            sol(i+1, depth+1);
            isVisited[i] = false;
        }
    }
    
}