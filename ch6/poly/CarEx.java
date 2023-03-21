package poly;

public class CarEx {

	public static void main(String[] args) {
		
		
		Car car1 = new FireEngine();
		// car1. 으로 부르려고할때 원래의 Car꺼만 부를수있음 FireEngine꺼는 접근못함 
		
		Car car2 = new Ambulance();
		
		Car car = null;
		
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2 = null;
		
		fireEngine.water();
		car = fireEngine; //Car car = new FireEngine(); 
		
		fireEngine2 = (FireEngine) car; //강제 형변환 (캐스팅) 하고나면 water불러올수있음
		fireEngine2.water();
		
		
		// 왼쪽이 자식 오른쪽이 부모면 안됨 캐스팅해서 빨간줄안생겨도 실행시키면 오류남
//		FireEngine fe = (FireEngine) new Car();
//		fe.drive();
		// 왼쪽이 부모, 오른쪽이 자식 이건무조건지켜야됨
		
		// FireEngine fe = new Ambulance(); 이것도 안됨
		

	}

}
