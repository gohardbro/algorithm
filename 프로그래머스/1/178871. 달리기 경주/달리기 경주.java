import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankingMap = new HashMap<>();
        
        for (int i=0; i<players.length; i++) {
            rankingMap.put(players[i], i);
        }
        
        for (String calledPlayer : callings) {
            // calling된 선수의 랭킹 가져오기
            int playerRanking = rankingMap.get(calledPlayer);
           
            String front = players[playerRanking - 1];
            
            rankingMap.replace(front, playerRanking);
            players[playerRanking] = front;
            
            rankingMap.replace(calledPlayer, playerRanking-1);
            players[playerRanking-1] = calledPlayer;
        }
        return players;
    }
}