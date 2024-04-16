import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;
        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
            
            wMax = Math.max(size[0], wMax);
            hMax = Math.max(size[1], hMax);
        }
        
        int answer = wMax * hMax;
        return answer;
    }
}