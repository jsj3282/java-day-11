package day11;

import java.util.Scanner;

//�α��� ����� ����ÿ�.
//This, Private, get, setter�� �̿��Ͽ� ĸ��ȭ�� �ڵ带 �����غ���.
class Login{
	private String identification;
	private String password;
	public void setId(String id) {
		this.identification = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return identification;
	}
	public String getPassword() {
		return password;
	}
}
public class Test18 {

	public static void main(String[] args) {
		
		String id;
		String pw;
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int num;
		Login log = new Login();
		while(flag) {
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. �ý��� ����");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("���̵� �Է��Ͻÿ� : ");
				id = input.next();
				System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
				pw = input.next();
				if(id.equals(log.getId()) && pw.equals(log.getPassword())) {
					System.out.println("�α��� �����߽��ϴ�.");
				}else {
					System.out.println("�α��� ����");
				}
				break;
			case 2:
				System.out.println("ȸ�������Դϴ�.");
				System.out.print("���̵� �Է����ּ��� : ");
				id = input.next();
				log.setId(id);
				System.out.print("��й�ȣ�� �Է����ּ��� : ");
				pw = input.next();
				log.setPassword(pw);
				break;
			case 3:
				System.out.println("�ý��� ���� �մϴ�.");
				flag = false;
			}
		}

	}

}
