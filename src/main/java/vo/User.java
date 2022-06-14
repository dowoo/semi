package vo;

public class User {
	
	private int no;
	private String name;
	private String email;
	private String tel;
	
	public User(int no, String name, String email, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.email = email;
		this.tel = tel;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
