package baekjoon.steps.step11.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 5
public class No10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(num));
    }

    private static int fibonacci(int num) {
        if (num == 0) return 0;
        else if (num == 1) return 1;

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
