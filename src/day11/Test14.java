package day11;

import java.util.Scanner;

class SetGet{
	private String name;
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.println("당신의 이름은 : " + name);
	}
}
public class Test14 {

	public static void main(String[] args) {
		SetGet sg = new SetGet();
		sg.display();

	}

}
