package ex04Controlstatement;

/*
for문 하나만 사용 / print한줄만 사용 / 1~100까지 출력하시오
 */

public class forpractice01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100;i++) {
			
//			int j = i%2;
			if(i%2 == 0) {
				
				System.out.print(i+ " ");
			}
			
		}
		

	}

}
