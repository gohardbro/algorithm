import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        final int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");

            switch (s[0]) {
                case "add":
                    if (!list.contains(s[1])) list.add(s[1]);
                    break;
                case "remove":
                    list.remove(s[1]);
                    break;
                case "check":
                    if (list.contains(s[1])) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "toggle":
                    if (list.contains(s[1])) list.remove(s[1]);
                    else list.add(s[1]);
                    break;
                case "all":
                    list.clear();
                    for (int j=0; j<20; j++) {
                        list.add(j+1+"");
                    }
                    break;
                case "empty":
                    list.clear();
                    break;
            }
        }

        System.out.println(sb);
    }
}