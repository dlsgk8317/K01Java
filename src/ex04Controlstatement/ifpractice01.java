package ex04Controlstatement;

import java.util.Scanner;

/*
/*사용자에게 숫자를 입력받아 1004이면 '암호가 맞음'

* 아니면 '암호가 틀림'이 출력되도록 프로그램 구현

1. 사용자에게 숫자를 입력받는다.
2. 입력받은 암호가 1004이면 '암호가 맞을을 출력한다.'
3. 아니면 암호가 틀림이 출력된다.

 */



public class ifpractice01 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a == 1004) { 
			System.out.println("암호가 맞음");
		}
		else 
			System.out.println("암호가틀림");
		
		//if > 조건식
	}

}
