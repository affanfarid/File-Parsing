#include <iostream>
#include <iomanip>
#include <fstream>
#include <string>
#include <sstream>
#include <vector>
#include <algorithm>
#include <cstdio>

using namespace std;

class Line{
private:
    string delim;
    string wholeLine;
    vector<string> tokens;
    int numTokens;
    
    
public:
    Line(string wholeLine1, string delim1){
        delim = delim1;
        wholeLine = wholeLine1;
        
        std::string::size_type lastPos = wholeLine.find_first_not_of(delim, 0);
        std::string::size_type pos = wholeLine.find_first_of(delim, lastPos);
        
        while (std::string::npos != pos || std::string::npos != lastPos)
        {
            tokens.push_back(wholeLine.substr(lastPos, pos - lastPos));
            lastPos = wholeLine.find_first_not_of(delim, pos);
            pos = wholeLine.find_first_of(delim, lastPos);
            numTokens ++;
        }
        
        //numTokens = tokens.size();
        
        
    }
    
    string getToken(int i){
        return tokens[i];
    }
    
    char getChar(int wordnum, int letternum){
        string s = tokens[wordnum];
        char c = s[letternum];
        return c;
        
    }
    
    int getNumTokens(){
        return numTokens;
    }
    
};

//class FileObject{
//private:
//    string delim;
//    vecotor<Line> lines;
//    //CHANGE TO VECTOR
//
//public:
//    FileObject(File f, string delim1){
//        delim = delim1;
//        int i =0;
//
//        while( f.hasNextLine() ){
//            lines[i] = new Line(f.nextLine(), delim);
//            lines.push_back(new Line(f.nextLine(), delim));
//            //with vector could just push back
//            i++;
//        }
//
//    }
//
//    string getWord(int linenum, int wordnum){
//        return lines[linenum].getToken(wordnum);
//    }
//
//    string getLetter(int linenum, int wordnum, int charnum){
//        return lines[linenum].getChar(wordnum,charnum);
//    }
//
//};


int main(){
    string s = ""
    cin >> s;
    getline(cin,s);
    Line l1 = Line(s, " ");
    for(int i = 0; i<l1.getNumTokens(); i++ ){
        cout<<l1.getToken(i)<<endl;
    }
    
    return 0;
}
