package lab11;

public class calcTotalCost {
	
	private String ins;
	private int ins_cost;
	private boolean isDental;
	private boolean isVision;
	private int dent_cost;
	private int vis_cost;
	private int total_cost;
	
	public calcTotalCost(String ins, int ins_cost, boolean isDental, boolean isVision) {
		this.ins = ins;
		this.ins_cost = ins_cost;
		this.isDental = isDental;
		this.isVision = isVision;
	}
	public String display() {
		if(isDental == true)
			dent_cost = 75;
		else
			dent_cost = 0;
		if(isVision == true)
			vis_cost = 20;
		else
			vis_cost = 0;
		
		total_cost = ins_cost + dent_cost + vis_cost;
		
		return ins + ": " + ins_cost + ", Dental: " + dent_cost + ", Vision: " + vis_cost + ", Total: " + total_cost;
	}

}
