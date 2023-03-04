package programmers.Lv2.success;

public class 예상대진표 {
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int A = Math.min(a,b);
        int B = Math.max(a,b);

        while(true) {
            answer++;
            if(!isEven(A)) A+=1;
            if(!isEven(B)) B+=1;
            if(A==B) break;

            A/=2;
            B/=2;
        }

        return answer;
    }

    public boolean isEven(int num) {
        if(num%2==0) return true;
        else return false;
    }

    public int solution1(int n, int a, int b)
    {
        return Integer.toBinaryString((a-1)^(b-1)).length();
    }
}
