package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat a = new SimpleDateFormat("dd MMM yyyy");
		
		SimpleDateFormat b = new SimpleDateFormat("dd/MM/yyyy");

		String dateInput="";
		System.out.println("Input date dd/MM/yyyy");
		
		dateInput = sc.nextLine();
		
		try{
		date = b.parse(dateInput);
		}catch (ParseException e){
			System.out.println(e);
		}
			
		String dateString = a.format(date);
		System.out.println(dateString);
		
		System.out.println(date.getTime());
	}

}
