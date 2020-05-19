package day11;

import java.util.Scanner;

//로그인 기능을 만드시오.
//This, Private, get, setter을 이용하여 캡슐화로 코드를 수정해보자.
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
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 시스템 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("아이디를 입력하시오 : ");
				id = input.next();
				System.out.print("비밀번호를 입력하시오 : ");
				pw = input.next();
				if(id.equals(log.getId()) && pw.equals(log.getPassword())) {
					System.out.println("로그인 성공했습니다.");
				}else {
					System.out.println("로그인 실패");
				}
				break;
			case 2:
				System.out.println("회원가입입니다.");
				System.out.print("아이디를 입력해주세요 : ");
				id = input.next();
				log.setId(id);
				System.out.print("비밀번호를 입력해주세요 : ");
				pw = input.next();
				log.setPassword(pw);
				break;
			case 3:
				System.out.println("시스템 종료 합니다.");
				flag = false;
			}
		}

	}

}
