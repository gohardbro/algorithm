import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 10
public class Main {
    private static char[][] block;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());
        block = new char[N][N];

        sol(N);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(block[i][j]);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void sol(int N) {
        int x = 0;
        int y = 0;
        boolean isBlanck = false;
        sol(x, y, N, isBlanck);
    }

    private static void sol(int x, int y, int N, boolean isBlanck) {
        if (isBlanck) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    block[i][j] = ' ';
                }
            }
            return;
        }

        if (N == 1) {
            block[x][y] = '*';
            return;
        }

        int size = N / 3;
        int cnt = 0;
        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                cnt++;
                sol(i, j, size, cnt == 5);
            }
        }
    }

}
