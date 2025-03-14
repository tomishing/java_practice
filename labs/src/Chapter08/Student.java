package Chapter08;

public class Student {
	private String studentId;
	private CollegeCourse[] courses = new CollegeCourse[3];
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentId() {
		return studentId;
	}
	
	public CollegeCourse getCourses(int i) {
		return courses[i];
	}
	public void setCourse(CollegeCourse course, int i) {
		courses[i] = course;
	}
}
