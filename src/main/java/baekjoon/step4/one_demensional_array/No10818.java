package baekjoon.step4.one_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소, 최대
public class No10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int no = Integer.parseInt(st.nextToken());
        int max = no;
        int min = no;
        while (st.hasMoreTokens()) {
            no = Integer.parseInt(st.nextToken());
            if (min > no) {
                min = no;
            }

            if(max < no) {
                max = no;
            }
        }
        System.out.println(min + " " + max);
    }
}
