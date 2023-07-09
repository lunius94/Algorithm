package programmers.Lv1.success;

import java.util.*;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageTryingUsers = new int[N+2];
        double curStageUsers = stages.length;

        for(int i = 0; i < stages.length; i++) {
            stageTryingUsers[stages[i]]++;
        }

        List<Rate> rates = new ArrayList<>();
        double failureRate;

        for(int i = 1; i < N+1; i++) {
            if(curStageUsers == 0) {
                curStageUsers = 1;
            }
            failureRate = stageTryingUsers[i]/curStageUsers;
            curStageUsers -= stageTryingUsers[i];
            rates.add(new Rate(i,failureRate));
        }

        rates.sort((o1, o2) ->
                Double.compare(o2.failureRate, o1.failureRate));

        for(int i = 0; i < answer.length; i++) {
            answer[i] = rates.get(i).stage;
        }
        return answer;
    }
}

class Rate {
    int stage;
    double failureRate;

    public Rate(int stage, double failureRate) {
        this.stage = stage;
        this.failureRate = failureRate;
    }
}
