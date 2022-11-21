import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 네 수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long leftNum = Long.parseLong(st.nextToken() + st.nextToken());
        long rightNum = Long.parseLong(st.nextToken() + st.nextToken());

        System.out.println(leftNum + rightNum);
    }
}
