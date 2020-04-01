
import java.util.*;
import java.io.*;
public class SelfControl
{
    private Scanner scanner=new Scanner(System.in);
    private String Null="0";

    private Datei text=new Datei();
    public SelfControl()throws IOException
    {letsGo();

    }

    public void letsGo()throws IOException
    {   

     
        String ausgabe="";
        int g=0;
        System.out.println("bereits geschrieben");

        ausgabe=text.readLine();
        System.out.println(ausgabe);

    
    System.out.println("");
    System.out.println("Bitte eingeben");
    String r="";

    for(int i=1;i<i+1;i++){

        r=scanner.nextLine();
        if(r.equalsIgnoreCase(Null)){
            System.out.println("Terminal geschlossen");
            System.exit(0);
        }
        else{
            text.writeLine(String.join("\n", r+", "));

        }
    } 
}

}
