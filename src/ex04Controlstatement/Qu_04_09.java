package ex04Controlstatement;

public class Qu_04_09 {

	public static void main(String[] args) {
		
		// su가 고정된 상태에서 dan이증가하는 형태로 구성한다.
		

		for(int su=1; su<=9; su++) {
			//수(1~9까지 반복)
			for(int dan =2; dan<=9; dan++) {
			
				System.out.print(dan+"*"+su+"="+(dan*su));
				System.out.print(" ");// 스페이스추가
			}
			System.out.println();//하나의 단을 출력 후 줄바꿈
		
		

		}
	}
}

