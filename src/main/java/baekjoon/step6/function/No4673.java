package baekjoon.step6.function;

import java.util.ArrayList;

// 셀프 넘버
public class No4673 {

    public static void main(String[] args) {
        ArrayList<Integer> noSelNums = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10000; i++) {
            noSelNums.add(d(i));
        }

        for (int i = 1; i <= 10000; i++) {
            if (!noSelNums.contains(i))
                sb.append(i).append("\n");
        }

        System.out.println(sb);

    }

    static int d(int n) {
        int firstN = n;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum + firstN;
    }
}
