package programmers.Lv1.success;

import java.util.Arrays;

public class 평균구하기 {
    public double solution(int[] arr) {
        // double answer = Arrays.stream(arr).average().orElse(0);
        double answer = 0;
        for(int i = 0; i< arr.length; i++) {
            answer += arr[i];
        }
        return answer/arr.length;
    }
}
