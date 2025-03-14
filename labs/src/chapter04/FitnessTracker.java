package chapter04;
import java.time.LocalDate;
public class FitnessTracker {
	private String nameAct;
	private int numMinPart;
	private LocalDate date;
	
	public String getName() {
		return nameAct;
	}
	public int getMin() {
		return numMinPart;
	}
	public LocalDate getDate() {
		return date;
	}
	public FitnessTracker()
	{
		nameAct="running";
		numMinPart = 0;
		date = LocalDate.of(2024, 1, 1);
	}
	public FitnessTracker(String a, int b, LocalDate c)
	{
		nameAct = a;
		numMinPart = b;
		date = c;
	}

}
