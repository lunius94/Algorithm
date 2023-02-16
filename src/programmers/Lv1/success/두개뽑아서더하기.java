package programmers.Lv1.success;
import java.util.*;

// TreeSet으로 하면 정렬할 필요가 없다.
public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j<numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int index = 0;
        for (Integer integer : set) {
            answer[index] = integer;
            index++;
        }
        Arrays.sort(answer);
        return answer;
    }

    public int[] solution1(int[] numbers) {
        Set<Integer> sumNumber = new TreeSet<>();

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                sumNumber.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sumNumber.size()];
        int index = 0;
        for (Integer integer : sumNumber) {
            answer[index] = integer;
            index++;
        }

        return answer;
    }
}
