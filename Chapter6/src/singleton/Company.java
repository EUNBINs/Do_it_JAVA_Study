package singleton;

public class Company {

		private static Company instance = new Company();		//유일하게 사용될 인스턴스
		
		private Company(){}
			
			public static Company getInstance() {		//외부클래스에서 인스턴스를 가져가서 사용할 수 있게 public 선언, 객체를 생성하지 않고 부르기위해 static 선언
				if(instance == null)
					instance = new Company();
				return instance;
		}
}
