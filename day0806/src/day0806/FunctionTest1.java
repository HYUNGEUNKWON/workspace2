package day0806;

import java.util.function.Function;

class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(){
		
	}
}




public class FunctionTest1 {

	public static void main(String[] args) {
		Function<Student, String> f = (Student s)->s.getName();
		
		String name = f.apply(new Student("hong", 10));
		System.out.println(name);
		
		Function<Student, Integer> f2 = (Student s)->s.getAge();
		
		int age = f2.apply(new Student("hong", 10));
		System.out.println(age);
		
	
	}

}
