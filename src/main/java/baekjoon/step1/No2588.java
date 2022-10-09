package baekjoon.step1;


import java.util.Scanner;

public class No2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String num = String.valueOf(b);
        char[] numChars = num.toCharArray();
        int one = Character.getNumericValue(numChars[2]);
        int ten = Character.getNumericValue(numChars[1]);
        int hun = Character.getNumericValue(numChars[0]);

        System.out.println(a * one);
        System.out.println(a * ten);
        System.out.println(a * hun);
        System.out.println(a * b);
    }
}
