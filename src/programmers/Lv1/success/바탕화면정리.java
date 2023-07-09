package programmers.Lv1.success;


// top, left, bottom, right의 가장 끝에 있는 위치 찾기
// down과 right는 가장 마지막 index + 1;
public class 바탕화면정리 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int width = wallpaper[0].length();
        int height = wallpaper.length;
        int left = width;
        int top = height;
        int right = 0;
        int bottom = 0;

        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].substring(j,j+1).equals("#")) {
                    if(left>j) left = j;
                    if(right<j+1) right = j+1;
                    if(top>i) top = i;
                    if(bottom<i+1) bottom = i+1;
                    // Math의 스태틱메소드를 쓰면 더 좋을지도?
                }
            }
        }
        answer = new int[]{top,left,bottom,right};
        return answer;
    }
}
