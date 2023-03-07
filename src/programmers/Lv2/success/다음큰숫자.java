package programmers.Lv2.success;

public class 다음큰숫자 {

    public int solution(int n) {
        int answer = 0;
        int one = Integer.toBinaryString(n).replace("0","").length();
        while(true) {
            n++;
            int temp = Integer.toBinaryString(n).replace("0","").length();
            if(temp==one) {
                answer = n;
                break;
            }
        }
        return answer;
    }

    public int solution1(int n) {
        int a = Integer.bitCount(n);
        int compare = n + 1;
        while (true) {
            if (Integer.bitCount(compare) == a)
                break;
            compare++;
        }
        return compare;
    }
}
