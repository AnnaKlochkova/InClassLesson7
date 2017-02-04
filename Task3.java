package task3;

import java.util.Calendar;
import java.util.Date;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar a = Calendar.getInstance();
a.set(Calendar.YEAR,2001);
a.set(Calendar.MONTH, Calendar.OCTOBER);
a.set(Calendar.DAY_OF_MONTH,04);

Date date = a.getTime();
System.out.println(date);
	}

}
