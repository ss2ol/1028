
public class Array_1 {

	public static void main(String[] args) {
		// 3개의 점수를 저장
		
		int score1 = 90;
		int score2 = 93;
		int score3 = 89;
		
		
		//3개를 출력
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		
		//묶어서 저장 =배열
		int [] scores = {90, 93, 89, 45, 22};
		for(int i=0; i<scores.length; i=i+1) {
			System.out.println(scores[i]);
		}
		
		for(int score : scores) {
			System.out.println(score);
		}
		
		
		
		
		
		
	}

}
