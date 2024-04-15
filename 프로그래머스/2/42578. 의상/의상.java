
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 맵에 <의상종류, 의상개수>로 저장
        Map<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        int answer = 1;
        // 각 종류의 의상개수 곱하기
        for (Map.Entry<String, Integer> entry : entries) {
            answer *= entry.getValue() + 1; // +1은 의상입지않을 경우
        }
        answer -= 1; // -1은 다 벗을때
        return answer;
    }
}