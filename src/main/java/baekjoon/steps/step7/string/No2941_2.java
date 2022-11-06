package baekjoon.steps.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 크로아티아 알파벳
// + 최적화
public class No2941_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] croAlpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String input = br.readLine();

        for (String s : croAlpha) {

                while (true) {
                    if (input.contains(s)) {
                        // 타겟문자열을 문자 한개의 문자열인 0 으로 치환하기 때문에 카운트 할 필요없음!
                        input = input.replace(s, "0"); // "0" 개수가 크로아티아 알파벳 개수임
                    } else {
                        break;
                    }
            }
        }

        System.out.println(input.length());
    }
}
