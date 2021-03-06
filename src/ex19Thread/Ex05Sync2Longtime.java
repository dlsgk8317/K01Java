package ex19Thread;

/*
synchronized 선언으로 정확한 결과는 나왔지만 코드 실행 시간이 엄청나게 증가한다.
즉 동기화는 성능을 감소를 초래하므로 필요한부분에 대해서만 동기화처리하느넉싱 좋다.
동기ㅗ하 메소드 보다는 동기화 블럭이 기본적으로 좋은 성능을 나타내게 된다.
 */

class Increment {
	int num=0;

//	//1. 동기화 처리가 되지 않은 메소드
//	public void increment() {
//		num++;
//	}
	//2. 동기화방법1 : 동기화메소드 => 메소드 전체를 동기화처리
	public void increment() {
		synchronized (this) {		
			num++;
		}
	}
	public int getNum() {
		return num;
	}
}

class IncThread extends Thread {
	
	Increment inc;
	
	public IncThread(Increment inc) {
		this.inc = inc;
	}
	
	public void run() {
		for(int i=1; i<=10000; i++) {
			for(int j=1; j<=10000; j++) {
				inc.increment();
			}
		}
	}
}


public class Ex05Sync2Longtime {

	public static void main(String[] args) {
		
		Increment inc = new Increment();
		
		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);

		
		it1.start();
		it2.start();
		it3.start();
		try {
			it1.join();
			it2.join();
			it3.join();
		}
		catch(InterruptedException e) {}
		System.out.println("결과:" + inc.getNum());
		
	}

}
