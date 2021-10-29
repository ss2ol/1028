
public class PrimeCheck {

	public static void main(String[] args) {
		// prime(소수) : 1과 자기 자신으로만 나누어 떨어지는 수
		//소수 판별하는 방법 : 2부터 자신의 절반이 되는 숫자까지 나누어서 
		//한번도 나느어 떨어지지 않으면 소수

		int su =11;
		//su 가 소수인지 확인 
		boolean flag = true;

		for (int i=2; i<su/2+1; i=i+1 ) {
			if (su % i == 0 ) {
				flag = false;
				break;
			}
		}
		if(flag == true ) {
			System.out.println("소수");
		}else {
			System.out.println("소수 아님");

		}



	}

} 
