package programmers.Lv0.success;
/*
지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
 */
/*
board	                                                                                                                          result
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]	                                                16
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]	                                                13
[[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]             0
*/
/*
이중배열 board의 상하좌우로 한칸씩 더 있는 배열을 만드는 방법을 사용했는데 더 큰 배열을 만들지 않고
같은 크기의 배열을 만들어서 try-catch문으로 ArrayIndexOutOfBoundsException을 처리하는 방법도 괜찮아 보인다.
그런데 try-catch문을 썼을 때 ArrayIndexOutOfBoundsException이 발생하면 반복문 내용을 계속 실행하는지
반복문이 그자리에서 종료되고 다음 반복을 실행하는지 테스트 해봐야겠다.
 */
public class 안전지대 {
    public int solution(int[][] board) {
        int n = board[0].length;
        int[][] newBoard = new int[n+2][n+2];
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n; j++) {
                if(board[i-1][j-1]==1) {
                    newBoard[i-1][j-1] =1;
                    newBoard[i-1][j] =1;
                    newBoard[i-1][j+1]=1;
                    newBoard[i][j-1] = 1;
                    newBoard[i][j]=1;
                    newBoard[i][j+1]=1;
                    newBoard[i+1][j-1]=1;
                    newBoard[i+1][j]=1;
                    newBoard[i+1][j+1]=1;
                }
            }
        }
        int answer = 0;
        for(int i =1; i<=n;i++) {
            for(int j = 1; j<=n; j++) {
                if(newBoard[i][j]==0) answer++;
            }
        }
        return answer;
    }
}