import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int x = 0;
        int y = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++)  {
                if(sum - arr[i] - arr[j] == 100) {
                    x = arr[i];
                    y = arr[j];
                    break;
                }
            }
        }

        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x || arr[i] == y)
                continue;
            System.out.println(arr[i]);
        }

    }
}