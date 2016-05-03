package beans;

public class Person {

	private int id;
	private String name;
    private String Tel;
    private String Email;
    
    public Person(String name,String Tel,String Email) {
		this.name = name;
		this.Tel = Tel;
		this.Email = Email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
    
    
}
