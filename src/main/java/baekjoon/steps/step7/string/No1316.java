package baekjoon.steps.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그룹 단어 체커
// 첫 문자 자르는 방식
public class No1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseCnt = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i=0; i<caseCnt; i++) {

            boolean isGroup = false;
            String read = br.readLine();
            String firstText;

            // 중복을 방지하는 HashSet 으로 구현해보자

            while (!read.equals("")) {

                isGroup = true;
                firstText = String.valueOf(read.charAt(0)); // read 문자열 자르기전 첫번째 문자 ex) "happy" --> "h"
                read = read.replaceFirst(firstText, ""); // read 문자열 첫번째 문자를 "" 로 치환함 (자름) ex) "happy" -> "appy"

                if (read.length() < 1) // read 문자열이 비어있으면 break;
                    break;

                // 자르기전 첫문자와 자른후 read 의 첫문자가 같지 않고,
                // 잘려진 read 에서 자르기전 첫문자가 존재한다면 그룹단어아님 ex) "abca" -> "bca" ("a" != "b" && "bca"에 "a" 가 포함) 이니 그룹단어아님
                if (!String.valueOf(read.charAt(0)).equals(firstText) && read.contains(firstText)) {
                    isGroup = false;
                    break;
                }
            }

            if (isGroup)
                cnt++;
        }

        System.out.println(cnt);

    }
}
