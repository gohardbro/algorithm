package baekjoon.algorithm_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 요세푸스 문제
// 첫시도 584ms 나옴 시간 줄여보자!
public class No1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }


        Integer num = 0;

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < k; i++) {
                num = queue.poll();

                if (i==k-1)
                    break;

                queue.offer(num);
            }

            if (j == n - 1)
                sb.append(num);
            else
                sb.append(num).append(", ");
        }

        System.out.println("<" + sb + ">");
    }
}
