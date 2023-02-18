package programmers.Lv1.success;

public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0;i < nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                for(int k = j+1; k<nums.length; k++) {
                    int target = nums[i]+nums[j]+nums[k];
                    if(target%2!=0 &&isPrime(target)) answer++;
                }
            }
        }
        return answer;
    }

    boolean isPrime(int n) {
        double root = Math.sqrt(n);

        for(int i = 3; i <= root; i+=2) {
            if(n%i==0) return false;
        }
        return true;
    }
}
