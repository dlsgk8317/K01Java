package ex04Controlstatement;
/*
문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
파일명 : Qu_04_06.java

*
* *
* * *
* * * *
* * * * *


 */

//TODO Auto-generated method stub
		/*
		 		int dan = 2; // 단
		while(dan<=9) { // 단이 2~9보다 증가한다.
			int su = 1; // 수(하나의 단을 출력한 후 증가하면 수는 1로 초기화된다.)
			while(su<=9) { //수는 1~9까지 증가한다.
				
				//서식에 맞춰 출력할때는 printf문이 좀더 유리하다.
				System.out.print(dan+"*"+su+"="+(dan*su));
				//System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
				System.out.print(" ");
				su++;				
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n===========================\n");
		 */


public class Qu_04_06 {

	public static void main(String[] args) {
		
		System.out.println("방법1");
		
		int st=1;
		while(st<=5) { //행으로 5번 반복
			
			int sp= 1;
			while(sp<=5) { //무조건 25번 반복해서 실행함.
				
				if(st>=sp)
					System.out.print(" * ");
				
				else 
					System.out.print(" ");
				
				
				sp++;
			}

			System.out.println();//한행을 출력한 후 줄바꿈 처리
			st++;
		}
		
		System.out.println("방법2");
		
		st=1; // 동일한 지역에 동일한 변수는 생성할수 없다.
		while(st<=5) { //행으로 5번 반복
			int sp= 1;
			while(sp<=st) { //j는 i의 크기만큼 반복하므로 15번만 반복하면 됨.
					System.out.print(" * ");
				sp++;
			}

			System.out.println();//한행을 출력한 후 줄바꿈 처리
			st++;
		}
	}
	


}
