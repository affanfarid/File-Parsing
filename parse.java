
import java.io.File;
import java.util.*;


public class Tester{
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

        sc.close();
        
    }
        


}

public class Line{
    private String delim;
    private String wholeline;
    private String tokens[];
    
    Line(String wholeline1, String delim1){
        
        wholeline = wholeline1;
        delim = delim1;
        
        tokens = line.split(delim);
        
    }
    
    public String getToken(int i){
        return tokens[i];
    }
    
    public String getChar(int wordnum, int letternum){
        return tokens[wordnum].charAt(letternum); //FIX
    }
    
}

public class FileObject{
    
    
    
}




