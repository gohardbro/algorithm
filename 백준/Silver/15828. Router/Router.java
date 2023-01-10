import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// Router
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int packet;

        while ((packet = Integer.parseInt(br.readLine())) != -1) {

            if (packet != 0) {
                if (queue.size() < n) {
                    queue.offer(packet);
                }
            } else {
                queue.poll();
            }
        }

        if (queue.isEmpty())
            sb.append("empty");
        else {
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                sb.append(queue.poll()).append(" ");
            }
        }

        System.out.println(sb);
    }
}
