package day11;

import java.io.IOException;
import java.util.Scanner;

class Win7 {
	boolean flag = true;
	Scanner input = new Scanner(System.in);
	public void window() throws IOException {
		while (flag) {
			System.out.println("===== 환 영 합 니 다 =====");
			System.out.println("1. 기  능");
			System.out.println("2. off");
			System.out.print("입력 >>>> ");
			int num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("[사용가능] : 계산기  메모장");
				String function = input.next();
				if(function.equals("계산기")) {
					System.out.println("calc.exe사용합니다.");
					ProcessBuilder oProcess = new ProcessBuilder("calc.exe");
					oProcess.start();
				}else if(function.equals("메모장")) {
					System.out.println("note.pad사용합니다.");
					ProcessBuilder oProcess = new ProcessBuilder("notepad.exe");
					oProcess.start();
				}else {
					System.out.println("없는 기능입니다.");
				}
				break;
			case 2:
				System.out.println("시스템을 종료합니다.");
				flag = false;
			}
			
		}
	}
}

public class Test22 {

	public static void main(String[] args) throws IOException {
		
		Win7 win7 = new Win7();
		win7.window();

	}

}
