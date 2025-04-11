package lab11;

public class calcRent {
	private int room;
	private int bed;
	private int meal;
	
	calcRent(int room, int bed, int meal) {
		this.room = room;
		this.bed = bed;
		this.meal = meal;
	}
	
	public int totalCost() {
		return room + bed + meal;
	}
	
	public String display() {
		return "Total cost is: " + totalCost();
	}

}
