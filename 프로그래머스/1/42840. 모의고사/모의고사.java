import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] per1 = {1, 2, 3, 4, 5};
        int[] per2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] per3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int per1Index = 0;
        int per2Index = 0;
        int per3Index = 0;
        int[] cnt = new int[3];
        int max = 0;
        
        for (int ansNum : answers) {
            if (per1Index == per1.length) per1Index -= per1.length;
            if (per2Index == per2.length) per2Index -= per2.length;
            if (per3Index == per3.length) per3Index -= per3.length;
            
            if (per1[per1Index] == ansNum) cnt[0]++;
            if (per2[per2Index] == ansNum) cnt[1]++;
            if (per3[per3Index] == ansNum) cnt[2]++;
            
            per1Index++;
            per2Index++;
            per3Index++;
        }
        
        int maxPerIndex = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                maxPerIndex = i;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == max) {
                list.add(i+1);
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}