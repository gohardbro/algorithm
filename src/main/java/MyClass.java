import java.io.*;
import java.util.*;

public class MyClass {
    private static int L, C;
    private static String[] strs;
    private static String[] picked;
    private static boolean[] isVisited;
    private static int vowelCnt = 0;
    private static int consonantCnt = 0;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        L = Integer.parseInt(s[0]);
        C = Integer.parseInt(s[1]);
        strs = new String[C];
        picked = new String[L];
        isVisited = new boolean[C];

        s = br.readLine().split(" ");
        for (int i=0; i<C; i++) {
            strs[i] = s[i];
        }

        Arrays.sort(strs);
        sol(0, 0);

        System.out.println(sb);
    }

    private static void sol(int index, int depth) {
        // 종료조건
        if (depth == L) {
            if (vowelCnt > 0 && consonantCnt > 1) {
                for (String s : picked) {
                    sb.append(s);
                }
                sb.append("\n");
            }

            return;
        }

        for (int i=index; i<C; i++) {
            if (isVisited[i]) continue;

            if (strs[i].equals("a") || strs[i].equals("e") || strs[i].equals("i") || strs[i].equals("o") || strs[i].equals("u")) vowelCnt++;
            else consonantCnt++;
            picked[depth] = strs[i];
            isVisited[i] = true;
            sol(i+1, depth+1);
            isVisited[i] = false;
            if (strs[i].equals("a") || strs[i].equals("e") || strs[i].equals("i") || strs[i].equals("o") || strs[i].equals("u")) vowelCnt--;
            else consonantCnt--;

        }
    }
}