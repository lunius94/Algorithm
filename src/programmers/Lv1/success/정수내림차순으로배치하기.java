package programmers.Lv1.success;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        long answer = Long.parseLong(String.join("",arr));
        return answer;
    }
}
