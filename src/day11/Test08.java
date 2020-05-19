package day11;

class This_01{
	public int a = 10;
	public void func() {
		int a = 100;
		System.out.println("func() a : " + this.a);
	}
	public void funcOne() {
		System.out.println("func() a : " + a);
	}
	
}
public class Test08 {

	public static void main(String[] args) {
		
		This_01 oop = new This_01();
		oop.func();
		oop.funcOne();

	}

}
