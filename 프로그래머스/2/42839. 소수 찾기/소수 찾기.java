import java.util.*;

class Solution {
     static Set<Integer> set;
    static boolean[] isVisited;
    
    public static int solution(String numbers) {
        isVisited = new boolean[numbers.length()];
        set = new HashSet<>();
        dfs(numbers, "", 0);
        
        int cnt = 0;
 
        for (Integer num : set) {
            if (isPrime(num)) {
                cnt++;
            }
        }
        return cnt;
    }
 
    public static void dfs(String numbers, String s, int depth) {
        if (depth > numbers.length()) {
            return;
        }
 
        for (int i = 0; i < numbers.length(); i++) {
            if(isVisited[i]) continue;
            
            isVisited[i] = true;
            set.add(Integer.parseInt(s + numbers.charAt(i)));
            dfs(numbers ,s + numbers.charAt(i), depth + 1);
            isVisited[i] = false;
            
        }
    }
 
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
		
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}