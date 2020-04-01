import java.util.Scanner;

public class Bewegungseingaben
{
    Scanner scanner = new Scanner(System.in);

    BewegtesRechteck rechteck=new BewegtesRechteck();
    public Bewegungseingaben()
    {

    }

    public void ansage()
    {
        System.out.println("Du kannst dein Rechteck mit folgenden Kommandos bewegen:");
        System.out.println("nachRechts");
        System.out.println("nachLinks");
        System.out.println("nachOben");
        System.out.println("nachUnten");

        while(0==0){
            String eingabe=scanner.next();
            if(eingabe.equals("nachRechts"))
            {
                rechteck.nachRechts(1);
                System.out.println("erfolgreich bewegt");
            }
            if(eingabe.equals("nachLinks"))
            {
                rechteck.nachLinks(1);   
                System.out.println("erfolgreich bewegt");
            }
            if(eingabe.equals("nachOben"))
            {
                rechteck.nachOben(1); 
                System.out.println("erfolgreich bewegt");
            }
            if(eingabe.equals("nachUnten"))
            {
                rechteck.nachUnten(1); 
                System.out.println("erfolgreich bewegt");
            }
            if(eingabe.equals("0"))
            {
                System.exit(0);
            }
            eingabe="";
        }
    }

}
