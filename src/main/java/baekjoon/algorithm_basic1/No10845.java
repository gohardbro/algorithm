package baekjoon.algorithm_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 큐
public class No10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        String temp = "";

        for (int i=0; i<n; i++) {

            String[] split = br.readLine().split(" ");

            switch (split[0]) {
                case "push":
                    queue.offer(Integer.parseInt(split[1]));
                    temp = split[1];
                    break;
                case "pop":
                    Integer poll = queue.poll();
                    if (poll != null) {
                        sb.append(poll).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "front":
                    Integer peek = queue.peek();
                    if (peek != null)
                        sb.append(peek).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;
                case "back":
                    if (queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(temp).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
