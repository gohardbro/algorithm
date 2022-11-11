package baekjoon.algorithm_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 스택 수열
public class No1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] originNums = new int[n];
        for (int i = 0; i < n; i++) {
            originNums[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        int num = 0;
        boolean isCal = true;

        for (int originNum : originNums) {

            while (num < originNum) {
                stack.push(++num);
                sb.append("+").append("\n");
            }

            if (!stack.isEmpty() && stack.peek() == originNum ) {
                stack.pop();
                sb.append("-").append("\n");
            } else if (!stack.isEmpty() && stack.peek() != originNum) {
                isCal = false;
            }
        }

        if (isCal)
            System.out.println(sb);
        else
            System.out.println("NO");
    }
}
