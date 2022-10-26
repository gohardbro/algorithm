package baekjoon.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 크로아티아 알파벳
public class No2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] croAlpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String input = br.readLine();
        int cnt = 0;

        for (String s : croAlpha) {

            if (input.contains(s)) {

                while (true) {
                    if (input.contains(s)) {
                        input = input.replaceFirst(s, " "); // 해당하는 첫번째 문자열만 공백으로 치환
                        cnt++;
                    } else {
                        break;
                    }
                }
            }
        }
        // 남은 문자 개수 = 공백다 지우고 남은 문자열 길이
        cnt = cnt + input.replace(" ", "").length();

        System.out.println(cnt);
    }
}
