import java.util.Scanner;
/**
 * Write a description of class ExtremGeteilt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExtremGeteilt
{
     private int zähler=0;
    int g=0;
    long[]zufall1=new long[12];
    long[]zufall2=new long[12];
    long[]eingabe=new long[12];
    Scanner s=new Scanner(System.in);
    Ende e=new Ende();
    /**
     * Constructor for objects of class ExtremGeteilt
     */
    public ExtremGeteilt()
    {

    }

    public void extremGeteilt(){
        System.out.println("Du hast dich für 'extrem' entschieden.Viel Spaß :-)");
        zähler=0;
        for(int i=1;i<11;i++){
            zufall1[i]=Math.round(Math.random()*99+1);
            zufall2[i]=Math.round(Math.random()*99+1);
      
            long richtigesErgebnis=zufall1[i]*zufall2[i];
            System.out.println("");
            System.out.println(""+i+".Aufgabe");
            System.out.println(""+richtigesErgebnis+"/"+""+zufall2[i]+"=");
            eingabe[i]=s.nextInt();

            if(eingabe[i]==g){
                System.out.println("Programm geschlossen. Sie können das Terminal nun schließen");
                System.exit(0);
            }else{
                if(eingabe[i]==zufall1[i]){
                    zähler=zähler+1;
                }
            }
        }
        e.ende(zähler);
    }
}
