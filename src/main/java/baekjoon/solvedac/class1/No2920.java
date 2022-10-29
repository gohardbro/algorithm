package baekjoon.solvedac.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 음계
public class No2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String read = br.readLine();
        if (read.equals("1 2 3 4 5 6 7 8"))
            sb.append("ascending");
        else if (read.equals("8 7 6 5 4 3 2 1"))
            sb.append("descending");
        else
            sb.append("mixed");

        System.out.println(sb);
    }
}
