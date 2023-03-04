
import java.io.*;

public class MyClass {
    private static int N;
    private static int[] arr;
    private static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        dfs(0);

        System.out.println(cnt);
    }

    private static void dfs(int depth) {
        // 종료조건
        if (depth == N) {
            cnt++;
            return;
        }

        // logic
        for (int i=0; i<N; i++) {
            arr[depth] = i;

            if (isPossible(depth))
                dfs(depth+1);
        }
    }

    private static boolean isPossible(int col) {
        for (int i=0; i<col; i++) {
            //  같은 행이면 false
            if (arr[col] == arr[i]) return false;
            // 대각선 공격범위에 위치하면 false
            if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) return false;
        }

        return true;
    }
}