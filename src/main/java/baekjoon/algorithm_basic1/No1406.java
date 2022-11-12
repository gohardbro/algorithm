package baekjoon.algorithm_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

// 에디터
// 결과성공 but 시간초과 실패
// StringBuilder -> LinkedList 바꿔서 성공!
public class No1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int m = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        LinkedList<Character> rightOfCursor = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            String cmdLine = br.readLine();

            switch (cmdLine.charAt(0)) {
                case 'L':
                    if (!stack.isEmpty())
                        rightOfCursor.addFirst(stack.pop());
                    break;
                case 'D':
                    if (rightOfCursor.size() > 0) {
                        stack.push(rightOfCursor.poll());
                    }
                    break;
                case 'B':
                    if (!stack.isEmpty())
                        stack.pop();
                    break;
                case 'P':
                    stack.push(cmdLine.charAt(2));
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Character c : stack) {
            sb.append(c);
        }

        for (Character c: rightOfCursor) {
            sb.append(c);
        }

        System.out.println(sb);
    }
}
