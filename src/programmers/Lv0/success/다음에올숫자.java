package programmers.Lv0.success;

/*등차수열 혹은 등비수열 common이 매개변수로 주어질 때,
마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
 */
/*
[1, 2, 3, 4]	-> 5
[2, 4, 8]	-> 16
*/
/*
1. 입력받은 배열이 등비수열인지, 등차수열인지 확인해야 한다.
2.. 등차수열검증. 1번인덱스 - 0번 인덱스 == 2번인덱스 - 1번 인덱스
3. 등비수열검증 1번인덱스 / 0번 인덱스 == 2번인덱스 / 1번인덱스
4. 예외 처리. 0번 인덱스가 0일 수도 있다.
 */
public class 다음에올숫자 {
    public int solution(int[] common) {
        int answer = 0;
        if(common[1]-common[0]== common[2]-common[1]) {
            answer = common[1]-common[0];
            return common[common.length-1] + answer;
        } else {
            if (common[0] == 0) return 0;
            else {
                answer = common[1] / common[0];
                return common[common.length-1]*answer;
            }
        }
    }
}
