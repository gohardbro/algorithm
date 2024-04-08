import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        // Set에 넣어 중복제거
        for (int num : nums) {
            set.add(num);
        }
        
        if (set.size() < (nums.length/2)) 
            return set.size();
        else 
            return nums.length/2;
    }
}