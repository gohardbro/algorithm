import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 부호
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 3; i++) {

            BigInteger sum = new BigInteger("0");
            int n = Integer.parseInt(br.readLine());

            for (int k = 0; k < n; k++) {
                sum = new BigInteger(br.readLine()).add(sum);
            }

            if (sum.compareTo(BigInteger.ZERO) == 1)
                System.out.println("+");
            else if (sum.compareTo(BigInteger.ZERO) == 0) {
                System.out.println(0);
            } else {
                System.out.println("-");
            }
        }
    }
}
