package programmers.Lv1.success;

public class 콜라츠추측 {
    public int solution(int num) {
        long target = num;
        if(target==1) return 0;
        int count = 0;
        while(count<=500) {
            count++;
            if(target%2==0) target/=2;
            else {
                target= target*3 +1;
            }

            if(target==1) return count;

        }
        return -1;
    }
}
