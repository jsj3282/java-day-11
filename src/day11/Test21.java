package day11;

import java.util.Scanner;

class Coffee {
	int money = 0;
	int j = 0;

	public int input() {
		Scanner input = new Scanner(System.in);
		System.out.print("����� �����ϼ��� >>>");
		money = input.nextInt();
		return money;
	}

	public int input2() {
		Scanner input = new Scanner(System.in);
		System.out.print("�޴��� �����ϼ��� >>> ");
		j = input.nextInt();
		return j;
	}

	public void viewMenu() {

		System.out.println("=============Ŀ�� ���Ǳ�============");
		System.out.println("1. Ŀ��(200)\t\t2. ���ھ�(250)\t3. ��ȯ\t4. ����");
		//System.out.print("�޴��� �����ϼ��� >>> ");

	}

	public void check() {
		for (int i = 0;; i++) {
			money = input();
			viewMenu();
			j = input2();
			if (j == 4) {
				System.out.println("�ý��� ����");		break;
			}
			else if ((j == 1 && money < 200) || (j == 2 && money < 250)) {
				System.out.println("����� �����մϴ�.\n");
			} else if (j == 1) {
				System.out.println("���ְ� �弼��\n");
				money -= 200;
			} else if (j == 2) {
				System.out.println("���ְ� �弼��\n");
				money -= 250;
			} else if (j == 3) {
				System.out.println("�Ž����� : " + money);
				money = 0;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.\n\n");
			}
		}
	}
}

public class Test21 {

	public static void main(String[] args) {

		Coffee cof = new Coffee();
		cof.check();
	}

}
