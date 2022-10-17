package baekjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//영수증
public class No25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int billTotal = Integer.parseInt(br.readLine());
        int kindCnt = Integer.parseInt(br.readLine());

        int price = 0;
        int cnt = 0;
        int sum = 0;

        while(kindCnt != 0) {
            kindCnt--;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            price = Integer.parseInt(st.nextToken());
            cnt = Integer.parseInt(st.nextToken());
            sum += price * cnt;
        }

        if (billTotal == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
