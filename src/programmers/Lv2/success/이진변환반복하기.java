package programmers.Lv2.success;

public class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")) {
            int prevLen = s.length();
            s = s.replace("0","");
            int curLen = s.length();
            answer[1] += prevLen-curLen;
            s = Integer.toBinaryString(curLen);
            answer[0] += 1;
        }

        return answer;
    }
}
