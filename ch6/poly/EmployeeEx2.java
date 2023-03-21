package poly;

public class EmployeeEx2 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("홍길동");
		employee.setPosition("사원");
		//employee.work();
		workPrint(employee);
		
		
		
		
		// 메소드가 오버라이딩 되었다면 오버라이딩 된 메소드가 실행됨 
		// 오버라이딩 안됐을땐 .work(); 했을때 무조건 부모꺼가 나옴 
		Ceo employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("CEO");
		//employee2.work();
		workPrint(employee2);
		
		Administrator employee3 = new Administrator();
		employee3.setName("정대만");
		employee3.setPosition("Admin");
		//employee3.work();
		workPrint(employee3);
		
		PartTime employee4 = new PartTime();
		employee4.setName("강백호");
		employee4.setPosition("파트타임");
		//employee4.work();
		workPrint(employee4);
		
	

	}
	
	static void workPrint(Employee employee) {  //부모타입(Employee)으로 받으면 자식도 다 됨 -매개변수의 다형성
		employee.work();
	}

}
