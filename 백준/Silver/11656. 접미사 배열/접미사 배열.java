import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 접미사 배열
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        String[] strs = new String[s.length()];
        strs[0] = s;

        for (int i=1; i<s.length(); i++) {
            strs[i] = s.substring(i);
        }

        Arrays.sort(strs);

        for (String str : strs) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}
