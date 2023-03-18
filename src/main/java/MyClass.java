import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringJoiner;
import java.util.StringTokenizer;

// 요세푸스 문제
// + 최적화
public class MyClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;
        StringJoiner sj = new StringJoiner(", ");

        // LinkedList 의 index 요소만 삭제, 다음 숫자가 리스트 끝넘어가면 다시 head 부터 시작하도록 % list.size() 함
        while (!list.isEmpty()) {
            index += k - 1;
            index %= list.size();
            sj.add(Integer.toString(list.remove(index)));
        }

        System.out.println("<" + sj + ">");
    }
}
