package reference;

public class Student {
	
	int studentID;
	String studentName;
	Subject Korea;
	Subject Math;
	
	public Student() {
			Korea = new Subject("국어");
			Math = new Subject("수학");
	}
	
	public Student(int id, String name) {
			studentID = id;
			studentName = name;
			
			Korea = new Subject("국어");
			Math = new Subject("수학");
	}

	public void setKorea(int score) {
		Korea.setScore(score);
		
	}
	
	public void setMath(int score) {
		Math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = Korea.getScore() + Math.getScore();
		System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
	}
}
	
	