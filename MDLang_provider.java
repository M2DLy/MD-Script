import java.lang.String;
import java.io.*;
import java.util.*;
import java.text.*;

public class MDLang_provider
{
    /* ******************************** */
    public StorageHandle vn  = new StorageHandle();
    public StorageHandle vv  = new StorageHandle();
    public StorageHandle vt  = new StorageHandle();
    public StorageHandle gtref = new StorageHandle();
    public StorageHandle gtcnt = new StorageHandle();
    /* ********************************* */
    protected boolean Error = false;
    protected String ErrorMSG = "";
    
    private String code = "";
    public String[] data;
    public void provideFile() throws IOException {  try( BufferedReader br = new BufferedReader(new FileReader("/storage/sdcard0/AppProjects/Java_test/src/test.mdl"))) {String line = "",r="";while (( line = br.readLine()) != null) {  r += line+"\n";} this.code = r; String[] z = r.split("\n"); this.data = z;}}
  //  private void EraseComments() {String x = this. code;String z = "";for(int i = 0;i<x.length();i++){ if(x.charAt(i) == '/' && x.charAt(i+1) == '*'){int j = i+3;for(;j<x.length();j++){  if(x.charAt(j) == '*' && x.charAt(j+1) == '/') {break;}  }   i = j+1;}else {    z += x.charAt(i);  }  }  this.code = z; }
    
    public void Parser(String[] code) throws IOException
    {
        providers p = new providers();
        int i = 0,j = 0;String s = "";
        String[] c = code;
        for(;i<c.length;i++)
        {
           s = c[i].trim(); s = s.substring(0,s.length()-1);
        /*     Token Detects        */
        /**/   if(s.startsWith("print(")&&s.endsWith(")"))
        /*PRINT*/   { p.PrintToken(s);}
        /**/   else if(s.equals("~exit"))
        /*EXIT*/    {System.out.println("Process Ended"); break;}
        /**/   else if(s.startsWith("//") || s.startsWith(";"))
        /*COMMENT*/ { /* Do nothig */ }
        /**/   else if(s.startsWith("#include"))
        /*INCLUDE*/ {  this.Parser(p.GetSourceCode("h"));  }
        /**/   else if(s.endsWith(":") && !s.startsWith("for("))
        /*GOTOref*/ { this.gtref.Add(s.replaceAll(":","")); this.gtcnt.Add(i); }
        /**/   else if(s.startsWith("goto "))
        /*GOTOkey*/ {  s = s.replaceAll("goto ","").trim(); if(this.gtref.Contains(s)) {i = this.gtcnt.GetIntData()[this.gtref._INDEX_CONTAIN_];} }
        /**/   else if(s.startsWith("for(") && s.endsWith("):")) 
        /**/        {
            /**/           System.out.println(s); p.ForToken_(s,this); 
        /**/        }
        /*    End Token Detects     */
        }
    }
    public void Scann(MDLang_provider m)
    {
        new MdLangScanner().Scanner(m);
    }
    public void main(String[] args) throws IOException   {  }
}
