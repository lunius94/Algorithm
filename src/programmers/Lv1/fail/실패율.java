package programmers.Lv1.fail;
import java.util.*;
// 도달하지 못한 경우의 처리.
public class 실패율 {
    public static void main(String[] args) {
        실패율 sol = new 실패율();
        int N = 6;
        int[] stages = {1,2,2,1,3,3,3,2,5};
        System.out.println(Arrays.toString(sol.solution(N,stages)));
    }
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        GiveUp[] data = new GiveUp[N];

        for(int i = 0; i < N; i++) {
            data[i] = new GiveUp(i+1,0,stages.length,0);
        }

        for(int i = 0; i < stages.length; i++) {
            if(stages[i]==N+1) continue;
            data[stages[i]-1].addGamer();
        }

        for(int i = 0; i< N; i++) {
            if(i==0) {
                data[i].setFailureRate(data[i].getFailedGamer()/data[i].getTotalGamer());
            }
            else {
                int prevTotalGamer = data[i - 1].getTotalGamer();
                int prevFailedGamer = data[i - 1].getFailedGamer();
                data[i].setTotalGamer(prevTotalGamer - prevFailedGamer);
                double curTotalGamer = data[i].getTotalGamer();
                double curFailedGamer = data[i].getFailedGamer();
                if(curTotalGamer==0) break;
                data[i].setFailureRate(curFailedGamer / curTotalGamer);
            }
        }

        Arrays.sort(data, GiveUp::compare);

        for(int i = 0; i < N; i++) {
            answer[i] = data[i].getCurStage();
        }

        return answer;
    }

    class GiveUp{
        private int curStage;
        private int failedGamer;
        private int totalGamer;
        private double failureRate;

        public GiveUp(int curStage, int failedGamer, int totalGamer,double failureRate) {
            this.curStage = curStage;
            this.failedGamer = failedGamer;
            this.totalGamer = totalGamer;
            this.failureRate = failureRate;
        }

        public int getCurStage() {
            return curStage;
        }
        public int getFailedGamer(){
            return failedGamer;
        }

        public int getTotalGamer() {
            return totalGamer;
        }

        public void setTotalGamer(int totalGamer) {
            this.totalGamer = totalGamer;
        }

        public void setFailureRate(double failureRate) {
            this.failureRate = failureRate;
        }
        public void addGamer() {
            this.failedGamer++;
        }

        public int compare(GiveUp giveUp) {
            if(this.failureRate==giveUp.failureRate) {
                if(this.curStage>giveUp.curStage) return 1;
                else if(this.curStage<giveUp.curStage) return -1;
                else return 0;
            }
            else if(this.failureRate> giveUp.failureRate) return -1;
            else return 0;
        }
    }
}
