package baekjoon.algorithm_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 알파벳 개수
public class No10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        HashMap<Character, Integer> map = new HashMap<>();
        Character[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i=0; i<s.length(); i++) {
            map.putIfAbsent(s.charAt(i), 0);
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        for (char alphabet : alphabets) {
            if (map.get(alphabet) != null) {
                sb.append(map.get(alphabet)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}
