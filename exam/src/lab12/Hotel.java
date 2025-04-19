package lab12;

public abstract class Hotel {
	private int member;
	private String room;
	private boolean breakfast;
	private String province;
	protected String khao;

	Hotel(int member, String room, boolean breakfast, String province) {
		this.member = member;
		this.room = room;
		this.breakfast = breakfast;
		this.province = province;

	}

	public int getMember() {
		return member;
	}

	public String getRoom() {
		return room;
	}

	public boolean isBreakfast() {
		return breakfast;
	}

	public String getProvince() {
		return province;
	}
	public String getKhao() {
		return khao;
	}

	abstract void language();

}
