import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 대칭 차집합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        final int A = Integer.parseInt(st.nextToken());
        final int B = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < A; i++) {
            set.add(st.nextToken());
        }

        int intersectionCnt = 0; // 교집합 개수
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < B; i++) {
            if (set.contains(st.nextToken()))
                intersectionCnt++;
        }

        // 교집합 개수를 각각 집합에서 빼주면 된다
        System.out.println(A-intersectionCnt + B-intersectionCnt);
    }
}
