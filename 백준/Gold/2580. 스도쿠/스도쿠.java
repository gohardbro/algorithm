import java.io.*;

public class Main {
    private static int[][] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        arr = new int[9][9];
        
        // 입력값 배열에 저장
        for (int i=0; i<9; i++) {
            String[] s = br.readLine().split(" ");
            
            for (int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(s[j]);    
            }
        }
        
        sol(0, 0);
    }
    
    private static void sol(int row, int col) {
        // 종료조건
        // 마지막 행까지 탐색했을때 출력 후 종료
        if (row == 9) {
            StringBuilder sb = new StringBuilder();
            
            for (int i=0; i<9; i++) {
                for (int j=0; j<9; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                
                sb.append("\n");
            }
            
            System.out.println(sb);
            
            System.exit(0);
        }
        
        // 한 행 탐색후 다음행 탐색
        if (col == 9) {
            sol(row + 1, 0);
            return;
        }
        
        // logic
        // 한 행에서 해당 열의 숫자가 0, 즉 빈칸일 경우, 다른 열의 칸과 비교해서 가능한 숫자면 저장
        if (arr[row][col] == 0) {
            
            for (int i=1; i<=9; i++) {
                
                if (isPossible(row, col, i)) {
                    arr[row][col] = i;
                    sol(row, col + 1);
                }
            }
            
            arr[row][col] = 0;
            return;
        }
        
        sol(row, col + 1);
    }
    
    // 빈칸에 해당숫자가 가능한지 boolean 으로 반환
    private static boolean isPossible(int row, int col, int val) {
        
        for (int i=0; i<9; i++) {
            // 해당 행에서 다른 열과 중복 비교
            if (arr[row][i] == val) return false;
            
            // 해당 열에서 다른 행과 중복 비교
            if (arr[i][col] == val) return false;
        }
        
        // 해당 위치가 속한 블럭에서 중복 비교
        int blockStartRow = row / 3 * 3;
        int blockStartCol = col / 3 * 3;
        
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (arr[blockStartRow + i][blockStartCol + j] == val) return false;
            }
        }
        
        return true;
    }
}