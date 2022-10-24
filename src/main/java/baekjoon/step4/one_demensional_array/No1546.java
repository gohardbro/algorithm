package baekjoon.step4.one_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균
public class No1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectCnt = Integer.parseInt(br.readLine());

        int[] scores = new int[subjectCnt];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<subjectCnt; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }

        double sum = 0;
        double[] newScores = new double[subjectCnt];
        for (int i=0; i<scores.length; i++) {
            newScores[i] = (double) scores[i]/max*100;
            sum += newScores[i];
        }
        double result = sum / subjectCnt;
        System.out.println(result);

    }
}
