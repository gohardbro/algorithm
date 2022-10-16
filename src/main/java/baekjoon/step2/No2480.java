package baekjoon.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//주사위 세개
public class No2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int price = 0;

        //좀더 효율적으로 리팩터링 해보자

        if (a == c && b == c) {
            price= 10000+a*1000;
            System.out.println(price);
        } else if (a == b) {
            price = 1000+a*100;
            System.out.println(price);
        } else if (a == c) {
            price = 1000+a*100;
            System.out.println(price);
        } else if (b == c) {
            price = 1000+b*100;
            System.out.println(price);
        } else if (a > b && a > c) {
            price = a*100;
            System.out.println(price);
        } else if (b > a && b > c) {
            price = b*100;
            System.out.println(price);
        } else {
            price = c*100;
            System.out.println(price);
        }
    }
}
