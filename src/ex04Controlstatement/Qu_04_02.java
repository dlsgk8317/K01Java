package ex04Controlstatement;

import java.io.IOException;

/*
문제2) 파일명 : Qu_04_02.java
하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
(System.in.read()를 사용하세요)

 */
public class Qu_04_02 {

	public static void main(String[] args) throws IOException {
	
		
		System.out.print("하나의문자를 입력하세요: ");
		
		int ascii = System.in.read();
		/*
		삼항연산자의 형식
			변수 = (조건) ? "참일때" : "거짓일때";
		 */
		/*
		if(ascii >=48 && ascii<=57) {
				System.out.println("2의 배수입니다.");
			}
		
		else {
			System.out.println("숫자가 아닙니다.");
		}
		
		String numberResult = (ascii>=48 && ascii<=57) ?  "숫자입니다." : "숫자가아닙니다.";
		System.out.println(numberResult);
		*/
		
		String resultStr = (ascii>'0' && ascii<='9') ? "숫자입니다.":"숫자가아닙니다.";
		System.out.println(resultStr);
	}
}
