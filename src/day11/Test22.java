package day11;

import java.io.IOException;
import java.util.Scanner;

class Win7 {
	boolean flag = true;
	Scanner input = new Scanner(System.in);
	public void window() throws IOException {
		while (flag) {
			System.out.println("===== ȯ �� �� �� �� =====");
			System.out.println("1. ��  ��");
			System.out.println("2. off");
			System.out.print("�Է� >>>> ");
			int num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("[��밡��] : ����  �޸���");
				String function = input.next();
				if(function.equals("����")) {
					System.out.println("calc.exe����մϴ�.");
					ProcessBuilder oProcess = new ProcessBuilder("calc.exe");
					oProcess.start();
				}else if(function.equals("�޸���")) {
					System.out.println("note.pad����մϴ�.");
					ProcessBuilder oProcess = new ProcessBuilder("notepad.exe");
					oProcess.start();
				}else {
					System.out.println("���� ����Դϴ�.");
				}
				break;
			case 2:
				System.out.println("�ý����� �����մϴ�.");
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
