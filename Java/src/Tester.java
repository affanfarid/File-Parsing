//Affan Farid
//2018

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("/Users/affanfarid/Desktop/example.txt");
		
		FileObject f1 = new FileObject(file, "\\s+");
		
		Line l1 = new Line("sugma dick hooooooooe", "\\s+");
		
		for(int i =0; i<f1.getNumLines(); i++) {
			System.out.println(f1.getLine(i));
		}
		
		// TODO Auto-generated method stub
		//System.out.println("hello bitch");

	}

}
