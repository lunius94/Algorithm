package programmers.Lv1.success;
import java.util.regex.Pattern;

public class 옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String word : babbling) {
            if(canSpeak(word)) answer++;
        }
        return answer;
    }

    public boolean canSpeak(String word) {
        String[] canWords = {"aya","ye","woo","ma"};
        for(int i = 0; i < canWords.length; i++) {
            String regex = canWords[i];
            word = word.replace(regex,String.valueOf(i));
        }
        String[] words = word.split("");
        for(int i = 0 ; i < words.length; i++) {
            if(Pattern.matches("[a-z]",words[i])) {
                return false;
            }
            else if(i!=words.length-1 && Pattern.matches("[0-3]",words[i])) {
                if(words[i].equals(words[i+1])) {
                    return false;
                }
            }
        }
        return true;
    }
}
