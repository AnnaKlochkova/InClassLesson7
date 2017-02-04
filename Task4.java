package task4;

import java.io.File;
import java.io.IOException;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		File fileOne = new File("a.txt");
//
//		try {
//			fileOne.createNewFile();
//		} catch (IOException e) {
//			System.out.println(e);
//		}
//
//		fileOne.delete();
		
		
		File folder = new File("ABC");
		folder.mkdirs();

		File fileTwo = new File(folder,"b.txt");
		try{
			fileTwo.createNewFile();
		}catch(IOException e){
			System.out.println(e);
		}
		
		fileTwo.delete();
		
		folder.delete();
			
		
		File folderOne = new File(".");
		File[] fileArray = folderOne.listFiles();
		for (File file : fileArray) {
			System.out.println(file);
		}
	}

}

