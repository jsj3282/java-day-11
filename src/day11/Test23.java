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
	SimpleDateFormat simpl = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
}
public class Test23 {

	public static void main(String[] args) {

		for(int i = 0; i<10; i++) {
			Date date = new Date();
			SimpleDateFormat simpl = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
			String s = simpl.format(date);
			System.out.println(s);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			
		}
		
		

	}

}
