package programmers.Lv1.success;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String stars = phone_number.substring(0, length - 4);
        stars = stars.replaceAll("[0-9]", "*");

        return stars + phone_number.substring(length - 4, length);
    }

    // 정규식 전방탐색
    public String solution1(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
