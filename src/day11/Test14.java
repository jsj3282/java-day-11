package day11;

import java.util.Scanner;

class SetGet{
	private String name;
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		name = input.next();
		System.out.println("����� �̸��� : " + name);
	}
}
public class Test14 {

	public static void main(String[] args) {
		SetGet sg = new SetGet();
		sg.display();

	}

}
