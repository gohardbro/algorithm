class Solution {
    public String solution(String s) {
        String[] split = s.split(" ");
        
        int max = Integer.parseInt(split[0]);
        int min = Integer.parseInt(split[0]);
        
        for (int i=0; i<split.length; i++) {
            
            if (Integer.parseInt(split[i]) > max) {
                max = Integer.parseInt(split[i]);
            } else if (Integer.parseInt(split[i]) < min) {
                min = Integer.parseInt(split[i]);
            }
        }
        
        
        String answer = min + " " + max;
        return answer;
    }
}