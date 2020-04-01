import java.util.Scanner;

public class Entscheidung
{
LetsGoGeteilt g=new LetsGoGeteilt();
LetsGoMal m=new LetsGoMal();
    public Entscheidung()
    {

    }

    public void entscheidung(){
        System.out.println("Entscheide dich zwischen 'mal' und 'geteilt'.");
        Scanner scanner=new Scanner(System.in);
        String a="";
        String b="geteilt";
        String c="mal";
        a=scanner.next();

        if(b.equalsIgnoreCase(a)){
            g.letsGoGeteilt();
        }else{if(c.equalsIgnoreCase(a)){
                m.letsGoMal();}

        }
    }
}