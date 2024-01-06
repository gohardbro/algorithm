import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(br.readLine());

        printStr(s, num);
    }

    private static void printStr(String targetStr, int targetNum) {
        System.out.println(targetStr.charAt(targetNum-1));
    }
}
