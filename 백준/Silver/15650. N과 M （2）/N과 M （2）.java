import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final StringBuilder sb = new StringBuilder();
    private static boolean[] isVisited; // 숫자 방문여부
    private static int[] arr; // 결과 숫자

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        isVisited = new boolean[N];
        arr = new int[M];

        sol(N, M);

        System.out.println(sb);
    }

    private static void sol(int N, int M) {
        sol(N, M, 0, 0);
    }

    private static void sol(int N, int M, int depth, int index) {
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=index; i<N; i++) {
            if (isVisited[i]) continue;

            isVisited[i] = true;
            arr[depth] = i+1;
            sol(N, M, depth+1, i+1);
            isVisited[i] = false;
        }
    }
}
