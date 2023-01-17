package programmers.Lv1.success;

import java.util.*;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] ints = Arrays.stream(arr).filter(e -> e % divisor == 0).toArray();
        Arrays.sort(ints);
        return ints.length == 0 ? new int[]{-1} : ints;
    }

    public int[] solution1(int[] arr, int divisor) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) count++;
        }
        if (count == 0) {
            int[] result = {-1};
            return result;
        }
        int[] answer = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[index] = arr[i];
                index++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
