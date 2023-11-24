import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<inputStr.length(); i++) {
            if(Character.isUpperCase(inputStr.charAt(i))) {
                sb.append(String.valueOf(inputStr.charAt(i)).toLowerCase());
            } else {
                sb.append(String.valueOf(inputStr.charAt(i)).toUpperCase());
            }
        }

        System.out.println(sb);
    }
}
