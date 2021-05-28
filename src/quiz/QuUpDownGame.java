package quiz;
/*
파일명 : QuUpDownGame.java

게임설명 : 업다운게임을 메소드를 이용해 구현한다.
1. 컴퓨터는 1~100사이의 숫자 하나를 생성한다. (난수-랜덤)
2. 총 시도횟수는 7번을 부여한다.
3. 사용자는 7번의 시도안에 숫자를 맞춰야 한다.
4. 사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
5. 7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
6. 성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
7. 함수를 사용하여 구현한다.
8. 무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
클래스명 : NumberRangeException
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오.

 */

import java.util.Scanner;

public class QuUpDownGame {

	static void UpDownGame () { 

		Scanner scanner = new Scanner(System.in);	
		
		int random = (int)(Math.random()*100+1);
		for(int round =1; round<=7; round++) {
			
			System.out.print("1~100사이의 숫자 하나를 입력해주세요 ");
			int input = scanner.nextInt();
			System.out.println("사용자 : " + input + " " + "컴퓨터 : " + random);
			if(input<=100) {

				if (input == random) {
					System.out.println("이겼습니다..");
					break;
				} else if (input > random) {
					System.out.println("낮은숫자입니다.");
				} else if (input < random) {
					System.out.println("높은숫자입니다.");
				} 
			}
			else if (100 < input ) {
				System.out.println("100이하의 숫자를 입력해주세요----> round :"+round);
				round --;
			}
			
			if(round==7) {
			System.out.print("7번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");
			
			int restart = scanner.nextInt();
			
			if(restart == 0) {
				System.out.println("게임이 종료되었습니다. 감사합니다.");
			}
			else if(restart >=2) {
				System.out.println("재시작(1), 종료(0)중에 입력하세요.");
			}
			else if(restart == 1) {
				round = 0;
			}
		}
	}
}

	public static void main(String[] args) {

		UpDownGame();
	}

}
