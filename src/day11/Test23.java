package day11;

import java.text.SimpleDateFormat;
import java.util.Date;
class Time{
	private Date date = new Date();
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public SimpleDateFormat getSimpl() {
		return simpl;
	}
	public void setSimpl(SimpleDateFormat simpl) {
		this.simpl = simpl;
	}
	SimpleDateFormat simpl = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
}
public class Test23 {

	public static void main(String[] args) {

		for(int i = 0; i<10; i++) {
			Date date = new Date();
			SimpleDateFormat simpl = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
			String s = simpl.format(date);
			System.out.println(s);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			
		}
		
		

	}

}
