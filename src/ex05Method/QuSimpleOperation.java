package ex05Method;
/*
문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.

메소드명 : arithmetic()
실행결과]
덧셈결과 -> 177
뺄셈결과 -> 23
곱셈결과 -> 7700
나눗셈 몫 -> 1
나눗셈 나머지 -> 23


 */
import java.util.Scanner;

public class QuSimpleOperation {
	
//	static int global_add = 0; // 전역변수 위에서 선언하면, 지역내에서도 모두 사용가능.

	
	public static void main(String[] args) {

		
		int a = 0;
		int b = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();

		System.out.println("a==> "+a);
		System.out.println("b==> "+b);
		
		int add = arithmetic(a, b);
		System.out.println("덧셈결과->" + add);

		int sub = arithmetic2(a, b);
		System.out.println("뺄셈결과->" + sub);

		int mult = arithmetic3(a, b);
		System.out.println("곱셈결과->" + mult);

		int divi = arithmetic4(a, b);
		System.out.println("나눗셈결과->" + divi);
	
		int divi1 = arithmetic5(a, b);
		System.out.println("나머지결과->" + divi1);

	}
	
	public static int arithmetic(int a, int b) {
//			int add = a + b;
			int add = 0;
			return add;
	}
		
		public static int arithmetic2(int a, int b) {
			int sub = a - b;
			return sub;
	}
		public static int arithmetic3(int a, int b) {
			int mult = a * b;
			return mult;
	}
		public static int arithmetic4(int a, int b) {
			int divi = a / b;
			return divi;
	}
		public static int arithmetic5(int a, int b) {
			int divi1 = a % b;
			return divi1;
	}
		 /*
		
		static void arithmetic(int num1, int num2) {
			
			System.out.printf("덧셈:%d + %d = %d\n", num1, num2, (num1+num2));
			System.out.printf("뺄셈:%d - %d = %d\n", num1, num2, (num1-num2));
			System.out.printf("곱셈:%d * %d = %d\n", num1, num2, (num1*num2));
			System.out.printf("나눗셈:%d / %d = %d\n", num1, num2, (num1/num2));
			
			// %기호를 콘솔에서 출력하기 위해서 이스케이프 시퀀스를 사용함.
			System.out.printf("나머지:%d %% %d = %d\n", num1, num2, (num1%num2));
			
			
		}
		
		public static void main(String [] arga) {
			
			arithmetic(10, 22);
			
			
		}
		*/

}
