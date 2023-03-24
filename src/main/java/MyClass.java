import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MyClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map.putIfAbsent(x, new ArrayList<>());
            map.get(x).add(y);
            map.put(x, map.get(x));
        }

        Set<Integer> keySets = map.keySet();
        int keySize = keySets.size();
        Integer[] keys = keySets.toArray(new Integer[keySize]);
        Arrays.sort(keys);

        for (Integer key : keys) {
            ArrayList<Integer> values = map.get(key);
            int arrListsize = values.size();
            Integer[] integers = values.toArray(new Integer[arrListsize]);
            Arrays.sort(integers);

            for (int no : integers) {
                sb.append(key).append(" ").append(no).append("\n");
            }
        }

        System.out.println(sb);
    }
}
