import java.io.*;

// 별 찍기 - 19

/*  한 변은 +4 씩 증가함
    퐁당퐁당으로 선, 공백 이있음
    각 사각형은 별 한개공간 있음
    N = 사각형 개수
    사각형의 한 변 별개수 = (N - 1) * 4 + 1
*/

public class Main {
    private static char[][] square;
    
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      final int N = Integer.parseInt(br.readLine()); // 사각형 개수
      int sideLength = (N - 1) * 4 + 1;
      square = new char[sideLength][sideLength];
      
      for (int i = 0; i < sideLength; i++) {
          for (int j = 0; j < sideLength; j++) {
              square[i][j] = ' ';
          }
      }
      
      sol(sideLength);
      
      StringBuilder sb = new StringBuilder();
      
      for (int i = 0; i < sideLength; i++) {
          for (int j = 0; j < sideLength; j++) {
              sb.append(square[i][j]);
          }
          
          sb.append("\n");
      }
      
      System.out.println(sb);
    }
    
    
    private static void sol(int sideLength) {
        sol(0, sideLength);
    }
    
    private static void sol(int start, int sideLength) { // start = 시작점, sideLength = 한 변의 길이
        if (start >= sideLength) return;
        
        for (int i = start; i < sideLength; i++) {
            square[start][i] = '*'; // 윗변
            square[sideLength - 1][i] = '*'; // 밑변
            square[i][start] = '*'; // 왼쪽 변
            square[i][sideLength - 1] = '*'; // 오른쪽 변
        }
        
        sol(start+2, sideLength-2);
    }
}