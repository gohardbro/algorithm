package baekjoon.step7.string;

import java.io.IOException;

// 단어 공부
// + 최적화
public class No1157_2 {
    public static void main(String[] args) throws IOException {

        int[] alphabets = new int[26];

        int read = System.in.read();

        while (read >= 'A' && read <= 'z') { // 대문자 A ~ 소문자 z 까지 문자 아니면 멈춤

            if (read <= 'Z')
                alphabets[read - 'A']++;
            else
                alphabets[read - 'a']++;
            read = System.in.read();
        }

        int max = -1;
        int result = 0;

        for (int i=0; i<alphabets.length; i++) {

            if (alphabets[i] > max) {
                max = alphabets[i];
                result = i;
            } else if (alphabets[i] == max) {
                result = -2; // ? 는 63 , 최종에서 result+65 = 63('?') 이 나오게 하기위함
            }
        }

        System.out.println((char) (result+65));
    }
}
