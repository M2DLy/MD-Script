public class StorageHandle
{
    private String[]     a = new String[1000];
    private int          count = 0,icount = 0;
    private int[]        Numbers = new int[1000];
    public  int          _INDEX_CONTAIN_ = 0;
    public  int          Length() {  return this.AvoidNullValue().length+this.AvoidNullValue(0).length; }
    public  void         Add(String p)  { this.a[this.count] = p; this.count = this.count + 1;  }
    public  void         Add(int p,String pp) {  this.a[p] = pp;  }
    public  void         Add(int p) {this.Numbers[this.icount] = p;this.icount = this.icount+1;}
    public  String[]     GetStringData()  { return this.a;}
    public  int[]        GetIntData() {return this.Numbers;}
    public  void         RemoveString(int p) {  this.a[p] = null; this.SetItem(this.AvoidNullValue());  }
    public  void         ClearStringData() {    this.a = new String[1000];   }
    public  void         ClearIntData() { this.Numbers = new int[1000];}
    public  void         ClearAll() { this.ClearIntData(); this.ClearStringData();}
    public  boolean      IsNull(int p)  { return (this.a[p] == null) ? true : false;  }
    public  boolean      IsNull(int p,boolean t) {return (this.Numbers[p] == 0) ? true:false;}
    public  String[]     AvoidNullValue()  {    int j = 0;   int[] sp = new int[1000];  for(int i = 0;i<this.a.length;i++) {  if((i-j) >= 12) {break;}   if(this.IsNull(i)) {}  else {  sp[j] = i; j++;  }  }   String[] n = new String[j];  for(int i = 0; i < j;i++) {  n[i] = this.GetStringData()[sp[i]];  }  return n; }
    public  int[]        AvoidNullValue(int p) { int j = 0;  int[] sp = new int[1000]; for(int i = 0,c = 0;i<this.Numbers.length;i++)  { if((i-c)>=12) {break;} if(this.IsNull(i,true)) {}  else {sp[j] = i; j++; }   }  int[] n = new int[j];for(int i = 0;i<j;i++) { n[i] = this.GetIntData()[sp[i]]; } return n; }
    public  void         SetItem(String[] item)  { this.a = item; }
    public  void         SetItem(int[] item) { this.Numbers = item;}
    public  boolean      Contains(String p)   {    boolean b = false; String[] anv =  this.AvoidNullValue(); for(int i = 0; i< anv.length; i++)  {     if(anv[i].equals(p)) {this._INDEX_CONTAIN_ = i; b = true; break;} }  return b;   }
    public  boolean      Contains(boolean super_match,String p)  {  if(super_match)   {      boolean f = false;   String[] anv =  this.AvoidNullValue();    for(int i = 0; i< anv.length; i++)    {      if(anv[i].equals(p.toLowerCase())) { f = true;this._INDEX_CONTAIN_ = i; break; }     else if(anv[i].equals(p.toLowerCase())) { f = true;this._INDEX_CONTAIN_ = i; break; }   }  return f;     }    else    {   return this.Contains(p); }  }
    public  boolean      Contains(int p){return true;}
    public  String       Int2String(int p) { return this.Numbers[p]+"";}
    public  int          String2Int(int p) { int v = 0;try{  v =  Integer.parseInt(this.a[p]); }catch(Exception e) { v = 0; System.console().printf("Error is "+e.getMessage()); } return v; }
    public  void         RemoveInt(int p) { this.Numbers[p] = 0;this.SetItem(this.AvoidNullValue(0));}
    public  void         EmptyData(){this.a = new String[0]; this.Numbers = new int[0];}
    public  void         SetDataLimit(int p) { this.ClearAll(); this.a = new String[p];this.Numbers = new int[p];}
    public  String[]     Sort() {String[] z = this.AvoidNullValue();for(int i = z.length-1,p = 0;i>0;i--){  z[p] = z[i]; p++;  } return z; }
    public  int[]        Sort(int arg0) { int[] z = this.AvoidNullValue(0);for(int i = z.length-1,p = 0;i>0;i--){z[p] = z[i]; p++;} return z;}
    
}
