package ex04Controlstatement;

import java.util.Scanner;

/*
3을 입력받아 출력
 */

public class ifpractice03 {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in); 
//		
//		int three = scanner.nextInt();
//		
//		System.out.println("3을 입력받아 3을 출력 = " + three);
		
		// 뭔가를 입력받으면 입력받은 값고 똑같이 출력
		
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		
//		System.out.println(input);
		
		// 입력을 받는데 1이면 사과를 출력해, 2이면 포도를 출력해, 3이면 수박을 출력해
//		
//		Scanner scanner = new Scanner(System.in);
//		int fruit = scanner.nextInt();
//		
//		int apple = 1;
//		int grape= 2;
//		int watermelon = 3;
//		
//		if (fruit == apple) {
//			System.out.println("사과");
//		} else if (fruit == grape) {
//			System.out.println("포도");
//		} else if (fruit == watermelon) {
//			System.out.println("수박");
//		} else {
//			System.out.println();
//		}
		
		
		// 입력을 받는데 1이면 사과를 출력해, 2이면 포도를 출력해, 3이면 수박을 출력하고, 4를 넣어도 사과과 출력되게 
		Scanner scanner = new Scanner(System.in);
		int fruit = scanner.nextInt();
		
		int apple = 1;
		int grape= 2;
		int watermelon = 3;
		
		if (fruit == apple || fruit == 4) {
			System.out.println("사과");
		} else if (fruit == grape) {
			System.out.println("포도");
		} else if (fruit == watermelon) {
			System.out.println("수박");
		} else {
			System.out.println();
		}
	}

}
