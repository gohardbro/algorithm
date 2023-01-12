package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// N과 M (1)
public class No15649 {

    private static boolean[] isVisited;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        final int N = Integer.parseInt(st.nextToken()); // 1~N 까지
        final int M = Integer.parseInt(st.nextToken()); // 중복없이 M개를 고른 수열 구하기

        isVisited = new boolean[N];
        arr = new int[M];

        dfs(N, M, 0);
        System.out.println(sb);
    }

    private static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                isVisited[i] = false;
            }
        }
    }
}
