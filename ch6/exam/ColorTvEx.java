package exam;


// colorTv 클래스는 Tv를 상속받아서 작성 


public class ColorTvEx {

	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();
		
		//실행결과
		//32인치, 1024컬러
		
		IpTv iptv = new IpTv(32, 2048, "192.1.1.2");
		iptv.printProperty();  //나의 IpTv는 32인치, 2048컬러, 주소는 192.1.1.2입니다. 

	}
	
	

}
