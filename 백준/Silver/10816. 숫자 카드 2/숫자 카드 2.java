import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 숫자 카드 2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final int N = Integer.parseInt(br.readLine()); // 상근이의 카드 개수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // key: 상근이 카드, value: key 카드의 개수
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());

            map.putIfAbsent(key, 0);
            map.put(key, map.get(key)+1);
        }

        final int M = Integer.parseInt(br.readLine()); // 확인해야할 카드 개수
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            Integer cardCnt = map.get(Integer.parseInt(st.nextToken()));
            if (cardCnt == null)
                sb.append(0).append(" ");
            else
                sb.append(cardCnt).append(" ");
        }

        System.out.println(sb);
    }
}
