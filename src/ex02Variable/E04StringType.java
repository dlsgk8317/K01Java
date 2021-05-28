package ex02Variable;

public class E04StringType {

	public static void main(String[] args) {
		
		/*
		String 타입 : 참조형 변수로써 기본자료형이 아님.
			문자열을 저장할수있는 자료형으로 실제로는 class이다.
			자바에서는 문자열을 표현할때 ""으로 감싸면되고, 연결할때 + 기호를 사용한다.
		 */
		int number;
		number = 99;
		
		/*
		참조형 변수와 기본자효령 변수 사이에서는 형변환이 불가능하다.
		서로 사용하는 메모리 공간이 다르기 떄문이다
		- 기본자료형 : 스택(stack)영역 사용
		- 참조형(클래스)변수 : 힙(Heap)영역 사용
		 */
		
		//int stringNumber1 = (int)"100"; -> ("")의 경우 문자열(String)에서만 사용가능하나, int로 선언하였기때문에 에러발생 
												// 만약, "100"-> 100으로 값을 넣어주면 에러가 발생하지않는다.
		
		//String stringNumber2 = (String)100; -> string형은 문자열이지만 ("")를사용하지 않아서 에러발생 
												// 만약, 100 -> "100"으로 값을 넣어주면 에러가 발생하지않는다.
		
		/*
		문자열 + 정수 = 문자열
		즉 문자열에 정수가 연결된 형태로 출력된다.
		 */
		
		String strNumber = "100";
		System.out.println(strNumber + number);
		
		/*
		String은 클래스이므로, new 키워드를 이용하서 인스턴크(객체)를 생성한 후 문자열을 참조한다.
		 */
		
		String newString = new String("new 키워드 사용"); 
		System.out.println(newString);
		
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		System.out.println(stringBasic +" " + plusString); // 문자열 + 문자열 => 문자열 연결됨
		
		/*
		문자열 + 숫자 => 우선순위가 없다면 일반적으로 문자열로 출력된다.
			단, 산술연산의 결과를 출력하고 싶다면, 아래와 같이 소괄호로 묶어 우선순위에 대한 변화를 주면된다.
		 */
		
		int kor=100, eng=99, math=98;
		System.out.println("총점: "+kor+eng+math); // 괄호없이 + 로만 사용되어 연결의 의미로 사용되어 출력된다 -> 총점: 1009998
		System.out.println("총점: "+(kor+eng+math)); // "총점"+(kor+eng+math) 사이에 괄호가 들어가있어, 연결이아닌 덧셈으로 사용된다 -> 총점297
		
		
	}

}
