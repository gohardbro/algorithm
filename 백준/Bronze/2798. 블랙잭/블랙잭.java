import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블랙잭
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        final int N = Integer.parseInt(st.nextToken()); // 카드 개수
        final int M = Integer.parseInt(st.nextToken()); // 딜러 숫자

        String[] split = br.readLine().split(" ");
        int max = 0;

        for (int i = 0; i < N-2; i++) { // 첫번째
            int num1 = Integer.parseInt(split[i]);

            for (int j = i+1; j < N-1; j++) { // 두번째
                int num2 = Integer.parseInt(split[j]);

                for (int k = j+1; k < N; k++) { // 세번째
                    int num3 = Integer.parseInt(split[k]);
                    int sum = num1 + num2 + num3;

                    if (sum <= M && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
