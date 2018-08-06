package day0806;


class Th implements Runnable{
	@Override
	public void run() {
		System.out.println("test");
	}
}
public class LamdaTest2 {

	public static void main(String[] args) {
		Thread th = new Thread(new Th());
		th.start();

		Thread th2 = new Thread(()->System.out.println("sample"));
		th2.start();
	}

}
