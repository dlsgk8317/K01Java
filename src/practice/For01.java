package practice;

public class For01 {

	public static void main(String[] args) {
	
	int i = 5;
		
//		for(int x=1; x<=5; x++) {
//			
//			for(int y=1; y<=(i-x+1); y++) {
//				
//				System.out.printf("*");
//			}	
//			System.out.println("");
//		}
//		
	int j = 1;
		for(int x=1; x<=5; x++) {
			
			for(int y=1; y<=(j+x-1); y++) {
				
				System.out.printf("*");
			}	
			System.out.println("");
	}
}
}

//for (int x=1; x<=5; x++) {
//	for(int y=1 ; y<=(FLOOR-x+1); y++) {
//		System.out.print("* ");
//	}
	
//	System.out.println(); //하나의 행을 출력후 줄바꿈