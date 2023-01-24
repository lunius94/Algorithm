package backjoon.String;
import java.util.*;
import java.io.*;
/*
    1. 문자를 입력 받는다.
    2. 입력받은 문자를 모두 소문자로 변경한다.
    3. 배열을 만들어서 a부터 z까지 있는 갯수를 센다
    4 .배열을 복사하고 내림차순 정렬해서 0번과 1번인덱스 비교

 */

public class Q1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] arr = new int[26];
        for(char c = 'A'; c<='Z'; c++) {
            for(int i = 0; i < str.length(); i++ ) {
                if(str.charAt(i)==c) arr[c-'A']++;
            }
        }
        int[] copyArr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copyArr);
        if(copyArr[copyArr.length-1]==copyArr[copyArr.length-2]) {
            System.out.println("?");
        } else {
            int index = 0;
            for(int i = 0; i<arr.length; i++) {
                if(arr[i] == copyArr[copyArr.length-1]) {
                    index = i;
                }
            }
            char c = (char) ('A' + index);
            System.out.println(c);
        }
    }
}
