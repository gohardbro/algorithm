package baekjoon.step5;

// 정수의 N개의 합
public class No15596 {

    long sum(int[] a) {
        long ans = 0;
        for (int i=0; i<a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}
