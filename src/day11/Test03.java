package day11;

import java.util.Scanner;

class Student{
	public int age;
	public String name;
	public void inputSt() {
		Scanner input = new Scanner(System.in);
		System.out.print("�л� �̸� �Է� : ");
		name = input.next();
		System.out.print("�л� ���� �Է� : ");
		age = input.nextInt();
	}
	public void printSt() {
		System.out.println("�л� �̸� : " + name);
		System.out.println("�л� ���� : " + age);
	}
}
public class Test03 {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.inputSt();
		st.printSt();

	}

}
