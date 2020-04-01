import java.util.Scanner;
public class Rechenspiel
{ 
    int g=0;
    String ja="ja";
    String nein="nein";
    Entscheidung entscheidung=new Entscheidung();

    public Rechenspiel()
    {while(g==g){
            entscheidung.entscheidung();
            System.out.println("Wenn du dich vertippst hast gebe 'ja'ein.");
            System.out.println("Wenn du nicht erneut spielen möchtest gebe 'nein' ein.");
            Scanner r=new Scanner(System.in);
            String b=r.next();
            if(nein.equalsIgnoreCase(b)){
                System.out.println("Du kannst das Terminal nun schließen.");
                System.exit(0);
            }
        }

    }

} 


   
