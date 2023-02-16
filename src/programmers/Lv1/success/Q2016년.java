package programmers.Lv1.success;

public class Q2016년 {
    public String solution(int a, int b) {
        int[] days = {0,31,60,91,121,152,182,213,244,274,305,335};
        int later = days[a-1]+b-1+5;
        later%=7;
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        return day[later];
    }
}
