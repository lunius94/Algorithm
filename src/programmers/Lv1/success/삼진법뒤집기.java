package programmers.Lv1.success;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        삼진법뒤집기 sol = new 삼진법뒤집기();
        System.out.println(sol.solution1(45));
    }

    public int solution(int n) {
        int ex_divide = 1;
        int sum = 0;
        while(ex_divide>0) {
            int ex_max = ex_divide-1;
            if(n/(int)(Math.pow(3,ex_divide))==0) {
                int num = n;
                for(int i = 0; i<=ex_max; i++) {
                    sum += (int) (num/Math.pow(3,ex_max-i))*Math.pow(3,i);
                    num %= Math.pow(3,ex_max-i);
                }
                ex_divide = 0;
            } else {
                ex_divide++;
            }
        }
        return sum;
    }

    public int solution1(int n) {
        String str = "";

        while(n>0) {
            str+= n%3;
            n/=3;
        }

        return Integer.parseInt(str,3);
    }
}

