import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 나는야 포켓몬 마스터 이다솜
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        final int N = Integer.parseInt(st.nextToken()); // 도감 포켓몬 수
        final int M = Integer.parseInt(st.nextToken()); // 문제 개수
        Map<Integer, String> integerKeyMap = new HashMap<>();
        Map<String, Integer> stringKeyMap = new HashMap<>();
        String line;

        for (int i = 0; i < N; i++) {
            line = br.readLine();
            integerKeyMap.put(i+1, line);
            stringKeyMap.put(line, i+1);
        }


        for (int i = 0; i < M; i++) {
            line = br.readLine();

            if (line.charAt(0) >= 'A') { // 첫문자가 숫자가 아니라면
                sb.append(stringKeyMap.get(line)).append("\n");
            } else { // 첫 문자가 숫자라면
                sb.append(integerKeyMap.get(Integer.parseInt(line))).append("\n");
            }
        }

        System.out.println(sb);
    }
}
