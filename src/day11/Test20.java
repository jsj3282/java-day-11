package day11;

import java.text.SimpleDateFormat;

public class Test20 {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		
		String s = simple.format(time);
		System.out.println(s);

	}

}
