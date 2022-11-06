package baekjoon.steps.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 찾기
public class No10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] alphabets = new char[26];
        int j = 0;
        for (int i=97; i<123; i++) { // 97은 'a'의 유니코드, 122는 'z'의 유니코드
            alphabets[j++] = (char) i;
        }

        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (char alphabet : alphabets) {
            int index = s.indexOf(alphabet);
            sb.append(index).append(" ");
        }

        System.out.println(sb);
    }
}
