package programmers.Lv1.success;
import java.io.*;
import java.util.*;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] hasTwo = new boolean[n+1];
        boolean[] hasOne = new boolean[n+1];
        Arrays.fill(hasOne,true);
        int answer = 0;
        for(int student : reserve) {
            hasTwo[student] = true;
            hasOne[student] = true;
        }
        for(int student : lost) {
            if(hasTwo[student]) {
                hasTwo[student] = false;
            }
            else hasOne[student] = false;

        }
        for(int i=1 ; i < n+1; i++) {
            if(hasTwo[i]) {
                // 여기 아래를 줄일수 있는 방법을 생각해보자.
                if(i==1) {
                    if(!hasOne[i+1]) {
                        hasTwo[i] = false;
                        hasOne[i+1] = true;
                    }
                }
                else if(i==n){
                    if(!hasOne[i-1]) {
                        hasTwo[i] = false;
                        hasOne[i-1] = true;
                    }
                }
                else {
                    if(!hasOne[i-1]) {
                        hasTwo[i] = false;
                        hasOne[i-1] = true;
                        continue;
                    }
                    else if(!hasOne[i+1]) {
                        hasTwo[i] = false;
                        hasOne[i+1] = true;
                    }
                }
            }
        }
        for(int i = 1; i < n+1; i++) {
            if(hasOne[i]) answer++;
        }


        return answer;
    }

    public int solution1(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost)
            people[l-1]--;
        for (int r : reserve)
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else
                    answer--;
            }
        }
        return answer;
    }
}
