package baekjoon.step10.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 좌표 정렬하기 2
public class No11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map.putIfAbsent(y, new ArrayList<>());
            map.get(y).add(x);
            map.put(y, map.get(y));
        }

        Set<Integer> keySets = map.keySet();
        int keySetsSize = keySets.size();

        Integer[] keys = keySets.toArray(new Integer[keySetsSize]);
        Arrays.sort(keys);

        for (int key : keys) {
            ArrayList<Integer> xList = map.get(key);
            int xListSize = xList.size();
            Integer[] xs = xList.toArray(new Integer[xListSize]);
            Arrays.sort(xs);

            for (int x : xs) {
                sb.append(x).append(" ").append(key).append("\n");
            }
        }

        System.out.println(sb);
    }
}
