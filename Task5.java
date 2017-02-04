package task5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner (System.in);
File file = new File("es.txt");
String text = getTextFromFile(file);
System.out.print(text);
sc.close();
	}

	static String getTextFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (Scanner sc = new Scanner(file)) {
			String text = "";
			for (; sc.hasNextLine();) {
				text = sc.nextLine();
				sb.append(text);
				sb.append(System.lineSeparator());
			}

		} catch (IOException e) {
			System.out.println(e);
		}
		return sb.toString();
	}

}