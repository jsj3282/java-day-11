package day11;

import java.util.Scanner;

class Student{
	public int age;
	public String name;
	public void inputSt() {
		Scanner input = new Scanner(System.in);
		System.out.print("학생 이름 입력 : ");
		name = input.next();
		System.out.print("학생 나이 입력 : ");
		age = input.nextInt();
	}
	public void printSt() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
	}
}
public class Test03 {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.inputSt();
		st.printSt();

	}

}
