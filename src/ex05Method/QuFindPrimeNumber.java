package ex05Method;
/*
문제5-4) 파일명 : QuFindPrimeNumber.java  (난이도:상)

전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고, 이를 이용해서 
1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.

메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.

실행결과]
2
3
5
7
……중략……
97


1. isPrimeNumber()메소드 만들기
2. 전달된 값이 소수인지 아닌지 판단
3. 소수인경우 true를 아니면 false반환 / if문
4. 메인으로 리턴
5. 1-100사이 소수를 모두 출력 

 */

/*
절대 소수의 배수는 소수가 될 수 없음.
절대 소수는 2, 3, 5, 7
즉 2, 3, 5, 7로 나누었을때 값이 0이면 소수가 아님.

 */
public class QuFindPrimeNumber {

	/*
	public static void main(String[] args) {
		
		for(int sosu = 1 ; sosu <= 100; sosu++ ) {
			boolean booleanString = isPrimeNumber(sosu);

			if(booleanString) {
				System.out.println(sosu);
			}

//			System.out.println("소수 "+ sosu+" 는"+booleanString+ "입니다");
		}
		
	}
	
	public static boolean isPrimeNumber(int sosu) {
		
		
		if(sosu != 1 && sosu != 2 && sosu != 3 && sosu != 5 && sosu != 7) {
			if(sosu%2 == 0 || sosu%3 == 0 || sosu%5 == 0 || sosu%7 == 0) {
				return false;
			}
			return true;
		}
		
		return true;
	}
	*/
	static boolean isPrimeNumber(int num)
	{
		if(num==1) {
			//1은 소수가 아니므로 무조건 false 반환
			
			return false;
		}
		else {
			/*
			모든 자연수는 1과 자기자신으로 나눠지므로 두 숫자를 제외한 나머지 수로 나눠서 떨어지는지 판단하면된다.
			 */
			for(int i=2; i<=num-1; i++) {
				// 만약 i로 나눠서 떨어지면 소수가 아니므로 false반환
				if(num%i==0)
					return false;
			}
		}
		//위 조건을 통과하면 소수이므로 true반환
		return true;
	}
	
	public static void main(String[] args) {
	// 1~100사이의 정수를 정수인지 판단하기 위하여
		
		for(int i=1 ; i <=100; i++) {
			//아래 함수를 호출하여 소수이면 true를 반환한다.
			if(isPrimeNumber(i) ==true) {
				//해당 숫자 i가 소수라면 콘솔에 출력한다.
				System.out.println("소수:" + i);
				
			}
		}
	}
}
