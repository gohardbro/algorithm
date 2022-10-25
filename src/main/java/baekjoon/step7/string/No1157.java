package baekjoon.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// 단어 공부
public class No1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toLowerCase().toCharArray();

        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        char result = 0;
        for (int unicode : chars) {
            map.putIfAbsent(unicode, 0); // key 에 value 값이 null 이면 두번째 파라미터의 값을 value 에 저장
            map.put(unicode, map.get(unicode)+1);

            if (map.get(unicode) > max) {
                max = map.get(unicode);
                result = (char) unicode;
            }
        }

        int maxCnt = 0;
        Collection<Integer> values = map.values(); // map 에 저장된 모든 value 값을 가져옴
        for (int val : values) {
            if (max == val) {
                maxCnt++;

                if (maxCnt > 1) {
                    result = '?';
                }
            }
        }

        String stResult = String.valueOf(result);
        System.out.println(stResult.toUpperCase());
    }
}
