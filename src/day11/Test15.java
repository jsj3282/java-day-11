package day11;

import java.util.Scanner;

class SetGet_01{
	private String name;
	public void display() {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.print("�̸� �Է� : ");
		name = input.next();
		setName(name);
		System.out.println("����� �̸��� : " + getName() + "�̱���");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class Test15 {

	public static void main(String[] args) {
		
		SetGet_01 sg = new SetGet_01();
		sg.display();

	}

}
