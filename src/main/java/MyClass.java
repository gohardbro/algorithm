// 알파벳
/* 인접 문자를 모두 검사해서 방문하지 않은 문자만 방문하면서 카운팅한다.
 더 이상 방문가능한 문자가 없으면 max 와 비교 저장한다*/
import java.io.*;

public class MyClass {
    private static int cnt = 0;
    private static int N;
    private static int[] hp;
    private static int[] weight;
    private static boolean[] isVisited;
    private static int max = Integer.MIN_VALUE;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        hp = new int[N];
        weight = new int[N];
        isVisited = new boolean[N];

        for (int i=0; i<N; i++) {
            String[] s = br.readLine().split(" ");
            hp[i] = Integer.parseInt(s[0]);
            weight[i] = Integer.parseInt(s[1]);
        }

        sol(0);

        System.out.println(cnt);
    }

    private static void sol(int depth) {
        if (depth == N) {
            if (cnt > max) max = cnt;
            return;
        }

        for (int i=0; i<N; i++) {
            if (depth == i) continue;
        }
    }

}