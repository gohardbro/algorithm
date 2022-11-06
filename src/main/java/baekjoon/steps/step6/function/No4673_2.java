package baekjoon.steps.step6.function;

import java.util.HashSet;

// 셀프 넘버
// + HashSet 으로 최적화
public class No4673_2 {
    public static void main(String[] args) {
        HashSet<Integer> noSelNums = new HashSet<>();
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
        int sum = n;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
