import java.util.Scanner;

public class LetsGoMal
{
   private int zähler=0;
    int g=0;
    String einfach="einfach";
    String schwer="schwer";
    String extrem="extrem";
    String ja="ja";
    String nein="nein";
    long[]zufall1=new long[12];
    long[]zufall2=new long[12];
    long[]eingabe=new long[12];
    Scanner s=new Scanner(System.in);
    EinfachMal e=new EinfachMal();
    SchwerMal sch=new SchwerMal();
    ExtremMal ex=new ExtremMal();
    public LetsGoMal()
    {
      
    }

   
   public void letsGoMal()
    {System.out.println("Du hast dich für 'mal'entschieden");
        System.out.println("");
        System.out.println("Dir werden nun 10 Aufgaben gestellt.");
        System.out.println("Diese beantwortest du, indem du einfach die Antwort eintippst");
        System.out.println("Als erstes musst du dich entscheiden.");
        System.out.println("Wähle 'einfach','schwer'oder 'extrem', indem du es eintippst!");
        String entscheidung=s.next();
        if(einfach.equalsIgnoreCase(entscheidung)){
            e.einfachMal();
        }else{
            if(schwer.equalsIgnoreCase(entscheidung)){
                sch.schwerMal();
            }else{
                if(extrem.equalsIgnoreCase(entscheidung)){
                    ex.extremMal();
                }
            }
        }
    }
}
