package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class WrongNumberException extends Exception{
	
	public WrongNumberException() {
		super("숫자입력이 잘못되었습니다.");
	}
}

public class QuRockPaperScissors2 {

	static void oneTwoThreeGame() {

		Scanner scanner = new Scanner(System.in);

		for (int round = 1; round <= 5; round++) {

			int random = (int) (Math.random() * 3 + 1);
			System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
			try {

				int input = scanner.nextInt();
				System.out.println("사용자 : " + input + " " + "컴퓨터 : " + random);

				if (input == 1 && random == 1) {
					System.out.println("비겼습니다.");
				} else if (input == 1 && random == 2) {
					System.out.println("졌습니다.");
				} else if (input == 1 && random == 3) {
					System.out.println("이겼습니다.");
				} else if (input == 2 && random == 1) {
					System.out.println("이겼습니다.");
				} else if (input == 2 && random == 2) {
					System.out.println("비겼습니다.");
				} else if (input == 2 && random == 3) {
					System.out.println("졌습니다.");
				} else if (input == 3 && random == 1) {
					System.out.println("졌습니다.");
				} else if (input == 3 && random == 2) {
					System.out.println("이겼습니다.");
				} else if (input == 3 && random == 3) {
					System.out.println("비겼습니다.");
				} else {
					System.out.println("틀렸지롱 우훗" + round);
					round--;
					WrongNumberException wrongNumberException = new WrongNumberException();
					throw wrongNumberException;
				}
			} catch (InputMismatchException e) {
				System.out.println("틀렸지롱 우훗" + round);
				round--;
				System.out.println("1:가위  2:바위  3:보  중 하나의 숫자를 입력하세요 우흣.");
				scanner.nextLine();

			}			catch (WrongNumberException e) {
				System.out.println(e.getMessage());
			}

			if (round == 5) {
				for (;;) {
					try {
						System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");

						int restart = scanner.nextInt();

						if (restart == 0) {
							System.out.println("게임이 종료되었습니다. 감사합니다.");
							break;
						} else if (restart >= 2) {
							System.out.println("재시작(1), 종료(0)중에 입력하세요.");
							WrongNumberException wrongNumberException = new WrongNumberException();
							throw wrongNumberException;
						} else if (restart == 1) {
							round = 0;
							break;
						}
					} catch (InputMismatchException e) {

						System.out.println("재시작(1), 종료(0) 중 하나의 숫자를 입력하세요.");
						scanner.nextLine();
					}
					catch (WrongNumberException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		oneTwoThreeGame();
		
	}

}

