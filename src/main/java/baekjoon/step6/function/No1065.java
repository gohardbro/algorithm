package baekjoon.step6.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 한수
public class No1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(check(n));
    }

    static int check(int n) {

        int cnt = 0;
        for (int i=1; i<=n; i++) {

            ArrayList<Integer> temp = new ArrayList<>();
            int no = i;
            if (no < 100) {
                cnt = no;
            }
            while (no>0) {
                int remainder = no % 10;
                temp.add(remainder);
                no /= 10;
            }

            Integer[] gap = new Integer[temp.size()-1];
            for (int k=0; k<temp.size()-1; k++) {
                gap[k] = temp.get(k) - temp.get(k+1);
            }

            boolean isCnt = false;
            for (int l=0; l<gap.length-1; l++) {
                isCnt = gap[l + 1] != null && gap[l].equals(gap[l + 1]);
            }
            if (isCnt)
                cnt++;
        }
        return cnt;
    }

}
