package task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubDate
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat a = new SimpleDateFormat("dd MMM yyyy");
		SimpleDateFormat b = new SimpleDateFormat("dd/MM/yyyy");

		String dateString = a.format(date);
		System.out.println(dateString);
		
		dateString = b.format(date);
		System.out.println(dateString);
		
	}

}
