import java.io.*;
import java.util.*;

public class Main {
    private static final Stack<String> stack = new Stack<>();
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        final int N = Integer.parseInt(br.readLine());

        sol(N);
        System.out.println(sb);
    }

    private static void sol(int N) throws IOException {
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");

            switch (s[0]) {
                case "1":
                    stack.push(s[1]);
                    break;
                case "2":
                    try {
                        sb.append(stack.pop()).append("\n");
                    } catch (Exception e) {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    if (stack.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "5":
                    try {
                        sb.append(stack.peek()).append("\n");
                    } catch (Exception e) {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
    }
}
