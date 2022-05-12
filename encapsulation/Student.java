package encapsulation;

public class Student {

	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 18) {
			System.out.println("You are too old to get admitted!!");
		}else {
			this.age = age;
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
