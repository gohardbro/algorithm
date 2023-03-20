import java.io.*;

public class MyClass {
    private static int R, C;
    private static char[][] alphabets;
    private static boolean[] isVisited;
    private static int max = Integer.MIN_VALUE;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        R = Integer.parseInt(s[0]);
        C = Integer.parseInt(s[1]);
        alphabets = new char[R][C];
        isVisited = new boolean[26]; // 알파벳 개수 크기의 방문여부 확인배열

        // 입력 알파벳들 배열에 저장
        for (int i=0; i<R; i++) {
            String str = br.readLine();
            for (int j=0; j<C; j++) {
                alphabets[i][j] = str.charAt(j);
            }
        }

        isVisited[(int) alphabets[0][0] - 'A'] = true;

        sol(0, 0, 1);

        System.out.println(max);
    }

    private static void sol(int row, int col, int cnt) {
        boolean isExistNext = false; // 다음 갈수있는 칸이 있나

        if (row < R-1) {
            int index = alphabets[row+1][col] - 'A';

            if (!isVisited[index]) {
                isVisited[index] = true;
                isExistNext = true;

                sol(row+1, col, cnt+1);
                isVisited[index] = false;
            }
        }
        if (row > 0) {
            int index = alphabets[row-1][col] - 'A';

            if (!isVisited[index]) {
                isVisited[index] = true;
                isExistNext = true;

                sol(row-1, col, cnt+1);
                isVisited[index] = false;
            }
        }
        if (col < C-1) {
            int index = alphabets[row][col+1] - 'A';

            if (!isVisited[index]) {
                isVisited[index] = true;
                isExistNext = true;

                sol(row, col+1, cnt+1);
                isVisited[index] = false;
            }
        }
        if (col > 0) {
            int index = alphabets[row][col-1] - 'A';

            if (!isVisited[index]) {
                isVisited[index] = true;
                isExistNext = true;

                sol(row, col-1, cnt+1);
                isVisited[index] = false;
            }
        }

        if (!isExistNext) {
            if (cnt > max) max = cnt;
            return;
        }

    }
}