
public class StaffInfo {

	public static void main(String[] args) {
		Staff staff = new Staff("tsuru", 2269, "supernaturalsyougo@gmail.com");
		System.out.println("-----------Staff------------");
		System.out.println("氏名　　:" + staff.getName());
		System.out.println("社員番号:" + staff.getEmpllyNumber());
		System.out.println("email　:" + staff.getEmail());
		
		RemoteWork remoteStaff = new RemoteWork("remoteYarou", 1111, "hanakoyarou@gmail.com");
		remoteStaff.setLocation("千葉県");
		System.out.println("-----------remote-----------");
		System.out.println("氏名　　:" + remoteStaff.getName());
		System.out.println("社員番号:" + remoteStaff.getEmpllyNumber());
		System.out.println("email　:" + remoteStaff.getEmail());
		System.out.println("勤務地　:" + remoteStaff.getLocation());

		


	}

}
