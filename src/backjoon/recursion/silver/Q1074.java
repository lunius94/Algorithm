package backjoon.recursion.silver;
import java.io.*;
import java.util.*;
public class Q1074 {
    /**
     * 접근법
     *  사분면의 번호는 다음과 같이 정한다.
     *  1    2
     *
     *  3    4
     *
     * 1. column과 row를 기준값(Math.pow(2,N)/2)로 나눈 몫을 기준으로 사분면을 판별한다.
     * 2. column을 기준값으로 나눈 몫이 0이면 첫번째, 두번째 / 1이면 세번째, 네번째 사분면
     * 3. row를 기준값으로 나눈 몫이 0이면 첫번째, 세번째 / 1이면 두번째, 네번째 사분면
     * 4. 나머지를 새로운 column과 row로 지정하고 재귀함수를 통해 해당 사분면부터 다시 탐색한다.
     * 5. 재귀함수의 매개변수는 column과 row, N, start(시작번호))
     * 6. N이 1이 됐을 때의 값을 return
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());

        int result = recursion(column,row,N,0);
        System.out.println(result);


    }
    static int recursion(int column, int row, int N, int start) {
        int target = 0;
        if(N==1) {
            int[][] result = new int[2][2];
            result[0][0] = start;
            result[0][1] = start+1;
            result[1][0] = start+2;
            result[1][1] = start+3;
            return result[column][row];
        }
        else {
            int exp = (int) Math.pow(2,N);
            int mid = exp/2;
            int diff = exp*exp/4;
            if(column/mid==0 && row/mid==0) {
                target = recursion(column,row,N-1,start);
            }
            else if(column/mid==0 && row/mid==1) {
                target = recursion(column,row%mid,N-1,start+diff);
            }
            else if(column/mid==1 && row/mid ==0) {
                target = recursion(column%mid,row,N-1,start+diff*2);
            }
            else if(column/mid==1 && row/mid == 1) {
                target = recursion(column%mid,row%mid,N-1,start+diff*3);
            }
        }
        return target;
    }










    /*
    // 이대로 모든 행렬을 출력하면 재귀때문에 메모리 터진다!!!!!!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int exp = (int)Math.pow(2,N);
        int[][] arr = recursion(0,exp);
        System.out.println(arr[column][row]);
    }

    static int[][] recursion(int start,int exp) {
        int[][] result = new int[exp][exp];
        if(exp == 2) {
            result[0][0] = start;
            result[0][1] = start+1;
            result[1][0] = start+2;
            result[1][1] = start+3;
            return result;
        }
        else {
            int diff = exp*exp/4;
            for(int i = 0; i <4; i++) {
                int[][] recursion = recursion(start+i*diff,exp/2);
                if(i == 0) {
                    for(int j = 0; j<exp/2; j++) {
                        System.arraycopy(recursion[j],0,result[j],0,exp/2);
                    }
                }
                else if(i==1) {
                    for(int j = 0; j<exp/2; j++) {
                        System.arraycopy(recursion[j],0,result[j],exp/2,exp/2);
                    }
                }
                else if(i==2) {
                    for(int j = 0; j<exp/2; j++) {
                        System.arraycopy(recursion[j],0,result[j+exp/2],0,exp/2);
                    }
                }
                else {
                    for(int j = 0; j<exp/2; j++) {
                        System.arraycopy(recursion[j],0,result[j+exp/2],exp/2,exp/2);
                    }
                }
            }
        }
        return result;
    }

     */
}
