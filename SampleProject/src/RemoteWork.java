
public class RemoteWork extends Staff{

	public RemoteWork(String nane) {
		super(nane);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private String location;
	public RemoteWork(String name, int empllyNumber, String email) {
		super(name, empllyNumber, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void setLocation(String location) {
		this.location =location;
	}

	public String getLocation() {
		return location;
	}
	
}