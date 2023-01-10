package programmers.Lv0.success;
/*
3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다.
3x 마을 사람들의 숫자는 다음과 같습니다.
0진법 	3x 마을에서 쓰는 숫자	        10진법	        3x 마을에서 쓰는 숫자
1           	        1	                            6	                         8
2	                    2	                            7	                        10
3	                    4	                            8	                        11
4	                    5	                            9	                        14
5	                    7	                           10                      	16
 */
/*
3x마을에서 쓰는 숫자를 나타내는 int answer =0을 선언한다.
n번 반복하는 for문을 작성한다
for문 안에서 while(true)를 작성한다.
만약 num이 3의 배수거나 3을 포함하고 있으면 num에 1을 더하고, 아니면 break한다.
 */
public class 저주의숫자3 {
    public static int solution(int n) {
        int answer = 0;
        //1부터 n까지 반복
        for (int i = 0; i < n; i++) {
            //break가 터질 때 까지 반복한다.
            while(true) {
                // answer에 1을 더한다
                answer++;
                // answer가 3의 배수면 반복문 다시 실행
                if(answer%3==0) continue;
                // answer가 3의 배수가 아닌데 3을 포함하면 반복문 다시 실행
                else if(String.valueOf(answer).contains("3")) continue;
                // 두 조건을 모두 만족하지 않으면 while문 종료
                else {
                    break;
                }
            }
        }
        return answer;
    }
    // 다른 사람의 풀이
    // 내가 풀었던 if문을 모두 while문에 집어넣어서 조금 더 코드를 압축했다.
    public int solution1(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }

}
