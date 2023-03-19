package Inter;

public class ActionEx {

	public static void main(String[] args) {
		
		
		Action action = new Action() {   //익명클래스 구현 (ctrl+스페이스 자동완성으로)
			
			@Override
			public void work() {
				System.out.println("work");
				
			}
		};
		action.work();
		

	}

}
