//Affan Farid
//2018

public class Line{
    private String delim;
    private String wholeline;
    private String[] tokens;
    
    Line(String wholeline1, String delim1){
        
        wholeline = wholeline1;
        delim = delim1;
        
        tokens = wholeline.split(delim);
        
    }
    
    public String getLine() {
    	return wholeline;
    }
    
    public String[] getTokens() {
    	return tokens;
    }
    
    public String getToken(int i){
        return tokens[i];
    }
    
    public char getChar(int wordnum, int letternum){
        return tokens[wordnum].charAt(letternum); //FIX
    }
    
}