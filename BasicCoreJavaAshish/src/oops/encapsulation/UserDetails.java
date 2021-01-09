package oops.encapsulation;

public class UserDetails {
	
	private int age;
	
	private String name;

	public int getAge() {
		if(age==0)
		{
			System.out.println("Your age is zero");
		}
		return age;
	}

	public void setAge(int age) {
		if(age>0)
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name=="Sam")
		this.name = name;
	}

}
