import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String calledPlayer : callings) {
            int rank = map.get(calledPlayer);
            String frontPlayer = players[rank-1];
            
            map.replace(frontPlayer, rank);
            map.replace(calledPlayer, rank-1);
            players[rank] = frontPlayer;
            players[rank-1] = calledPlayer;
        }
        
        return players;
    }
}