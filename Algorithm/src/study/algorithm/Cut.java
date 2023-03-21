package study.algorithm;

public class Cut {
    public String[] solution(String my_str, int n) {
        int mod = my_str.length() % n;
        int num = 0;
        
        if(mod > 0) {
            num = (my_str.length() / n) + 1;
        } else {
            num = my_str.length() / n;
        }
        
        String[] answer = new String[num];
        String str = "";
 
        for(int i = 0 ; i < num ; i++ ) {
            str = my_str.substring(n*i, n*(i+1) > my_str.length() ? my_str.length() : n*(i+1));
            answer[i] = str;
        }
        
        return answer;
    }
}
