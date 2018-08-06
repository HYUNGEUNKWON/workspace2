package day0806;
@FunctionalInterface
interface Lam1
{
	//void prt(String name, int age);
	/*default void view() {
		System.out.println("show");
	};*/
	int add (int a, int b);
	
	
}







public class LamdaTest1 {

	public static void main(String[] args) {
		
		Lam1 ins = (int a, int b)-> a+b;
		
		int su = ins.add(10,20);
		System.out.println(su);
		
		
		
		
		/*Lam1 ins = (String name, int age)->
		System.out.println(name+age);
		ins.prt("hong", 10);*/
		
	}

}
