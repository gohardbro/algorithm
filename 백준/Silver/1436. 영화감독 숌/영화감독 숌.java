import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 영화감독 숌
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int targetNum = 665;

        while (cnt != N) {
            targetNum++;

            if (String.valueOf(targetNum).contains("666")) {
                cnt++;
            }
        }

        System.out.println(targetNum);
    }
}
