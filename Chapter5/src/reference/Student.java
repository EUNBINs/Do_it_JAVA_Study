package reference;

public class Student {
	
	int studentID;
	String studentName;
	Subject Korea;
	Subject Math;
	
	public Student() {
			Korea = new Subject("����");
			Math = new Subject("����");
	}
	
	public Student(int id, String name) {
			studentID = id;
			studentName = name;
			
			Korea = new Subject("����");
			Math = new Subject("����");
	}

	public void setKorea(int score) {
		Korea.setScore(score);
		
	}
	
	public void setMath(int score) {
		Math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = Korea.getScore() + Math.getScore();
		System.out.println(studentName + "�л��� ������" + total + "�� �Դϴ�.");
	}
}
	
	