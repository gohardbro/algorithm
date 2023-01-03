import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분해합
// + 최적화
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int constructor = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            sum += i;

            if (sum == n) {
                constructor = i;
                break;
            }
        }

        System.out.println(constructor);
    }
}
