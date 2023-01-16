package programmers.Lv0.success;


import java.util.HashMap;
import java.util.Map;

public class 겹치는선분의길이 {
    public int solution(int[][] lines) {
        int[] array1 = new int[200];
        int[] array2 = new int[200];
        int[] array3 = new int[200];
        int answer = 0;
        for(int i = lines[0][0]+100; i<lines[0][1]+100; i++) {
            array1[i] = 1;
        }
        for(int i = lines[1][0]+100; i<lines[1][1]+100; i++) {
            array2[i] = 1;
        }
        for(int i = lines[2][0]+100; i<lines[2][1]+100; i++) {
            array3[i] = 1;
        }
        for(int i = 0; i<200; i++) {
            if(array1[i]==1&&array2[i]==1&&array3[i]==1) answer++;
            else if((array1[i]==1&&array2[i]==1)||(array1[i]==1&&array3[i]==1)||array2[i]==1&&array3[i]==1) answer++;
        }
        return answer;
    }

    // 다른 사람의 풀이
    public int solution1(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<lines.length; i++) {
            int min = Math.min(lines[i][0], lines[i][1]);
            int max = Math.max(lines[i][0], lines[i][1]);

            for (int j=min; j<max; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        int answer = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                answer++;
            }
        }

        return answer;
    }
}
