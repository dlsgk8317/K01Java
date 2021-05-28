package practice;

import java.util.Scanner;


public class E01If03 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("영어 : en, 한글 : kr \n -> 출력언어 선택:");
		
		String input = scanner.next();
		
		
		System.out.print("1: 사과, 2: 포도, 3: 수박, 4: 오렌지 \n -> 과일선택 선택:");
		
		int fruit = scanner.nextInt();
		
		int apple = 1;
		int grape = 2;
		int watermelon = 3;
		int orange = 4;
		
		if(fruit== apple) {
			System.out.printf("사과");
		}
		else if(fruit == grape) {
			System.out.println("포도");
		}
		else if(fruit == watermelon) {
			System.out.println("수박");
		}
		else if(fruit == orange) {
			System.out.println("오렌지");
		}
		else {
			System.out.println("잘못된값을 입력하셨습니다.");
		}

	}

}
