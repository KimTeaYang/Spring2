package ex10;

public class AdminInfo {
	
	private String adminId;
	private String adminPwd;
	
	public void printInfo() {
		System.out.println("Admin Id: "+adminId);
		System.out.println("Admin Pwd: "+adminPwd);
	}
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	
	
	
}
