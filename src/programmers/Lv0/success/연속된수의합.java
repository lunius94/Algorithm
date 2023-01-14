package programmers.Lv0.success;

/*
연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다.
연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
 */
/*
num	    total	    result
3	        12	     [3, 4, 5]
5	        15	     [1, 2, 3, 4, 5]
4	        14	     [2, 3, 4, 5]
5	        5	     [-1, 0, 1, 2, 3]
 */
/*
1. num가 홀수인경우, 짝수인 경우를 구분한다.
2. 홀수인 경우 시작점과 짝수인 경우 시작점을 구해서 시작점으로 부터 1씩 증가시키면서 num개 더한다.
 */
public class 연속된수의합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start;
        if (num % 2 == 1) {
            start = total / num - num / 2;
            for (int i = 0; i < num; i++) {
                answer[i] = start + i;
            }
        } else {
            start = total / num - num / 2 + 1;
            for (int i = 0; i < num; i++) {
                answer[i] = start + i;
            }
        }
        return answer;
    }

    // 다른사람의 풀이
    // 등차수열의 합 공식을 이용하면 굉장히 쉽게 풀리는 문제였다.
    // 왜 진작 생각을 못했을까..
    public int[] solution1(int num, int total) {
        int[] answer = new int[num];
        int check = num*(num+1) / 2;
        int start = (total - check) / num + 1;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start + i ;
        }
        return answer;
    }
}

