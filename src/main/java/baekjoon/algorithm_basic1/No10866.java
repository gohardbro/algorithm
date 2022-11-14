package baekjoon.algorithm_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringJoiner;
import java.util.StringTokenizer;

// 덱
public class No10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringJoiner sj = new StringJoiner("\n");

        final int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for (int i=0; i<N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (!deque.isEmpty())
                        sj.add(Integer.toString(deque.removeFirst()));
                    else
                        sj.add("-1");
                    break;
                case "pop_back":
                    if (!deque.isEmpty())
                        sj.add(Integer.toString(deque.removeLast()));
                    else
                        sj.add("-1");
                    break;
                case "size":
                    sj.add(Integer.toString(deque.size()));
                    break;
                case "empty":
                    if (deque.isEmpty())
                        sj.add("1");
                    else
                        sj.add("0");
                    break;
                case "front":
                    if (!deque.isEmpty())
                        sj.add(Integer.toString(deque.getFirst()));
                    else
                        sj.add("-1");
                    break;
                case "back":
                    if (!deque.isEmpty())
                        sj.add(Integer.toString(deque.getLast()));
                    else
                        sj.add("-1");
                    break;
            }
        }

        System.out.println(sj);
    }
}
