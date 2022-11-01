package baekjoon.step10.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 나이순 정렬
public class No10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();  //map 말고 StringBuilder[] 을 사용해서 풀수도있다.
        
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            
            map.putIfAbsent(age, new ArrayList<>());
            map.get(age).add(name);
            map.put(age, map.get(age));
        }

        Set<Integer> keySets = map.keySet();
        int keySetsSize = keySets.size();
        Integer[] keys = keySets.toArray(new Integer[keySetsSize]);
        Arrays.sort(keys);
        
        for (int key : keys) {
            ArrayList<String> nameList = map.get(key); // 각 나이로 된 key 에 value 로 이름이 ArrayList 에 순서 대로 넣어지기 때문에
                                                        // 가입한 순서는 따로 정렬 할 필요가 없다.
            for (String name : nameList) {
                sb.append(key).append(" ").append(name).append("\n");
            }
        }

        System.out.println(sb);
    }
}
