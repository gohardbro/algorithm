package baekjoon.steps.step4.one_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 과제 안 내신 분..?
// + 최적화
public class No5597_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] checkers = new boolean[30];

        for (int i=0; i<28; i++) {
            int no = Integer.parseInt(br.readLine());
            checkers[no-1] = true; // 학생번호는 1부터 시작하기 때문에 index 는 no-1 해줬다.
        }

        // checkers배열 index 0~29 차례로 반복하기 때문에 오름차순 정렬 할 필요가 없다.
        for (int i=0; i<checkers.length; i++) {
            if (!checkers[i]) {
                sb.append(i+1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
