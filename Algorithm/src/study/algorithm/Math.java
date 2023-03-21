package study.algorithm;

public class Math {
	public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String code;
        int Xq = 0;
        int Yq = 0;
        int result = 0;
        
		for (int i = 0; i < quiz.length; i++) {
			Xq =  Integer.parseInt(quiz[i].split(" ")[0]);
            Yq =  Integer.parseInt(quiz[i].split(" ")[2]);
            result = Integer.parseInt(quiz[i].split(" ")[4]);
            code = quiz[i].split(" ")[1];
			
			
			if(code.equals("+")) {
				if(Xq + Yq == result) {
					answer[i] = "O";
				} else {
					answer[i] = "X";				
				}
			} else {
				if(Xq - Yq == result) {
					answer[i] = "O";
				} else {
					answer[i] = "X";				
				}
			}
		};
		
        return answer;
    }
}
