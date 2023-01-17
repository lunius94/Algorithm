package programmers.Lv1.success;
import java.util.*;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        if(arr.length==1) return new int[]{-1};
        int[] copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        int target = copy[0];
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == target) {
                target = i;
                break;
            }
        }
        int[] answer = new int[arr.length-1];
        System.arraycopy(arr,0,answer,0,target);
        System.arraycopy(arr,target+1,answer,target,arr.length-target-1);
        return answer;
    }
}
