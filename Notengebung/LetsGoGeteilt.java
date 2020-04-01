import java.util.Scanner;
public class LetsGoGeteilt
{
    String einfach="einfach";
    String schwer="schwer";
    String extrem="extrem";
    Scanner s=new Scanner(System.in);
    EinfachGeteilt e=new EinfachGeteilt();
    SchwerGeteilt sch=new SchwerGeteilt();
    ExtremGeteilt ex=new ExtremGeteilt();
    /**
     * Constructor for objects of class LetsGoGeteilt
     */
    public LetsGoGeteilt()
    {

    }

    public void letsGoGeteilt()
    {System.out.println("Du hast dich für 'geteilt'entschieden.");
        System.out.println("");
        System.out.println("Dir werden nun 10 Aufgaben gestellt.");
        System.out.println("Diese beantwortest du, indem du einfach die Antwort eintippst");
        System.out.println("Als erstes musst du dich entscheiden.");
        System.out.println("Wähle 'einfach','schwer'oder 'extrem', indem du es eintippst!");
        String entscheidung=s.next();
        if(einfach.equalsIgnoreCase(entscheidung)){
            e.einfachGeteilt();
        }else{
            if(schwer.equalsIgnoreCase(entscheidung)){
                sch.schwerGeteilt();
            }else{if(extrem.equalsIgnoreCase(entscheidung)){
                    ex.extremGeteilt();
                }
            }

        }
    }
}
