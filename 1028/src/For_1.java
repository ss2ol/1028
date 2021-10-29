
public class For_1 {

	public static void main(String[] args) {
		//Hollo World 3 번 출력
		int i = 0;
		while(i<3) {
			System.out.println("Hollo World");
			i = i+1;
			
		}
	    
		System.out.println("================");
		
		//for를 이용 동일한 내용 작성
		for(int j=0; j<3; j=j+1) {
			System.out.println("Hollo World");
		}
		
		//image1.png,image2.png,image3.png를 for를 이용해서 출력
		
		for(int k=1; k<4; k=k+1) {
			System.out.println("image" + k + ".png");
		}
	
		//제어문 안에서 만든 변수는 제어문 밖에서 사용할 수 없음
		//System.out.println("k");
		//for 첫번쩨 문장에서 변수를 반드시 생성할 필요 없음 (기존의 변수 재사용 가능)
		
		
		
		
		
		
	}

}
