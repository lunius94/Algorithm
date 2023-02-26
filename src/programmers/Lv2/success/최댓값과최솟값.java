package programmers.Lv2.success;

public class 최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length; i++) {
            int temp = Integer.parseInt(arr[i]);
            if(temp>max) {
                max = temp;
            }
            if(min>temp) {
                min = temp;
            }
        }
        answer += min +" " + max;
        return answer;
    }
}
