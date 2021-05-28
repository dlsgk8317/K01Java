package ex05Method;

/*
	 문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
	원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.
	메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
	-넓이공식 : 3.14 * 반지름 * 반지름 
	-둘레공식 : 2 * 3.14 * 반지름
 */

// 1. 반지름 정하기
// 2. circleArea() 여기로 파라미터 반지름 전달하기 (반지름은 입력받기)
// 3. circleArea() 원의 넓이 계산 : 3.14 * 반지름 * 반지름 -> return 
// 4. circleRound() 여기로 파라미터 반지름 전달하기 (반지름은 입력받기)
// 5. circleRound() 2 * 3.14 * 반지름 -> return
// 6. main에서 호출하는 메소드를 정의 -> 원의넓이와 둘레 출력하는 함수 호출(호출시 반지름 넘겨줄것)
//

// 반지름을 1이라고 가정하자


public class QuCircleCalculator {
	
	public static void main(String[] args) {
//		int targetInt= 0;
//		String targetString = "test";
//		
//		
//		test(targetString);
		
		double radius = 5.5;
		double circleAreaReturn = circleArea(radius);
		double circleRoundReturn = circleRound(radius);
		
		System.out.println("원의넓이:" + circleAreaReturn);
		System.out.println("둘레:" + circleRoundReturn);

	}
	
	public static double circleArea(double radius) {
		
		double circleAreaReturn = 3.14 * radius * radius;
		return circleAreaReturn;
	
	}
	
	public static double circleRound(double radius) {
		
		double circleRoundReturn = 2 * 3.14 * radius;
		return circleRoundReturn;
	}
	
	

//	public static void test(int a) {
//		System.out.println("test 파라미터 int 호출");
//	}
//	
//	public static void test(String a) {
//		System.out.println("test 파라미터 String 호출");
//	}
//	
//	public static void test(String b, int a) {
//		System.out.println("test 파라미터 String, int 호출");
//	}
//	
//	public static void test(int a, String b) {
//		System.out.println("test 파라미터 int, String 호출");
//	}
   

// 원의 넓이와 둘레는 원주율 3.14를 곱해야 하므로 반환형은 실수로 정의한다.
/*
	public static void main(String[] arge) {
		
		System.out.println("원의넓이:" + circleArea(10.2));
		System.out.println("원의둘레:" + circleRound(12.5));
	}
 //넓이
	static double circleArea(double rad) {
		
		double result = 3.14 * rad * rad;
		return result;
		
	}
// 둘레
	static double circleRound(double rad) {
		
		return 2 * 3.14 * rad;

	}
*/
}
