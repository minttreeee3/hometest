package poly;

public class Administrator extends Employee {
	
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+" 이(가) 관리를 합니다.");
	}

}
