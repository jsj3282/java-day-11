package day11;

import java.util.Scanner;

class AgeClass{
	public int age;
	public void ageFunc(int age) {
		this.age = age - 1;
	}
	public void printAge() {
		System.out.println("����� ���̴� : " + age);
	}
}
public class Test10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AgeClass oop = new AgeClass();
		System.out.print("����� ���̴� : ");
		int a = input.nextInt();
		oop.ageFunc(a);
		oop.printAge();

	}

}
