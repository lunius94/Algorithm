package programmers.Lv2.success;
import java.util.*;

public class 프로세스 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Process> qu = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++) {
            qu.add(new Process(priorities[i],i));
        }

        Arrays.sort(priorities);

        int idx = 0;

        while(!qu.isEmpty()) {
            Process cur = qu.poll();
            if(cur.getPriority() != priorities[idx]) {
                qu.add(cur);
            }
            else {
                answer++;
                if(cur.getLocation() == location) {
                    break;
                }
            }
        }
        return answer;
    }

    public int solution1(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;



        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }
}

class Process{
    private int priority;
    private int location;

    public int getPriority() {
        return priority;
    }

    public int getLocation() {
        return location;
    }

    public Process(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}