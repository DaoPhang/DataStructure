
public class Robot {
    
    // has data/attributes
    // has methods/actions
    void speak() {
        System.out.println("Hello Human...");
    }
    
    void speak(String text) {
        System.out.println("Hello human...");
        System.out.println(text);
    }
    
    int calculate_min_jump(int height, String text) {
        int NBA_min = 200;
        //System.out.println("Jumping: " + height + " " + text);
        int answer = height - NBA_min;
        System.out.println(text);
        return answer;
    }
}
