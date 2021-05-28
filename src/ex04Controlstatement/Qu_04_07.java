package ex04Controlstatement;
/*
문제2) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 작성하시오. 단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 출력의결과는 누적되는 모든 수를 콘솔에 print한다.
파일명 : Qu_04_07.java
실행결과] 3+6+7+~~~~~~=????
 */

/*
int total = 0; // 합을 구하기 위한 변수
int j = 1; //반복을 위한 변수
do { // 조건검사 없이 무조건 진입 후 실행
	if(j%4==0 || j%7==0) { //4 or 7에 배수일때 한가지만 만족해도 true
		System.out.println("j=" + j);
		total += j; //j를 누적해서 더함.
	}
	j++;
}while(j<=1000); // while문이 끝날때는 반드시 세미콜론(;)이 있어야한다.

System.out.println("1~1000사이 4or7 배수합:" + total);
*/

public class Qu_04_07 {

	public static void main(String[] args) {
	
		/*int total = 0;
		int j = 1;

		do {
			if(j%3==0 || j%7==0) {
				if(j%21!=0)
					
				total += j;
			}
			j++;
		}while(j<=100);
		
		System.out.println("3+6+7+~~~=???" + total);
		*/
		
		int sum = 0;//누적합을 위한 변수
		//1~100까지 반복
		for(int i=1 ; i <=100 ; i++) {
			
			//3의 배수이거나 7의 배수
			if(i%3==0 || i%7==0) {
				//3과7의 공배수가 아닌 경우
				if( i%(3*7)!=0 ) {
					sum += i;
					System.out.print(i+" ");
				}
			}
		}
		System.out.println("\n결과 :" + sum);

	}

}
