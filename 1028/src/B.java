
public class B {

	public static void main(String[] args) {
		// 키보드로 입력 받을 수 있는 인스턴스 생성
		java.util.Scanner sc =
				new java.util.Scanner(System.in);
		
		System.out.print("이름을 입력하세요:");
		String name = sc.nextLine();
		System.out.println("이름:" + name);
		
		System.out.print("점수을 입력하세요:");
		int score = sc.nextInt();
		System.out.println("점수:" + score);
		
		System.out.print("별명을 입력하세요:");
		sc.nextLine();
		String nick = sc.nextLine();
		System.out.println("별명:" + nick);
		
		sc.close();
		
		

	}

}
