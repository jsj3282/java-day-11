package day11;

class ClassFinal_04{
	public static final String KOREA = "¥Î«—πŒ±π";
	public static final String PI = "3.14";
}
class User1{
	public void func() {
		System.out.println("KOREA : " + ClassFinal_04.KOREA);
		System.out.println("PI : " + ClassFinal_04.PI);
	}
}
class User2{
	public void func() {
		System.out.println("KOREA : " + ClassFinal_04.KOREA);
		System.out.println("PI : " + ClassFinal_04.PI);
	}
}
public class Test01 {

	public static void main(String[] args) {
		User1 u1 = new User1();
		User2 u2 = new User2();
		u1.func();
		u2.func();
	}

}
