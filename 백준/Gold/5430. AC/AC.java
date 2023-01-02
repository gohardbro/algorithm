import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;
import java.util.StringTokenizer;

// AC
/*
  2
  R
  0
  []
  D
  1
  [12]
*/
// 위의 테스트 케이스가 결과가
/*
 []
 []
이렇게 나와야 한다.*/
public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String cmd = br.readLine(); // 명령어
            int n = Integer.parseInt(br.readLine()); // 수 개수

            Deque<Integer> deque = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");

            for (int j = 0; j < n; j++) {
                deque.offer(Integer.parseInt(st.nextToken()));
            }

            calAC(cmd, deque);
        }

        System.out.println(sb);
    }

    private static void calAC(String cmd, Deque<Integer> deque) {

        boolean isRightFront = false;

        for (int i = 0; i < cmd.length(); i++) {
            if (cmd.charAt(i) == 'R') { // 뒤집기
                isRightFront = !isRightFront;

            } else if (isRightFront) { // D 이면서 앞쪽이 오른쪽인 경우
                if (deque.pollLast() == null) {
                    sb.append("error\n");
                    return;
                }

            } else {
                if (deque.pollFirst() == null) {
                    sb.append("error\n");
                    return;
                }
            }
        }

        // 위의 결과가 error 가 아닐때 결과값 출력
        sb.append("[");

        if (!deque.isEmpty()) {
            if (isRightFront) {
                sb.append(deque.pollLast());

                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollLast());
                }

            } else {
                sb.append(deque.pollFirst());

                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollFirst());
                }
            }
        }

        sb.append("]\n");
    }
}
