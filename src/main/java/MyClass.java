// 알파벳
/* 인접 문자를 모두 검사해서 방문하지 않은 문자만 방문하면서 카운팅한다.
 더 이상 방문가능한 문자가 없으면 max 와 비교 저장한다*/
import java.io.*;

public class MyClass {
    private static int R, C;
    private static char[][] alphabets;
    // private static String picked = ""; // 고른 알파벳
    private static boolean[] isVisited;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
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

        // 0, 0 위치의 문자에서부터 시작하기 때문에 첫 문자는 방문했다고 저장한다.
        isVisited[(int) alphabets[0][0] - 'A'] = true; // 해당 칸의 문자 - 'A' = isVisited 배열의 index

        sol(0, 0, 1);

        System.out.println(max);
    }

    private static void sol(int row, int col, int cnt) {
        boolean isExistNext = false; // 다음 갈수있는 칸이 있나

        // logic
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

        // 종료조건
        if (!isExistNext) {
            if (cnt > max) max = cnt;
            return;
        }

    }

}