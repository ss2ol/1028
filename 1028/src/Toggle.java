
public class Toggle {

	public static void main(String[] args) {
		// 3초 마다 2가지 동작을 번갈아 10번 하기
		for (int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}

			if(i % 2 == 0) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
		}


		for (int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}

			if(i % 3 == 0) {
				System.out.println("a");	
			}else if (i%3==1) {
				System.out.println("b");
			}else {
				System.out.println("c");
			}







		}

	}
}

