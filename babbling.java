package study.algorithm;

public class babbling {
	public int solution(String[] babbling) {
		int answer = 0;
		String ong = "";
		String[] baby = { "aya", "ye", "woo", "ma" };

		for (int i = 0; i < babbling.length; i++) {
			ong = babbling[i];
			for (int j = 0; j < baby.length; j++) {
				ong = ong.replace(baby[j], " ");
			}
			if (ong.replace(" ", "").length() == 0) {
				answer++;
			}
		}

		return answer;
	}
}
