import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 체스판 다시 칠하기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        final int ROW = Integer.parseInt(st.nextToken());
        final int COL = Integer.parseInt(st.nextToken());
        String[] board = new String[ROW];

        for (int i = 0; i < ROW; i++) {
            board[i] = br.readLine();
        }

        int min = Integer.MAX_VALUE;
        // 자를 체스판 왼쪽위 시작 기준점
        for (int i = 0; i <= ROW-8; i++) {
            for (int j = 0; j <= COL-8; j++) {
                // 현재 체스판 최소값 구하기
                int curMin = calMin(i, j, board);

                if (curMin < min) min = curMin;
            }
        }

        System.out.println(min);
    }

    private static int calMin(int startRow, int startCol, String[] board) {
        // 첫 체스칸이 W로 시작하는 경우 값 구하기
        String[] originBoard = {"WBWBWBWB", "BWBWBWBW"}; // 정답
        int fillCnt = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i;

            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                if (board[row].charAt(col) != originBoard[row%2].charAt(j)) fillCnt++;
            }
        }
        // 8*8=64, 64 - W체스판 색칠 카운트 = B체스판 색칠 카운트
        return Integer.min(fillCnt, 64-fillCnt);
    }
}
