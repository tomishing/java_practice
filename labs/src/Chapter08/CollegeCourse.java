package Chapter08;

public class CollegeCourse {

	private String courseId;
	private int creditHour;
	private String letterGrade;
	
	public CollegeCourse() {
		courseId = "CIS 210";
		creditHour = 3;
		letterGrade = "A";
	}
	
	public void setCourseId(String courseId) {this.courseId = courseId;}
	public void setCreditHour(int creditHour) {this.creditHour = creditHour;}
	public void setLetterGrade(String letterGrade) {this.letterGrade = letterGrade;}
	public String getCourseId() {return courseId;}
	public int getCreditHour() {return creditHour;}
	public String getLetterGrade() {return letterGrade;}
	
	public String toString()
	{
		return "Course Id: " + courseId + 
				", credit hour: " + creditHour + 
				", Grade:" + letterGrade;
	}
	
}
