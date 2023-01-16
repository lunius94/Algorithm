package programmers.Lv1.success;

public class 정수제곱근판별 {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        if((long)Math.pow(sqrt,2)==n) return (long)Math.pow(sqrt+1,2);
        else return -1L;
    }
}
