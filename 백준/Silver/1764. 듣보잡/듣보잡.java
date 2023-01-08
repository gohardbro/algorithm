import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 듣보잡
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int noHearCnt = Integer.parseInt(st.nextToken());
        int noSeeCnt = Integer.parseInt(st.nextToken());
        Set<String> noHearSet = new HashSet<>();
        Set<String> noSeeSet = new HashSet<>();

        for (int i = 0; i < noHearCnt; i++) {
            noHearSet.add(br.readLine());
        }

        for (int i = 0; i < noSeeCnt; i++) {
            noSeeSet.add(br.readLine());
        }

        int i = 0;
        List<String> resultNames = new ArrayList<>();

        for (String name : noHearSet) {
            if (noSeeSet.contains(name)) {
                resultNames.add(name);
                i++;
            }
        }

        int size = resultNames.size();
        String[] results = resultNames.toArray(new String[size]);
        Arrays.sort(results);

        for (String result : results) {
            sb.append(result).append("\n");
        }


        System.out.println(size + "\n" + sb);
    }
}
