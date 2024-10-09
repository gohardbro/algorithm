import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];
        int cut = (int) Math.round(n * 0.15);
        int sum = 0;

        for (int i = 0; i<n; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(scores);
        
        for (int i = cut; i < n - cut; i++) {
            sum += scores[i];
        }

        System.out.println(Math.round((double) sum / (n-cut*2)));
    }
}
