package baekjoon;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] strArr = new String[]{"hi","hello","welcome","so","bye"};

        System.out.println("before = "+ Arrays.toString(strArr));

        String[] newArr = new String[5];
        System.arraycopy(strArr, 0, newArr, 0, strArr.length);

        System.out.println("after = "+ Arrays.toString(newArr));

    }
}
