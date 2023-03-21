package study.algorithm;

public class Login {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        int pw = Integer.parseInt(id_pw[1]);
        
        for(int i = 0 ; i < db.length ; i++ ) { 
            if(id.equals(db[i][0])) {
                if(pw == Integer.parseInt(db[i][1])) {
                    answer = "login";
                } else {
                    answer = "wrong pw";
                }
            } else {
                answer = "fail";
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Login main = new Login();
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
		
		System.out.println(main.solution(id_pw, db));
	}
}
