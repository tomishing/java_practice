package lab12;

public class Yang extends Hotel{
	
	Yang(int member, String room, boolean breakfast, String province) {
		super(member, room, breakfast, province);
		language();
	}
	@Override
	void language(){
		super.khao = "Kin Khao";
	}
}
