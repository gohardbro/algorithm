import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // 두 배열 순차적으로 비교
        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }

        // 위의 비교가 다 모두 ture라면 길이가 1 더 긴 participant 배열의 마지막 index가 정답
        return participant[participant.length-1];
    }
}