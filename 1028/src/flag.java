
public class flag {

	public static void main(String[] args) {
		// 인데스 변수를 이용해서 반복문이 끝까지 수행되었는지 확인
		int j;

		for(j=0; j<5; j=j+1) {
			if(j % 4 == 1) {
				break;
			}
			System.out.println("확인");
		}

		if(j == 5) {
			System.out.println("수행");
		}else {
			System.out.println("종료");
		}


		System.out.println(j);
		/////////////////////////////////////////
		System.out.println("======================");

		boolean flag = true;
		for(j=0; j<5; j=j+1) {
			if(j % 4 == 1) {
				flag = false;
				break;
			}
			System.out.println("확인");
		}
		
		if(flag == true) {
			System.out.println("진행");
		}else {
			System.out.println("종료");
		}


		
		
	}
}

