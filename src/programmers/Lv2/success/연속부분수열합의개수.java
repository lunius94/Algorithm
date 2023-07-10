package programmers.Lv2.success;

import java.util.*;

public class 연속부분수열합의개수 {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        int length = elements.length;

        while(length>0) {
            for(int i = 0; i < elements.length; i++) {
                int endPoint = i + length;
                int sum = 0;
                for(int j = i; j < endPoint; j++) {
                    sum += elements[j%elements.length];
                }
                set.add(sum);
            }
            length--;
        }

        answer = set.size();

        return answer;
    }
}
