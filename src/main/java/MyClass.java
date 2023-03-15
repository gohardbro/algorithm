import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MyClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String cmd = br.readLine();
        Stack<Double> stack = new Stack<>();
        double[] nums = new double[n];

        for (int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<cmd.length(); i++) {
            if (cmd.charAt(i) >= 'A') {// 알파벳이라면 이라는 뜻
                stack.push(nums[cmd.charAt(i) - 'A']);
            } else {
                double rightNum = stack.pop();
                double leftNum = stack.pop();

                switch (cmd.charAt(i)) {
                    case '+':
                        stack.push(leftNum + rightNum);
                        break;
                    case '-':
                        stack.push(leftNum - rightNum);
                        break;
                    case '*':
                        stack.push(leftNum * rightNum);
                        break;
                    case '/':
                        stack.push(leftNum / rightNum);
                        break;
                }
            }
        }

        System.out.printf("%.2f",stack.pop());
    }
}
