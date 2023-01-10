package programmers.Lv0.fail;

import java.util.ArrayList;
import java.util.List;

/*
한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
같은 식이라면 가장 짧은 수식을 return 합니다
 */
/*
"3x + 7 + x"  -> "4x + 7"
"x + x + x"	  -> "3x"
 */
/* 접근방법
1. 우선 문자열을 split(" + ")로 모두 분리한 배열을 생성한다.
2. 새로운 배열을 생성해서 x를 포함한 요소만 따로 저장한다.
3. 배열에서 "x"를 포함하고 있는 요소에서 "x"를 replace()로 제거한다.
4. 만약 "x"라면 "1"로 대체한다.
5. "x"를 포함하고 있던 요소에서 "x"를 대체한 문자열을 모두 int타입으로 바꿔서 더해준다.
6. "x"를 포함하지 않은 문자열을 int타입으로 변경해서 모두 더해준다.
7.
 */
public class 다항식더하기 {
    public String solution(String polynomial) {
        int number = 0;
        int xNumber = 0;
        String[] strArr = polynomial.split("\\+");
        for(String str : strArr) {
            if (str.contains("x")) {
                if (str.equals("x")) str = str.replace("x", "1");
                else str = str.replace("x", "");
                xNumber += Integer.parseInt(str);
            } else number += Integer.parseInt(str);
        }
        String answer="";
        if(xNumber==0) {
            if(number == 0) return answer;
            else answer += number;
        } else if(xNumber ==1) {
            if (number==0) return answer += "x";
            else answer += "x"+number;
        } else {
            if(number==0)answer += xNumber+"x";
            else answer+= xNumber+"x + "+number;
        }
        return answer;
    }

    //다른사람의 풀이
    public String solution1(String polynomial) {
        String answer="";
        String[] split=polynomial.split("\\s\\+\\s");       //매개변수로 들어온 다항식을 전부 쪼깨서 배열에 넣음
        int con=0;                                          //상수를 넣을 변수 con
        int unk=0;                                          //미지수x 의 계수를 더할 unk
        for(int i=0; i<split.length; i++) {
            if(split[i].matches("^[0-9]+$")) {              //만약 배열의 i번째 값이 정수면
                con+=Integer.parseInt(split[i]);            //con 에 더함
            } else if(split[i].equals("x")) {               //만약 배열의 i번째 값이 x 이면
                unk+=1;                                     //unk에 1을 더함
            } else if(split[i].contains("x")) {             //만약 배열의 i번째 값이 x를 포함하면
                unk+=Integer.parseInt(split[i].substring(0, split[i].length()-1));  //x의 계수만 unk에 더함
            }
        }

        if(unk!=0 && con==0) {          //만약 상수가 0 이고
            if(unk==1) answer="x";      //미지수 x의 계수가 1이면 그냥 x 만 리턴
            else answer=unk + "x";      //미지수 x의 계수가 1이 아니면 계수를 붙여서 리턴
        }
        if(unk==0 && con!=0) {          //만약 미지수는 없고 상수만 있으면
            answer=String.valueOf(con); //상수만 리턴
        }
        if(unk!=0 && con!=0) {                    //만약 상수와 미지수가 있고
            if(unk==1) answer="x" + " + " + con;  //미지수 x의 계수가 1이면 x+상수 를 리턴
            else answer=unk + "x" + " + " + con;  //미지수 x의 계수가 1이 아니면 계수x+상수 를 리턴
        }
        return answer;
    }
    public String solution2(String polynomial) {
        int xCount = 0;
        int num = 0;

        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) {
                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "") + (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
    }
}

