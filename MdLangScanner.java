public class MdLangScanner 
{
    public void Scanner(MDLang_provider m)
    {
        String[] vn = m.vn.AvoidNullValue(),
            vv = m.vv.AvoidNullValue(),
            vt = m.vt.AvoidNullValue();
        System.out.println("+- Default Variabls---+");
        for(int i = 0; i<vn.length; i++)
        {
            System.out.println(i+") '"+vt[i]+" "+ vn[i]+" = "+vv[i]+"'");
        }
        System.out.println("+--------------------+");
    }
}
class MDLang_Def
{
    public void _set_dedaults_(MDLang_provider m)
    {
        m.vn.Add("_LANG_VERSION_"); m.vv.Add("0.1.1"); m.vt.Add("string");
        m.vn.Add("_LANG_PATH_"); m.vv.Add("/storage/sdcard0/AppProjects/Java_test/"); m.vt.Add("int");m.vn.Add("_"); m.vv.Add("null"); m.vt.Add("object");
        m.vn.Add("_LANG_SYS_NAME_"); m.vv.Add("Android"); m.vt.Add("string");
    }
}
