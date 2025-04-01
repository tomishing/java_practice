package chap10;

public class GradeException extends Exception {
	public static char[] grades = {'A','B','C','D','F','I' };
	GradeException(String message){
		super(message);
	}
	public static boolean isValidGrade(char grade) {
		for (char g: grades) {
			if (g == grade) {
				return true;
			}
		}
		return false;
	}
}
