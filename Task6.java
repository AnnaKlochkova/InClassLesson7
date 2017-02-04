package task6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 6, 23, -5 };
		String text = Arrays.toString(a);
		File fileOne = new File("massiv.txt");
		text += System.lineSeparator() + "Hello word";
		saveTextToFile(text, fileOne);
	}

	static void saveTextToFile(String text, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
	}


