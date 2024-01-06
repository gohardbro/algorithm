import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb2 = new StringBuilder();

        while (true){
            String s = br.readLine();
            if (s.equals("0")) break;

            StringBuilder sb = new StringBuilder(s);
            String sReverse = sb.reverse().toString();

            if (s.equals(sReverse)) sb2.append("yes").append("\n");
            else sb2.append("no").append("\n");
        }

        System.out.println(sb2);
    }
}
