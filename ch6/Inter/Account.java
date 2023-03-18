package Inter;

// 인터페이스
// 추상 클래스임 =>인스턴스 생성 불가
// 근데 추상클래스보다 추상화 정도가 높음 => 일반메서드, 멤버변수도가질 수 없음




public interface Account {
	
	int x=0, y=0; //모든 멤버변수는 public static final임 -생략은 가능, 초기화 안하면 에러남
	
	// void stop() {} //모든 메서드는 public abstract임 -생략은 가능, 
	void stop(); //이렇게 끝내야함, 중괄호 못씀
	
	//단, static 메서드와 디폴트 메서드는 사용 가능(idk8버전부터 가능)
	static void print() {}
	default void add() {}

}
