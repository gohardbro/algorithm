package practice;

import java.util.Arrays;

// 병합 정렬 테스트
public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,6,7,9,8,4};
        System.out.println("정렬 전: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("정렬 후: " + Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length -1);
    }

    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2; // 배열을 가운데로 잘라야함
            mergeSort(arr, tmp, start, mid); // 배열 앞부분으로 재귀호출
            mergeSort(arr, tmp, mid + 1, end); // 배열 뒷부분으로 재귀호출
            merge(arr, tmp, start, mid, end); // 두개로 나눠져있는 배열을 병합해준다
        }
    }

    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        // 각 배열의 첫번째배열의 index를 지정
        int part1 = start;
        int part2 = mid +1;
        int index = start; // 합칠때 결과배열의 어디 index에 넣을지 알수있는 변수

        while (part1 <= mid && part2 <= end) {
            // 두 배열의 첫번째 인덱스를 비교해서 더작은것을 결과 배열에 초기화
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++; // 다음 배열를 보기위해 index를 +1 해준다
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }

        // 앞쪽 배열에 데이터가 남아있는 경우
        // 앞쪽배열의 마지막배열의 index(mid) - 현재 part1의 index(part1) = 남은 앞쪽배열
        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = tmp[part1 + i]; // 남은 앞쪽배열 만큼 결과배열에 넣어준다
        }

        /* 만약 앞쪽배열이 비었고 뒤쪽 배열이 남는다면
           뒤쪽 배열은 최종배열의 뒤쪽에 이미 자리하고 있기 때문에 바꿀 필요가 없다 */
    }
}
