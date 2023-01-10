import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 벌집
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());
        int cnt = 1; // 최소 방 카운트
        int range = 2; // 최소 겹수

        if (N == 1) {
            System.out.print(1);
        } else {
            while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * cnt);
                cnt++;
            }
            System.out.print(cnt);
        }
    }
}
