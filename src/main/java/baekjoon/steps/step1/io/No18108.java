package baekjoon.steps.step1.io;

import java.util.Scanner;

public class No18108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buddaYear = scanner.nextInt();
        int normalYear = buddaYear - 543;

        System.out.println(normalYear);
    }
}
