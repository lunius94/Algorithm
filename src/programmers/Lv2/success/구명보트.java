package programmers.Lv2.success;
import java.util.*;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int min = 0;
        int max = people.length-1;

        while(min<=max) {
            if(people[max] + people[min] <= limit) {
                max--;
                min++;
            }
            else {
                max--;
            }
            answer++;
        }
        return answer;
    }
}
