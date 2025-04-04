package ss25.B1;

public class Account {
	private static Account instance;
	// hay dung quan ly ket noi csdl
	private int id;
	private String name;
	private int age;
	private Account(){

	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public synchronized static Account getInsance(){
		if(instance==null){
			instance=new Account();
		}
		return instance;
	}
}
