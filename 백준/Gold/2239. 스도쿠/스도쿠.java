import java.io.*;
import java.math.*;

public class Main {
    private static int[][] board;
    private static BigInteger bigInt;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        board = new int[9][9];
        
        // 입력값들 배열에 저장
        for (int i=0; i<9; i++) {
            String[] s = br.readLine().split("");
            for (int j=0; j<9; j++) {
                board[i][j] = Integer.parseInt(s[j]);
            }
        }
        
        sol(0, 0);
    }
    
    private static void sol(int row, int col) {
        // 종료조건
        if (row == 9) {
            StringBuilder sb = new StringBuilder();
            
            for (int i=0; i<9; i++) {
                for (int j=0; j<9; j++) {
                    sb.append(board[i][j]);
                }
                sb.append("\n");
            }
            
            System.out.println(sb);
            System.exit(0);
        }
        
        if (col == 9) {
            sol(row+1, 0);
            return;
        }
        
        if (board[row][col] == 0) {
            for (int i=1; i<=9; i++) {
                if (isPossible(row, col, i)) {
                     board[row][col] = i;
                     sol(row, col+1);
                }
            }
            
            board[row][col] = 0;
            return;
        }
        
        sol(row, col+1);
    }
    
    private static boolean isPossible(int row, int col, int val) {
        // 해당 칸의 행과 열에서 중복값 비교
        for (int i=0; i<9; i++) {
            if (board[row][i] == val) return false;
            if (board[i][col] == val) return false;
        }
        
        // 해당 칸의 3*3 블록 내에서 중복값 비교
        int blockRow = row/3 * 3;
        int blockCol = col/3 * 3;
        
        for (int i=blockRow; i<blockRow+3; i++) {
            for (int j=blockCol; j<blockCol+3; j++) {
                if (board[i][j] == val) return false;
            }
        }
        
        return true;
    }
}