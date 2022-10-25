package baekjoon.step7.string;

import java.io.IOException;

// 다이얼
public class No5622 {
    public static void main(String[] args) throws IOException {

        int alphabet = 65;
        int sec = 0;
        int read = System.in.read();

        while (read >= 65) { // 65 는 A 이다
            sec += calSec(read, alphabet);
            read = System.in.read();
        }

        System.out.println(sec);
    }

    // 65 ~ 90 까지 순차적으로 read 와 같은지 비교
    private static int calSec(int read, int alphabet) {
        int sec = 0;
        for (int i = 2; i <= 9; i++) { // 다이얼 넘버 2~9

            if (i == 7 || i == 9) { // 7, 9번만 알파벳 4개

                for (int j = 0; j < 4; j++) {
                    if (alphabet++ == read)
                        sec += i + 1;
                }

            } else {

                for (int j = 0; j < 3; j++) {
                    if (alphabet++ == read)
                        sec += i + 1;
                }
            }
        }

        return sec;
    }
}
