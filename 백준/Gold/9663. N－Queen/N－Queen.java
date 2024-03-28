import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] chessIndex;
    private static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        chessIndex = new int[N];

        sol(N);
        System.out.println(cnt);
    }

    private static void sol(int N) {
        sol(N, 0);
    }

    private static void sol(int N, int row) {
        if (row == N) {
            cnt++;
            return;
        }

        for (int i=0; i<N; i++) {
            chessIndex[row] = i;

            if (isPossible(row))
                sol(N, row+1);
        }
    }

    private static boolean isPossible(int row) {
        for (int i=0; i<row; i++) {
            if (chessIndex[i] == chessIndex[row]) return false; // 십자 비교
            if (Math.abs(row - i) == Math.abs(chessIndex[row] - chessIndex[i])) return false; // 대각선 비교
        }

        return true;
    }
}
