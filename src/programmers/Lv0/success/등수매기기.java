package programmers.Lv0.success;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
(점수가 같은 사람이 있으면 공동 등수, 그리고 다음 등수는 건너뛰고 진행. 2등이 2명이면 3등은 존재하지 않음)
 */
/*
[[80, 70], [90, 50], [40, 70], [50, 80]]  ->	[1, 2, 4, 3]
 */
/*
평균을 구해야하지만 과목수가 모두 같으므로 합계로만 등수 계산
1. 점수의 합산으로 새로운 배열 생성 -> for문으로
2. 등수를 저장할 새로운 등수배열 생성, 배열의 모든 값을 1로 저장
3. 점수 배열의 첫번째값부터 시작해서, 첫번째 값보다 작다면 등수배열의 해당 인덱스 1증가
4. 같거나 크다면 아무행동x
 */
public class 등수매기기 {
    public static int[] solution(int[][] score) {
        // 점수 합산 배열 생성
        int[] scoreArr = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            scoreArr[i] = score[i][0] + score[i][1];
        }
        // 등수를 저장할 새로운 배열 생성, 모두 1로 채우기
        int[] rankArr = new int[score.length];
        Arrays.fill(rankArr, 1);

        // 점수배열의 0번 인덱스 부터 배열의 모든 값 비교하는 반복문
        for (int i = 0; i < scoreArr.length; i++) {
            // 중복 비교를 피하기 위해서 범위를 j<i까지
            for (int j = 0; j < scoreArr.length; j++) {
                if (scoreArr[j] > scoreArr[i]) {
                    rankArr[i]++;
                }
            }
        }
        return rankArr;
    }

    //다른 사람의 풀이
    public int[] solution1(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for (int[] t : score) {
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return answer;
    }

    // 다른 사람의 풀이
    public int[] solution2(int[][] score) {
        // 2중 배열을 Stream<int[]>로 변경 후 배열의 요소들의 평균을 스트림에 저장
        Stream<Double> doubleStream = Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0));
        // 평균 -> 평균이 들어있는 스트림을 역순으로 정렬하고 리스트로 변경한 뒤 평균이 위치한 인덱스+1로 값을 변경해라.
        IntStream intStream = doubleStream.mapToInt(d -> Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0)).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(d) + 1);

        return Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0))
                .mapToInt(d -> Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0)).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(d) + 1).toArray();
    }
}

