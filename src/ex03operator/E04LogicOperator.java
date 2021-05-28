package ex03operator;

public class E04LogicOperator {

	public static void main(String[] args) {
	
		/*
		논리연산자
			&& : 논리And, 양쪽모두가 true일때만 true를 반환하고,
				나머지는 false를 반환하는 연산자.
			|| : 논리Or. 한쪽만 true이면 true를 반환하고, 양쪽 모두 
				false일때만 false를 반환하는 연산자
			! : 논리Not. 반대의 논리를 반환하는 연산자
		 */
		
		int num1=10, num2=20;
		
		boolean result1 = (num1==100 && num2==20); // ==은 같은가 ? / && and이므로 둘다 참일경우만 true
		// f and t => false
		boolean result2 = (num1<12 || num2>=30); // || or이므로 둘중 하나만 참일경우 true출력
		// t or f => true
		
		System.out.println("result1의결과:" + result1);
		System.out.println("result2의결과:" + result2);
		
		// num1과 num2가 다를경우 true를 반환한다. 따라서 if블럭이 실행된다.
		if(!(num1==num2)) { // !는 not이므로 num1(10)==num2(20) 다르므로 !(not)를 사용해서 if(true)출력 
			System.out.println("num1과 num2는 다르다.");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}

	}

}
