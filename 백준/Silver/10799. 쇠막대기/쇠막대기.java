import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 쇠막대기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        int pieceCnt = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(')
                stack.push(s.charAt(i));
            else {
                stack.pop();

                if (s.charAt(i - 1) == '(')
                    pieceCnt += stack.size();
                else
                    pieceCnt++;
            }
        }

        System.out.println(pieceCnt);
    }
}
