class Solution {
    private int cnt = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return cnt;
    }
    
    public void dfs(int[] numbers, int target, int result, int depth) {
        if (depth == numbers.length) {
            if (result == target) cnt++;
            return;
        }
        
        dfs(numbers, target, result + numbers[depth], depth + 1);
        dfs(numbers, target, result - numbers[depth], depth + 1);
    }
}