package programmers.Lv1.success;
import java.util.*;


public class 같은숫자는싫어요 {
    public int[] solution(int[] arr) {
        if(arr.length<=1) return arr;
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i = 1 ; i< arr.length; i++) {
            int size = list.size();
            if(list.get(size-1)!=arr[i]) list.add(arr[i]);
        }

        int[] answer = list.stream().mapToInt(e -> e).toArray();

        return answer;
    }
}
