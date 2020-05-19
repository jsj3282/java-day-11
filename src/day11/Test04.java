package day11;

import java.util.ArrayList;
import java.util.Scanner;

//Updown 게임을 만드시오.
//메인에서 기본 보여지는 화면을 만들고, 기능은 메소드로 구현하시오.
//기능
//랜덤값 뽑는 기능, 최고기록 체크, 정답기능, 최고기록 확인 가능

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
			System.out.println("1. 게임시작");
			System.out.println("2. 게임전적");
			System.out.println("3. 게임종료");
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
						System.out.println(i + "회 만에 맞췄습니다!!");
						if (i == best) {
							System.out.println("최고기록을 갱신하셨습니다.");
						}
						break;
					}
				}
				break;
			case 2:
				System.out.println("최고 점수는 " + best + "회 입니다!!!");
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
