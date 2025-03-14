package shinsukeAssignment2_001;

public class Student {
	private String studentId;
	private String eMail;
	private Person perInf;
	private DegreeProgram degree;
	private double gpa;
	
	public Student(String studentId, String eMail, Person perInf, DegreeProgram degree, double gpa) {

		this.studentId = studentId;
		this.eMail = eMail;
		this.perInf = perInf;
		this.degree = degree;
		this.gpa = gpa;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Person getPerInf() {
		return perInf;
	}

	public void setPerInf(Person perInf) {
		this.perInf = perInf;
	}

	public DegreeProgram getDegree() {
		return degree;
	}

	public void setDegree(DegreeProgram degree) {
		this.degree = degree;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public boolean emailValidate() {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}$";
		boolean lsmatches = eMail.matches(regex); 
		return lsmatches;
	}
	
}
