import java.util.Scanner;
public class SchwerMal
{
    private int zähler=0;
    int g=0;
    long[]zufall1=new long[12];
    long[]zufall2=new long[12];
    long[]eingabe=new long[12];
     Scanner s=new Scanner(System.in);
    
    Ende ende=new Ende();
    /**
     * Constructor for objects of class SchwerMal
     */
    public SchwerMal()
    {

    }

     public void schwerMal(){
        System.out.println("Du hast dich für 'schwer' entschieden.Viel Spaß :-)");
        for(int i=1;i<11;i++){
            zufall1[i]=Math.round(Math.random()*99+1);
            zufall2[i]=Math.round(Math.random()*9+1);
            System.out.println("");
            System.out.println(""+i+".Aufgabe");
            System.out.println(""+zufall1[i]+"*"+""+zufall2[i]+"=");
            long richtigesErgebnis=zufall1[i]*zufall2[i];
            eingabe[i]=s.nextInt();

            if(eingabe[i]==g){
                System.out.println("Programm geschlossen. Sie können das Terminal nun schließen");
                System.exit(0);
            }else{
                if(eingabe[i]==richtigesErgebnis){
                    zähler=zähler+1;
                }
            }}
       
        ende.ende(zähler);
        for(int i=1;i<11;i++){
            if(eingabe[i]!=zufall1[i]*zufall2[i]){
                System.out.println("");
                System.out.println(i+". Aufgabe:");
                System.out.println(""+zufall1[i]+"*"+zufall2[i]+"="+zufall1[i]*zufall2[i]);
                System.out.println("Deine Eingabe war:"+eingabe[i]);
            }
        }
    }
}
