import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final int N = Integer.parseInt(br.readLine());
        int[][] infos = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            infos[i][0] = Integer.parseInt(st.nextToken());
            infos[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int[] info : infos) {
            int biggerCnt = 0;

            for (int i = 0; i < N; i++) {
                if (info[0] < infos[i][0] && info[1] < infos[i][1])
                    biggerCnt++;
            }

            sb.append(biggerCnt + 1).append(" ");
        }

        System.out.println(sb);
    }
}
