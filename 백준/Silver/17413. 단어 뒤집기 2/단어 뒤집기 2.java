import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 뒤집기2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // StringBuilder 이용해서 br.readLine 을 앞에서부터 하나씩 검사해서
        // <가 있으면 > 까지 그냥 sb 에 넣고 > 다음 문자부터는 새로운 sb를 만들어서 넣고 sb.reverse() 해서 결과 sb에 넣자
        String s = br.readLine();
        boolean isTag = false;
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                isTag = true;
            } else if (s.charAt(i) == '>') {
                isTag = false;
                sb.append('>');
                continue;
            }

            if (isTag) {
                sb.append(sb2.reverse());
                sb.append(s.charAt(i));
                sb2 = new StringBuilder();
            } else if (s.charAt(i) != ' ') {
                sb2.append(s.charAt(i));
                if (i == s.length()-1) {
                    sb.append(sb2.reverse().append(" "));
                }
            } else if (s.charAt(i) == ' ') {
                sb.append(sb2.reverse().append(" "));
                sb2 = new StringBuilder();
            }
        }

        System.out.println(sb);
    }
}
