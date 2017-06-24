import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
public class providers
{
    public void PrintToken(String s)
    { new Print().Process(s); } 
    public String[] GetSourceCode(String fn) throws IOException
    {
        try( BufferedReader br = new BufferedReader(new FileReader("/storage/sdcard0/AppProjects/Java_test/src/"+fn+".mdl"))) {String line = "",r="";while (( line = br.readLine()) != null) {  r += line+"\n";}  String[] z = r.split("\n"); return z;}
    }
    public void ForToken_(String d,MDLang_provider m)
    {
        d = d.replaceAll("for(","").replaceAll("):","");
        new For().Process(d.split(";"),m);
    }
}
class Print
{
    public void Process(String d) 
    {
        d = d.substring(5);
        if(d.charAt(1) == '"' && d.charAt(d.length()-2) == '"')
        { System.out.println(d.substring(2,d.length()-2)); }
    }
}
class For
{
    public String[] gtref;
    public void Process(String[] s,MDLang_provider m)
    {
        if(s.length == 2)
        {  
            System.out.println("FULL FOR");
        }
        else if(s.length == 1)
        { 
            if(s[0].equals("_fih_"))
                {
                    
                }
            System.out.println("0.5 FOR");
        }
        else
        {   System.out.println("000"); }
    }
}
