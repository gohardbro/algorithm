// 스타트와 링크
import java.io.*;

public class Main {
    private static int N; // 사람 수
    private static int[][] arr; // 점수 표
    private static int min = Integer.MAX_VALUE;
    private static boolean[] isVisited;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        isVisited = new boolean[N];
        
        // 입력값 저장
        for (int i=0; i<N; i++) {
            String[] s = br.readLine().split(" ");
            
            for (int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        
        sol(0, 0);
        
        System.out.println(min);
    }
    
    private static void sol(int index, int depth) {
        if (depth == N/2) {
            calDiffNmin(); // 두팀 점수차이 구하고 최소값이랑 비교 후 저장하기
            return;
        }
        
        // logic
        for (int i=index; i<N; i++) {
            if (isVisited[i]) continue;
            
            isVisited[i] = true;
            sol(i+1, depth+1);
            isVisited[i] = false;
        }
    }
    
    private static void calDiffNmin() {
        int startTeamScore = 0;
        int linkTeamScore = 0;
        
        // 팀 점수 구하기
        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                // 두 명의 번호가 방문한 번호라면 start 팀에 점수합산 저장
                if (isVisited[i] == true && isVisited[j] == true) {
                    startTeamScore += arr[i][j] + arr[j][i];
                // 안고른 숫자는 link팀
                } else if (isVisited[i] == false && isVisited[j] == false) {
                    linkTeamScore += arr[i][j] + arr[j][i];
                }
            }  
        }
        
        // 팀 점수차 구하기
        int diff = Math.abs(startTeamScore - linkTeamScore); // 차이 절대값
        if (diff < min) min = diff;
    }
}