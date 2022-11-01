package baekjoon.step10.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 단어 정렬
public class No1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, HashSet<String>> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            String s = br.readLine();

            map.putIfAbsent(s.length(), new HashSet<>()); // 입력한 문자열의 길이를 key 로 매핑
            map.get(s.length()).add(s);
            map.put(s.length(), map.get(s.length()));
        }

        Set<Integer> keySets = map.keySet();
        int keySetsSize = keySets.size();
        Integer[] keys = keySets.toArray(new Integer[keySetsSize]);
        Arrays.sort(keys);

        for (int key : keys) {
            HashSet<String> strSets = map.get(key);
            int strsLitSize = strSets.size();
            String[] strs = strSets.toArray(new String[strsLitSize]);
            Arrays.sort(strs);

            for (String str : strs) {
                sb.append(str).append("\n");
            }
        }

        System.out.println(sb);
    }
}
