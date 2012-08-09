public class Person {
	
	public static String uji = "氏";
	public static String na = "名";
	public String firstName;
	public String lastName;
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}
	
	public void showName() {
		System.out.println(this.uji + ":" + this.getLastName() + " " + this.na + ":" + this.getFirstName());
	}

	public static void main(String[] args) {
		Person watanabe = new Person();
		watanabe.setFirstName("渡辺");
		watanabe.setLastName("高志");
		watanabe.showName();
		
		Person wada = new Person();
		wada.setFirstName("和田");
		wada.setLastName("充史");
		wada.showName();
		
		watanabe.showName();
	}
}
