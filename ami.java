
public abstract class ami
{

    protected abstract void baman(StringBuilder ama);

    public String aman()
        {
                StringBuilder ama =new StringBuilder();
                ama.append("aman");
                ama.append(" ");
                ama.append("singh");
                baman(ama);
                return ama.toString();  }
    public static void main(String[] args)
    {
     ami f= new rama();
    String a= f.aman();
    System.out.println(a);
    }
      
}

class rama extends ami
{ @Override
 protected void baman(StringBuilder ama)
  {ama.append("\n");
   ama.append("prajan");
   ama.append("kumar");}
}