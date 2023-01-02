import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

// 분해합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int min = 1_000_001;
        boolean isThereConstructor = false;

        for (int i = n; i >= 1; i--) {
            String numStrs = String.valueOf(i);
            char[] numChars = numStrs.toCharArray();
            int temp = 0;

            for (char num : numChars) { // 각 자리 더하기
                temp += Integer.parseInt(String.valueOf(num));
            }

            int sum = temp + i;

            if (sum == n && i < min) {
                min = i;
                isThereConstructor = true;
            }
        }

        if (isThereConstructor) {
            System.out.println(min);
        } else {
            System.out.println(0);
        }
    }
}
