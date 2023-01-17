package programmers.Lv1.success;

public class 하샤드수 {
    public boolean solution(int x) {
        int num = String.valueOf(x).chars().map(e -> e - 48).sum();
        return x%num==0;
    }


    public boolean solution1(int x) {
        int target = x;
        int sum = 0;
        while(x>0) {
            sum += x%10;
            x/=10;
        }
        return target%sum==0;
    }
}
