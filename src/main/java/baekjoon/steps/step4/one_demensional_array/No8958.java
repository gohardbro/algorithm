package baekjoon.steps.step4.one_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX 퀴즈
public class No8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<caseCnt; i++) {
            String oxStr = br.readLine();
            String[] oxArr = oxStr.split("");

            int score = 0;
            int cnt = 0;
            for (int j=0; j<oxArr.length; j++) {

                if (oxArr[j].equals("O")) {
                    score += ++cnt;
                } else {
                    cnt = 0;
                }
            }
            sb.append(score).append("\n");

        }
        System.out.println(sb);


    }
}
