import java.util.*;

class Solution {
    public int solution(int[] citations) {
        // 오름차순 정렬
        // 배열 왼쪽부터 탐색
        // 현재배열값 >= 배열길이-현재index 면 answer
        Arrays.sort(citations);

        int answer = 0;
        for (int i=0; i<citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                answer = citations.length - i;
                break;
            }
        }

        return answer;
    }
}