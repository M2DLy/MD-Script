
import org.xml.sax.*;
public class VariableProcess
{
    private String l = "";
    public VariableProcess Save(String p)  { this.l = p.replaceAll(".",""); return this; }
    private void IntValue(String i)
    {
        
    }
    private void StringValue(String s) 
    {
        
    }
    private void SaveVariable(MDLang_provider m,String[] p)   {  String name  = p[0].trim(),  value = p[1].trim();  m.vn.Add(name); m.vv.Add("$$");m.vt.Add("int");}
    private void SaveVariableName(MDLang_provider m,String p)  { m.vn.Add(p.trim());  }
    public void Process(MDLang_provider m)
    {
        if(this.l.indexOf("=") != -1)   {  this.SaveVariable(m,this.l.split("="));  }
        else {  this.SaveVariableName(m,this.l);  }
    }
    public void _SET_DEFAULT_() 
    {
        
    }
}
