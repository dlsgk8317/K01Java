package ex07string;

import java.util.Scanner;

public class E02StringMethod01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		
//		System.out.println("String 클래스의 주요 메소드");
//		
//		String str1 = "welcome to java";
//		String str2 = "자바야 놀자1";
//		
//		System.out.println("Str1의 길이 :" + str1.length());
//		System.out.println("Str1의 길이 :" + str2.length());

		String juminNum = name;
		if (name.contentEquals("-") == true) {

			if (juminNum.charAt(7) == '1' || juminNum.charAt(7) == 3) {
				System.out.println("남자입니다.");
			}

			else if (juminNum.charAt(7) == '2' || juminNum.charAt(7) == 4) {
				System.out.println("여자입니다.");
			}

			else if (juminNum.charAt(7) == '5' || juminNum.charAt(7) == '6') {
				System.out.println("외국인입니다.");
			} else {
				System.out.println("잘못된값입니다.");
			}
		}
		else {
			System.out.println("잘못된입력입니다.");
		}
		

	}

}
