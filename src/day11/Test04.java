package day11;

import java.util.ArrayList;
import java.util.Scanner;

//Updown ������ ����ÿ�.
//���ο��� �⺻ �������� ȭ���� �����, ����� �޼ҵ�� �����Ͻÿ�.
//���
//������ �̴� ���, �ְ��� üũ, ������, �ְ��� Ȯ�� ����

class Updown {
	Scanner input = new Scanner(System.in);
	boolean flag = true;
	int num;
	int i;
	int best;
	ArrayList arr = new ArrayList();

	public void game() {
		while (flag) {
			System.out.println("=== UP & Down Game===");
			System.out.println("1. ���ӽ���");
			System.out.println("2. ��������");
			System.out.println("3. ��������");
			System.out.print(">>>> ");
			num = input.nextInt();
			switch (num) {
			case 1:
				int computer = (int) (Math.random() * 100 + 1);
				System.out.println("=== START ===");
				while (flag) {
					System.out.print("Input Number --> ");
					int mynumber = input.nextInt();
					if (mynumber < computer) {
						System.out.println(" === U  P === ");
						i++;
						;
					} else if (mynumber > computer) {
						System.out.println(" === Down === ");
						i++;
					} else {
						arr.add(i);
						for (int i = 0; i < arr.size(); i++) {
							for (int j = 1; j < i; j++) {
								int temp = 0;
								if ((int) arr.get(i) > (int) arr.get(j)) {
									temp = (int) arr.get(i);
									arr.set(i, arr.get(j));
									arr.set(j, temp);
									flag = false;
								}
							}
						}
						System.out.println(arr);
						best = (int) arr.get(0);
						System.out.println(i + "ȸ ���� ������ϴ�!!");
						if (i == best) {
							System.out.println("�ְ����� �����ϼ̽��ϴ�.");
						}
						break;
					}
				}
				break;
			case 2:
				System.out.println("�ְ� ������ " + best + "ȸ �Դϴ�!!!");
				break;
			case 3:
				flag = false;
			}
		}
	}

}

public class Test04 {

	public static void main(String[] args) {
		Updown ud = new Updown();
		ud.game();

	}

}
