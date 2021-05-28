package ex05Method;
/*
문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 / 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8

함수명 : Fahrenheit() -> 화씨 = 1.8 * 섭씨 + 32 
	   Celsius() -> 섭씨 = (화씨 - 32) / 1.8

1. Fahrenheit() 메소드 만들기 > 파라미터생성
2. 섭씨를 입력받아 화씨로 변환하여 > 리턴
3. Celsius() 메소드 만들기 > 파라미터 생성
4. 화씨를 입력받아 섭씨로 변환하여 > 리턴
5. main에서 출력 


 */
public class QuTemperature {

	
	public static void main(String[] args) {
	
		double input = 3;
		
		double Fahrenheit = Fahrenheit(input);
		double Celsius = Celsius(input);
		
		System.out.println("화씨는:" + Fahrenheit);
		System.out.println("섭씨는:" + Celsius);
		
	}
	
	public static double Fahrenheit(double celsiusParam) {
		
		double Fahrenheit = 1.8 * celsiusParam + 32;
		return Fahrenheit;
		
	}
	
	public static double Celsius(double FahrenheitParam) {
		
		double  Celsius = (FahrenheitParam - 32) / 1.8;
		return Celsius;
	}
	
	/*
	public static void main(String[] args) { 
	
	   // 인자로 전달하는 18은 정수이고, 매개변수 cel은 실수이므로, 전달될때 자동형변환이 일어난다.
		
		System.out.println("섭씨18도->화씨" + celsiusToFahrenheit(18.0));
		System.out.println("화씨98도->섭씨" + fahrenheitToCelsius(98));
		
	}

	// 섭씨 -> 화씨
	static double celsiusToFahrenheit(double cel) {
		
		return 1.8 * cel + 32 ;
	
	}
	
	//화씨 ->> 섭씨
	static double fahrenheitToCelsius(double fah) {
		
		double result = (fah - 32) / 1.8;
		return result;
	}
	
	*/
	
	
	
	

}
