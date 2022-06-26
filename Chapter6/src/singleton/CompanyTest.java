package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
			Company c1 = Company.getInstance();		//company 라고 했더니 오류남 (대소문자 구분)
		
			Company c2 = Company.getInstance();
			
			System.out.println(c1);
			System.out.println(c2);
			
			
	}

}
