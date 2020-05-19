package day11;

import java.util.Scanner;

class SumClass1{
	private int kor, eng, math;
	public int getSum() {
		return this.kor + this.eng + this.math;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
}
public class Test17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		SumClass1 sc = new SumClass1();
		int k, e, m, result;
		System.out.println("국, 영, 수 입력");
		k = input.nextInt();
		e = input.nextInt();
		m = input.nextInt();
		sc.setKor(k);
		sc.setEng(e);
		sc.setMath(m);
		result = sc.getSum();
		System.out.println("3과목의 합 : " + result);

	}

}
