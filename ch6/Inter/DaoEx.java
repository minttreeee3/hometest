package Inter;

public class DaoEx {

	public static void main(String[] args) {
		
		OracleDao oracle = new OracleDao();
		dbWork(oracle);		
		
		Mysql mysql = new Mysql();
		dbWork(mysql);

		
	}
	
	static void dbWork(DataAccessObject dao) {  //매개변수 다형성 - 부모 타입으로 넣으면 메서드를 하나만 만들어도 됨
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
