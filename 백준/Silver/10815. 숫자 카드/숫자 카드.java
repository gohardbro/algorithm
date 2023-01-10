import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 숫자 카드
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final int N = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 숫자 카드의 개수
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        final int M = Integer.parseInt(br.readLine()); // 확인해야할 카드 개수
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            if (set.contains(Integer.parseInt(st.nextToken())))
                sb.append(1).append(" ");
            else
                sb.append(0).append(" ");
        }

        System.out.println(sb);
    }
}
