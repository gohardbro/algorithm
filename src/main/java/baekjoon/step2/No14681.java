package baekjoon.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//사분면 고르기
public class No14681 {
    public static void main(String[] args) {
        // 아래 코드로 하면 numformat 런타임 에러 백준에서만 뜸
//        BufferedReader xBr = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader yBr = new BufferedReader(new InputStreamReader(System.in));
//        int x = Integer.parseInt(xBr.readLine());
//        int y = Integer.parseInt(yBr.readLine());

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0)
            System.out.println(1);
        else if (x < 0 && y > 0)
            System.out.println(2);
        else if (x < 0 && y < 0)
            System.out.println(3);
        else
            System.out.println(4);

    }

}
