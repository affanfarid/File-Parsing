//Affan Farid
//2018

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class FileObject {
	
	private String delim;
	private Vector<Line> lines;
	private int numLines;
	
	FileObject(File f, String delim) throws FileNotFoundException{
		
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
		
			String s = sc.nextLine();
			Line l1 = new Line(s, delim);
			//System.out.println(s);
			if(!sc.hasNextLine()) {
				lines.add(l1);
				numLines ++;
			}
			
		}
		
		sc.close();
		
	}
	
	public int getNumLines() {
		return numLines;
	}
	
	public String getLine(int linenum) {
		return lines.get(linenum).getLine();
	}
	
	public String getWord( int linenum, int wordnum) {
		return lines.get(linenum).getToken(wordnum);
	}
	
	public char getLetter(int linenum, int wordnum, int charnum)
	{
		return lines.get(linenum).getChar(wordnum, charnum);
	}
}
