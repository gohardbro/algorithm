package baekjoon.step11.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 재귀의 귀재
public class No25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<t; i++) {
            String s = br.readLine();
            sb.append(isPalindrome(s)).append("\n");
        }

        System.out.println(sb);
    }

    private static StringBuilder recursion(String s, int l, int r, int cnt){
        cnt++;
        StringBuilder sb = new StringBuilder();

        if(l >= r) return sb.append(1).append(" ").append(cnt);
        else if(s.charAt(l) != s.charAt(r)) return sb.append(0).append(" ").append(cnt);
        else return recursion(s, l+1, r-1, cnt);
    }

    private static StringBuilder isPalindrome(String s){
        int cnt = 0;
        return recursion(s, 0, s.length()-1, cnt);
    }
}
