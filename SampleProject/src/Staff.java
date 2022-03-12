
public class Staff{
	private String name;
	private int empllyNumber;
	private String email;
	
	public Staff(String nane) {
		super();
		this.name = nane;
	}

	public int getEmpllyNumber() {
		return empllyNumber;
	}

	public void setEmpllyNumber(int empllyNumber) {
		this.empllyNumber = empllyNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Staff(String name, int empllyNumber, String email) {
		super();
		this.name = name;
		this.empllyNumber = empllyNumber;
		this.email = email;
	}
}