
public class Ende
{
    

    /**
     * Constructor for objects of class Ende
     */
    public Ende()
    {

    }

    public void ende(int zähler){
        System.out.println("");
        System.out.println("Dein Ergebnis:");
        System.out.println("Du hast "+zähler+" von 10 Aufgaben richtig gelöst.");
        System.out.println("Herzlichen Glückwunsch");
        System.out.println("");
        System.out.println("Nun die richtigen Ergebnisse für deine falschen Antworten");
        if(zähler==10){
            System.out.println("Oh alles richtig :-)");
        }
    }
}
