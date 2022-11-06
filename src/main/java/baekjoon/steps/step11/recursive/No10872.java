package baekjoon.steps.step11.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팩토리얼
public class No10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(n));;

    }

    private static int factorial(int num) {
        int result = 0;

        if (num < 2)
            result = 1;
        else
            result += num * factorial(num - 1);

        return result;
    }
}
