package day11;

import java.util.Scanner;

class Coffee {
	int money = 0;
	int j = 0;

	public int input() {
		Scanner input = new Scanner(System.in);
		System.out.print("요금을 투입하세요 >>>");
		money = input.nextInt();
		return money;
	}

	public int input2() {
		Scanner input = new Scanner(System.in);
		System.out.print("메뉴를 선택하세요 >>> ");
		j = input.nextInt();
		return j;
	}

	public void viewMenu() {

		System.out.println("=============커피 자판기============");
		System.out.println("1. 커피(200)\t\t2. 코코아(250)\t3. 반환\t4. 종료");
		//System.out.print("메뉴를 선택하세요 >>> ");

	}

	public void check() {
		for (int i = 0;; i++) {
			money = input();
			viewMenu();
			j = input2();
			if (j == 4) {
				System.out.println("시스템 종료");		break;
			}
			else if ((j == 1 && money < 200) || (j == 2 && money < 250)) {
				System.out.println("요금이 부족합니다.\n");
			} else if (j == 1) {
				System.out.println("맛있게 드세요\n");
				money -= 200;
			} else if (j == 2) {
				System.out.println("맛있게 드세요\n");
				money -= 250;
			} else if (j == 3) {
				System.out.println("거스름돈 : " + money);
				money = 0;
			} else {
				System.out.println("잘못입력하셨습니다.\n\n");
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
