import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final StringBuilder sb = new StringBuilder();
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        final int N = Integer.parseInt(input[0]);
        final int M = Integer.parseInt(input[1]);
        arr = new int[M];

        sol(N, M);
        System.out.println(sb);
    }

    public static void sol(int N, int M) {
        sol(N, M, 0);
    }

    public static void sol(int N, int M, int depth) {
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=0; i<N; i++) {
            arr[depth] = i+1;
            sol(N, M, depth+1);
        }
    }
}
