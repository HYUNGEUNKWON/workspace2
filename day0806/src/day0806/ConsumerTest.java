package day0806;

import java.util.function.Consumer;

class Man
{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Man(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Man()
	{
		
	}
}


public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> a = (String name)->System.out.println(name);
		a.accept("hong");
		
		Consumer<Man> m = (Man m1)->{
			System.out.println(m1.getName());
			System.out.println(m1.getName());		
			};

		m.accept(new Man(10, "park"));
	}

}
