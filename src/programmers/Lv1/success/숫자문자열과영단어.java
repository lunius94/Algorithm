package programmers.Lv1.success;

public class 숫자문자열과영단어 {
    public int solution(String s) {
        s = s.replace("one","1")
                .replace("two","2")
                .replace("three","3")
                .replace("four","4")
                .replace("five","5")
                .replace("six","6")
                .replace("seven","7")
                .replace("eight","8")
                .replace("nine","9")
                .replace("zero","0");
        return Integer.parseInt(s);
    }

    public int solution1(String s) {
        String[] digit = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i<10; i++) {
            s= s.replace(eng[i],digit[i]);
        }
        return Integer.parseInt(s);
    }

}
