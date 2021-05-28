package ex07string;

public class E01StringBasic01 {

	public static void main(String[] args) {
		
		
		int num1 = 10, num2 = 20;
		String numResul = (num1==num2) ?
				"데이터가 같다" : "데이터가다르다";
		System.out.println("비교결과 :" + numResul );
		
		String str1 = new String("Hello Java");
		String str2 = new String("Hello java");
		
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 동일하다.");
		}
		else {
			System.out.println("두 문자열은 동일하지 않다.");
		}
		
		String str3 = "KOSMO";
		String str4 = "KOSMO";

		if(str3==str4) {
			System.out.println("주소가같다");
		}
		else {
			System.out.println("주소가 다르다");
		}
	}

}
