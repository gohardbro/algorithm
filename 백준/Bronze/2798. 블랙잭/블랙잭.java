import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블랙잭
// + 최적화
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        final int N = Integer.parseInt(st.nextToken()); // 카드 개수
        final int M = Integer.parseInt(st.nextToken()); // 딜러 숫자

        st = new StringTokenizer(br.readLine(), " ");
        int[] cardArr = new int[N];

        for (int i = 0; i < N; i++) {
            cardArr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        for (int i = 0; i < N-2; i++) { // 첫번째
            if (cardArr[i] > M) continue;

            for (int j = i+1; j < N-1; j++) { // 두번째
                if (cardArr[i] + cardArr[j] > M) continue;

                for (int k = j+1; k < N; k++) { // 세번째
                    int sum = cardArr[i] + cardArr[j] + cardArr[k];

                    if (sum <= M && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
