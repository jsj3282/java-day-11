package day11;

class Machine{
	private int num;
	public void func() {
		System.out.println("num : " + num);
	}
	public void setting(int num) {
		this.num = num;
	}
}
public class Test13 {

	public static void main(String[] args) {
		
		Machine mac = new Machine();
		mac.setting(100);
		mac.func();

	}

}
