import java.io.*;

public class MyClass {
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[9][9];

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

        if (col == 9) {
            sol(row + 1, 0);
            return;
        }

        // logic
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

    private static boolean isPossible(int row, int col, int val) {

        for (int i=0; i<9; i++) {
            if (arr[row][i] == val) return false;
            if (arr[i][col] == val) return false;
        }

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