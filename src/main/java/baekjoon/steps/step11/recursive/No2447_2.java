package baekjoon.steps.step11.recursive;

import java.io.*;

// 별 찍기 - 10
// 다시 풀어봄 1
public class No2447_2 {
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
        }

        System.out.println(sb);
    }

    private static void sol(int N) {
        sol(0, 0, N, false);
    }

    private static void sol(int x, int y, int N, boolean isBlank) {
        if (isBlank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    block[x][y] = ' ';
                }
            }
            return;
        }

        if (N == 1) {
            block[x][y] = '*';
            return;
        }

        int size = N/3;
        int cnt = 0;

        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < j + N; j += size) {
                cnt++;
                sol(i, j, size, cnt == 5);
            }
        }
    }
}