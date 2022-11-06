package baekjoon.steps.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 상수
public class No2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringBuffer 를 생성해 reverse() 메서드를 통해 문자열을 거꾸로 쓸수있다.
        // ex)
//        StringBuffer sb = new StringBuffer(br.readLine());
//        String resb = sb.reverse().toString();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char temp;
        char[] chars;
        int max = 0;

        while (st.hasMoreTokens()) {

            chars = st.nextToken().toCharArray();
            temp = chars[0];
            chars[0] = chars[2];
            chars[2] = temp;

            int reverNum = Integer.parseInt(String.valueOf(chars));
            if (reverNum > max)
                max = reverNum;
        }

        System.out.println(max);

    }
}
