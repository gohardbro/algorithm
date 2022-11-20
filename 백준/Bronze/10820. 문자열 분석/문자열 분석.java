import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 분석
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while((s = br.readLine()) != null) {
            int lower = 0;
            int upper = 0;
            int num = 0;
            int blank = 0;

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') lower++;
                else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') upper++;
                else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') num++;
                else blank++;
            }

            System.out.printf("%d %d %d %d\n", lower, upper, num, blank);
        }
    }
}
