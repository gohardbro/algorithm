package baekjoon.step4.one_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균
// + 최적화
public class No1546_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectCnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1;
        double sum = 0;
        for (int i=0; i< subjectCnt; i++) {
            int score = Integer.parseInt(st.nextToken());

            if (score > max) {
                max = score;
            }

            sum += score;
        }

        System.out.println(sum/max*100/subjectCnt);

    }
}
