package programmers.Lv2.success;

import java.util.*;

public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> tangerineMap = new HashMap<>();

        for(int i = 0; i < tangerine.length; i++) {
            tangerineMap.put(tangerine[i], tangerineMap.getOrDefault(tangerine[i],0)+1);
        }

        List<Integer> tangerines = new ArrayList<>(tangerineMap.keySet());

        tangerines.sort(Collections.reverseOrder());

        for(int i = 0; i < tangerines.size(); i++) {
            k -= tangerines.get(i);
            answer++;
            if(k<=0) {
                break;
            }
        }
        return answer;
    }
}
