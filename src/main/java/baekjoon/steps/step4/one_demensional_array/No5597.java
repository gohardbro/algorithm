package baekjoon.steps.step4.one_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 과제 안 내신 분..?
public class No5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] checkers = new boolean[30];

        for (int i=0; i<28; i++) {
            int no = Integer.parseInt(br.readLine());
            checkers[no-1] = true; // 학생번호는 1부터 시작하기 때문에 index 는 no-1 해줬다.
        }

        int[] noCheckedNos = new int[2];
        int j = 0;
        for (int i=0; i<checkers.length; i++) {
            if (!checkers[i]) {
                noCheckedNos[j++] = i+1;
            }
        }

        // 제출 안 한 학생번호 배열 오름차순 정렬
        if (noCheckedNos[0] > noCheckedNos[1]) {
            int temp = noCheckedNos[0];
            noCheckedNos[0] = noCheckedNos[1];
            noCheckedNos[1] = temp;
        }

        for (int noCheckedNo : noCheckedNos)
            sb.append(noCheckedNo).append("\n");

        System.out.println(sb);
    }
}
