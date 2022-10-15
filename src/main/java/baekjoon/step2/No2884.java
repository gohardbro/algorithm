package baekjoon.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//알람시계
public class No2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int resultH = h;
        int resultM = m - 45;
        if (resultM < 0) {
            resultH = h - 1;
            if (resultH < 0) {
                resultH = 24 + resultH;
            }
            resultM = 60 + resultM;
            System.out.println(resultH + " " + resultM);
        } else {
            System.out.println(resultH + " " + resultM);
        }
    }
}
