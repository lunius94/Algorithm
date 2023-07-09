package programmers.Lv1.fail;

public class 키패드누르기 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;

        for(int tmp : numbers) {
            if(tmp%3 == 1) {
                answer += "L";
                left = tmp;
            }
            else if (tmp != 0 && tmp % 3 == 0) {
                answer += "R";
                right = tmp;
            }
            else {
                if(tmp==0) {
                    tmp = 11;
                }
                int leftDis = Math.abs(tmp - left) / 3 + Math.abs(tmp - left) % 3;
                int rightDis = Math.abs(tmp - right) / 3 + Math.abs(tmp - right) % 3;

                if(leftDis == rightDis) {
                    if(hand.equals("left")) {
                        left = tmp;
                        answer += "L";
                    }
                    else {
                        right = tmp;
                        answer += "R";
                    }
                }
                else if(leftDis<rightDis) {
                    left = tmp;
                    answer += "L";
                }
                else {
                    right = tmp;
                    answer += "R";
                }
            }

        }
        return answer;
    }
}
