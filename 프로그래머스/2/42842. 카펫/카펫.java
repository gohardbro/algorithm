// 가로 * 세로 = brown + yellow
import java.util.*;

class Solution {
    public static int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        double areaSqrt = Math.sqrt(area);
        int num = (int) areaSqrt;
        int[] answer = new int[2];

        // 제곱근의 소수점 숫자가 0보다 클때
        // ex) 3.3 -> 4
        if (areaSqrt - Math.floor(areaSqrt) > 0)
            num = (int) Math.ceil(areaSqrt);

        for (int i = num; i < area; i++) {
            if ((area % i) == 0) {
                int width = i;
                int height = area / width;

                // 가장자리를 제외한 가운데넓이가 yellow와 같아야한다
                if ((width - 2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    return answer;
                }
            }
        }

        return answer;
    }
}