
public class Ransdom {

	public static void main(String[] args) {
		java.util.Random r = new java.util.Random();
		for(int i=0; i<6; i=i+1) {
			int x = r.nextInt(45);
			System.out.println(x+1);
			
		}
		
	}

}
