package baekjoon.step1;

import java.util.Scanner;

//킹, 퀸, 룩, 비숍, 나이트, 폰
public class No3003 {

    public static void main(String[] args) {

        //bufferedReader 사용해서 한줄에서 입력 시도해보자

        int king, queen, look, bishop, knight, pawn;
        Scanner scanner = new Scanner(System.in);
        king = scanner.nextInt();
        queen = scanner.nextInt();
        look = scanner.nextInt();
        bishop = scanner.nextInt();
        knight = scanner.nextInt();
        pawn = scanner.nextInt();

        System.out.printf("%d %d %d %d %d %d", 1-king, 1-queen, 2-look, 2-bishop, 2-knight, 8-pawn);


    }
}
