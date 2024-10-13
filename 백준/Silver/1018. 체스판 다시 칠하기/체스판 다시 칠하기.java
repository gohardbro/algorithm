import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        int row = Integer.parseInt(s[0]);
        int col = Integer.parseInt(s[1]);
        String[] board = new String[row];
        
        for (int i = 0; i < row; i++) {
            board[i] = br.readLine(); 
        }

        int min = 64; 

        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) {
                int cnt = calCnt(i, j, board);
                if (cnt < min) min = cnt;
            }
        }

        System.out.println(min);
    }

    private static int calCnt(int startRow, int stratCol, String[] board) {
        String[] ans = {"BWBWBWBW", "WBWBWBWB"};
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i;

            for (int j = 0; j < 8; j++) {
                int col = stratCol + j;
                if (board[row].charAt(col) != ans[row%2].charAt(j)) cnt++;
            }
        }
        
        return Math.min(cnt, 64 - cnt);
    }
}
