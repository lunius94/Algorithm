package programmers.Lv1.success;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int worst = 0;
        int best = 0;
        for(int lotto : lottos) {
            if(lotto == 0) {
                best++;
                continue;
            }
            for(int num : win_nums) {
                if(num==lotto) {
                    best++;
                    worst++;
                    break;
                }
            }
        }
        if(worst==0 || worst==1) answer[1] = 6;
        else {
            answer[1] = 7-worst;
        }

        if(best==0 || best==1) answer[0] = 6;
        else answer[0] = 7-best;
        return answer;
    }
}
