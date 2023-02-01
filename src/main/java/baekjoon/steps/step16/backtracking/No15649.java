package baekjoon.steps.step16.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// N과 M (1)
/*
1. 아이디어
    - 백트래킹 재귀함수 안에서, for 돌면서 숫자 선택(이때 방문여부 확인)
    - 재귀함수에서 M개를 선택할경우 print

2. 시간복잡도
    - N! > 가능

3. 자료구조
    - 결과값 저장 int[]
    - 방문여부 확인 boolean[]
*/
public class No15649 {
    private static int[] arr;
    private static boolean[] check;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        final int N = Integer.parseInt(s[0]);
        final int M = Integer.parseInt(s[1]);

        arr = new int[N+1];
        check = new boolean[N+1];

        sol(N, M);

        System.out.println(sb);
    }

    private static void sol(int N, int M) {
        sol(N, M, 0);
    }

    private static void sol(int N, int M, int index) {
        if (index == M) {
            for (int i=0; i<M; i++) {
                sb.append(arr[i]).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i=1; i<=N; i++) {
            if (check[i]) continue;
            arr[index] = i;
            check[i] = true;
            sol(N, M, index+1);
            check[i] = false;
        }

    }
}
