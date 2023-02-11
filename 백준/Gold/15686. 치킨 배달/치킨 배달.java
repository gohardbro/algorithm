import java.io.*;
import java.util.*;
// 치킨집을 M 개만큼 고를때마다 모든 집의 치킨거리를 구하고 그 값들을 더한 값을 min 과 비교 저장
public class Main {
    private static int N, M;
    private static final List<String> houseCoordinate = new ArrayList<>(); // 집 좌표
    private static final List<String> chickenCoordinate = new ArrayList<>(); // 치킨집 좌표
    private static String[] pickedChicken; // 고른 치킨집 좌표
    private static boolean[] isVisited;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        pickedChicken = new String[M];

        // 각 좌표 저장
        for (int i=0; i<N; i++) {
            s = br.readLine().split(" ");

            for (int j=0; j<N; j++) {
                if (s[j].equals("1")) { // 집일경우
                    houseCoordinate.add(i+1 + "," + (j+1));
                } else if (s[j].equals("2")) { // 치킨집 경우
                    chickenCoordinate.add(i+1 + "," + (j+1));
                }
            }
        }

        isVisited = new boolean[chickenCoordinate.size()];

        sol(0, 0);

        System.out.println(min);
    }

    private static void sol(int index, int depth) {
        // 종료조건
        if (depth == M) {
            int result = calCityDistance();
            if (result < min) min = result;
            return;
        }

        // logic
        for (int i=index; i<chickenCoordinate.size(); i++) {
            if (isVisited[i]) continue;

            isVisited[i] = true;
            pickedChicken[depth] = chickenCoordinate.get(i);
            sol(i+1, depth+1);
            isVisited[i] = false;
        }
    }

    // 도시의 치킨거리 반환
    private static int calCityDistance() {
        int cityDistance = 0; // 도시의 치킨거리

        for (String s : houseCoordinate) {
            String[] h = s.split(",");
            int minDistance = Integer.MAX_VALUE; //치킨집과의 가장최소거리가 그 집의 치킨거리

            for (int j = 0; j < M; j++) {
                String[] p = pickedChicken[j].split(",");
                int distance = Math.abs(Integer.parseInt(h[0]) - Integer.parseInt(p[0])) + Math.abs(Integer.parseInt(h[1]) - Integer.parseInt(p[1]));

                if (distance < minDistance) minDistance = distance;
            }

            cityDistance += minDistance;
        }
        return cityDistance;
    }
}