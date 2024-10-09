import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int ROW = Integer.parseInt(st.nextToken());
        final int COL = Integer.parseInt(st.nextToken());

        int min = 64;

        String[] board = new String[ROW];
        for (int i = 0; i < ROW; i++) {
            board[i] = br.readLine();
        }

        for (int i = 0; i < ROW - 7; i++) {
            for (int j = 0; j < COL - 7; j++) {
                int cnt = calFillCnt(i, j, board);
                if (cnt < min) min = cnt;
            }
        }

        System.out.println(min);
    }

    private static int calFillCnt(int startRow, int startCol, String[] board) {
        String[] ans = {"BWBWBWBW", "WBWBWBWB"};
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i;

            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                if (board[row].charAt(col) != ans[row%2].charAt(j)) cnt++;
            }
        }

        return Integer.min(cnt, 64 - cnt);
    }
}
