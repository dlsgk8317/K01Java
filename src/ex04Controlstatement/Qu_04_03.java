package ex04Controlstatement;

import java.util.Scanner;

/*
문제3) 파일명 : Qu_04_03.java
국어, 영어, 수학 점수를 사용자로부터 입력받아서	평균을 구해  
90점이상 A학점, 
	80점이상 B학점,
	....
	60점미만 F학점을 출력하는 프로그램을 작성하시오.
단 switch문을 사용해야 합니다.(Scanner클래스를 사용하세요)
 */

public class Qu_04_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //scanner -> 문자열이나 정수를 입력받을때 사용
		/*
		System.out.print("국어:");
		int kor = scanner.nextInt();
		System.out.print("영어:");
		int eng = scanner.nextInt();
		System.out.print("수학:");
		int math = scanner.nextInt();
		int total = kor + eng + math;
		int total1 = total / 3;
	
		
		int grade = total1/10;
		System.out.println("평균점수:" + total1);
		
		switch (grade) {
			case 9:
			System.out.println("학점 : A");
			break;
			
			case 8:
				System.out.println("학점 : B");
				break;
			case 7:
				System.out.println("학점 : C");
				break;
			case 6:
				System.out.println("학점 : D");
				break;
			default:
				System.out.println("학점 : F");
		}
		*/
		
		System.out.printf("국어:");
		int kor = scanner.nextInt();
		System.out.printf("영어:");
		int eng = scanner.nextInt();
		System.out.printf("수학:");
		int math = scanner.nextInt();
		
		double avg = (kor+eng+math) / 3.0;
		int result = (int)(avg / 10); // <- 핵심포인트(10으로 나눈 몫으로 구간을 정함)
		
		switch (result) {
		case 10: case 9: { // case를 두개사용하면 중복하여 두개의 값을 출력가능
			System.out.println("A학점");
			break;
		}
		case 8: {
			System.out.println("B학점");
			break;
		}
		case 7: {
			System.out.println("C학점");
			break;
		}
		case 6: {
			System.out.println("D학점");
			break;
		}
		default:
			System.out.println("E학점");
		}
		

	}

}
