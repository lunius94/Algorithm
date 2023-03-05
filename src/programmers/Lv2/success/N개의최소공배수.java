package programmers.Lv2.success;

public class N개의최소공배수 {
    public int solution(int[] arr) {
        int answer = 0;
        for(int i=1; i<arr.length; i++) {
            arr[i] = arr[i]*arr[i-1]/getGCD(arr[i],arr[i-1]);
        }
        answer = arr[arr.length-1];
        return answer;
    }

    public int getGCD(int num1, int num2) {
        return num1%num2==0? num2:getGCD(num2,num1%num2);
    }
}
