import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ROT13
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) >= 'a') {
                if (s.charAt(i) + 13 > 'z')
                    sb.append((char) (s.charAt(i) + 13 - 26));
                else
                    sb.append((char) (s.charAt(i) + 13));
            } else if (s.charAt(i) >= 'A') {
                if (s.charAt(i) + 13 > 'Z')
                    sb.append((char) (s.charAt(i) + 13 - 26));
                else
                    sb.append((char) (s.charAt(i) + 13));
            } else
                sb.append(s.charAt(i));
        }

        System.out.println(sb);
    }
}
