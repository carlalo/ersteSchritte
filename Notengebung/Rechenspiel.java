
import java.util.Scanner;
public class Rechenspiel
{ 
    int g=0;
    String ja="ja";
    String nein="nein";
    private int zähler=0;

    String einfach="einfach";
    String schwer="schwer";
    String extrem="extrem";

    long[]zufall1=new long[12];
    long[]zufall2=new long[12];
    long[]eingabe=new long[12];
    Scanner s=new Scanner(System.in);

    public Rechenspiel()
    {while(g==g){
            entscheidung();

            System.out.println("Wenn du nicht erneut spielen möchtest gebe 'nein' ein, ansonsten irgenwas");
            Scanner r=new Scanner(System.in);
            String b=r.next();
            if(nein.equalsIgnoreCase(b)){
                System.out.println("Du kannst das Terminal nun schließen.");
                System.exit(0);
            }

        }

    }

    public void entscheidung(){
        System.out.println("Entscheide dich zwischen 'mal' und 'geteilt'.");
        Scanner scanner=new Scanner(System.in);
        String a="";
        String b="geteilt";
        String c="mal";
        a=scanner.next();

        if(b.equalsIgnoreCase(a)){
            letsGoGeteilt();
        }else{if(c.equalsIgnoreCase(a)){
                letsGoMal();}

        }
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
            einfachMal();
        }else{
            if(schwer.equalsIgnoreCase(entscheidung)){
                schwerMal();
            }else{
                if(extrem.equalsIgnoreCase(entscheidung)){
                    extremMal();
                }
            }
        }
    }

    public void einfachMal(){
        zähler=0;
        System.out.println("Du hast dich für 'einfach' entschieden.Viel Spaß :-)");
        for(int i=1;i<11;i++){
            zufall1[i]=Math.round(Math.random()*9+1);
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
            }
        }

        ende(zähler);
        for(int i=1;i<11;i++){
            if(eingabe[i]!=zufall1[i]*zufall2[i]){
                System.out.println("");
                System.out.println(i+". Aufgabe:");
                System.out.println(""+zufall1[i]+"*"+zufall2[i]+"="+zufall1[i]*zufall2[i]);
                System.out.println("Deine Eingabe war:"+eingabe[i]);
            }
        }
        System.out.println("Wenn du deine Statistik sehen möchtest gebe 'Statistik' ein");
        Scanner p=new Scanner(System.in);
        if("Statistik".equalsIgnoreCase(p.next())){
            diagrammErstellen(zähler, "einfach mal");
        }
    }

    public void extremMal(){
        zähler=0;
        System.out.println("Du hast dich für 'extrem' entschieden.Viel Spaß :-)");
        for(int i=1;i<11;i++){
            zufall1[i]=Math.round(Math.random()*99+1);
            zufall2[i]=Math.round(Math.random()*99+1);
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
            }
        }

        ende(zähler);
        for(int i=1;i<11;i++){
            if(eingabe[i]!=zufall1[i]*zufall2[i]){
                System.out.println("");
                System.out.println(i+". Aufgabe:");
                System.out.println(""+zufall1[i]+"*"+zufall2[i]+"="+zufall1[i]*zufall2[i]);
                System.out.println("Deine Eingabe war:"+eingabe[i]);
            }
        }
        System.out.println("Wenn du deine Statistik sehen möchtest gebe 'Statistik' ein");
        Scanner p=new Scanner(System.in);
        if("Statistik".equalsIgnoreCase(p.next())){
            diagrammErstellen(zähler, "schwer mal");
        }
    }

    public void schwerMal(){
        zähler=0;
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
            }
        }

        ende(zähler);
        for(int i=1;i<11;i++){
            if(eingabe[i]!=zufall1[i]*zufall2[i]){
                System.out.println("");
                System.out.println(i+". Aufgabe:");
                System.out.println(""+zufall1[i]+"*"+zufall2[i]+"="+zufall1[i]*zufall2[i]);
                System.out.println("Deine Eingabe war:"+eingabe[i]);
            }
        }
        System.out.println("Wenn du deine Statistik sehen möchtest gebe 'Statistik' ein");
        Scanner p=new Scanner(System.in);
        if("Statistik".equalsIgnoreCase(p.next())){
            diagrammErstellen(zähler, "extrem mal");
        }
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
            einfachGeteilt();
        }else{
            if(schwer.equalsIgnoreCase(entscheidung)){
                schwerGeteilt();
            }else{if(extrem.equalsIgnoreCase(entscheidung)){
                    extremGeteilt();
                }
            }

        }
    }

    public void einfachGeteilt(){
        zähler=0;
        System.out.println("Du hast dich für 'einfach' entschieden.Viel Spaß :-)");
        long[] richtigesErgebnis=new long[11];
        for(int i=1;i<11;i++){
            zufall1[i]=Math.round(Math.random()*9+1);
            zufall2[i]=Math.round(Math.random()*9+1);

            richtigesErgebnis[i]=zufall1[i]*zufall2[i];
            System.out.println("");
            System.out.println(""+i+".Aufgabe");
            System.out.println(""+richtigesErgebnis[i]+"/"+""+zufall2[i]+"=");
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
        ende(zähler);
        for(int i=1;i<11;i++){
            if(eingabe[i]!=richtigesErgebnis[i]/zufall2[i]){
                System.out.println("");
                System.out.println(i+". Aufgabe:");
                System.out.println(""+richtigesErgebnis[i]+"/"+zufall2[i]+"="+richtigesErgebnis[i]/zufall2[i]);
                System.out.println("Deine Eingabe war:"+eingabe[i]);
            }
        }
        System.out.println("Wenn du deine Statistik sehen möchtest gebe 'Statistik' ein");
        Scanner p=new Scanner(System.in);
        if("Statistik".equalsIgnoreCase(p.next())){
            diagrammErstellen(zähler, "einfach geteilt");
        }
    }

    public void schwerGeteilt(){
        System.out.println("Du hast dich für 'extrem' entschieden.Viel Spaß :-)");
        zähler=0;
        long[] richtigesErgebnis=new long[11];
        for(int i=1;i<11;i++){
            zufall1[i]=Math.round(Math.random()*99+1);
            zufall2[i]=Math.round(Math.random()*9+1);

            richtigesErgebnis[i]=zufall1[i]*zufall2[i];
            System.out.println("");
            System.out.println(""+i+".Aufgabe");
            System.out.println(""+richtigesErgebnis[i]+"/"+""+zufall2[i]+"=");
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
        ende(zähler);
        for(int i=1;i<11;i++){
            if(eingabe[i]!=richtigesErgebnis[i]/zufall2[i]){
                System.out.println("");
                System.out.println(i+". Aufgabe:");
                System.out.println(""+richtigesErgebnis[i]+"/"+zufall2[i]+"="+richtigesErgebnis[i]/zufall2[i]);
                System.out.println("Deine Eingabe war:"+eingabe[i]);
            }
        }
        System.out.println("Wenn du deine Statistik sehen möchtest gebe 'Statistik' ein");
        Scanner p=new Scanner(System.in);
        if("Statistik".equalsIgnoreCase(p.next())){
            diagrammErstellen( zähler, "schwer geteilt");
        }
    }

    public void extremGeteilt(){
        System.out.println("Du hast dich für 'extrem' entschieden.Viel Spaß :-)");
        zähler=0;
        long[] richtigesErgebnis=new long[11];
        for(int i=1;i<11;i++){
            zufall1[i]=Math.round(Math.random()*99+1);
            zufall2[i]=Math.round(Math.random()*99+1);

            richtigesErgebnis[i]=zufall1[i]*zufall2[i];
            System.out.println("");
            System.out.println(""+i+".Aufgabe");
            System.out.println(""+richtigesErgebnis[i]+"/"+""+zufall2[i]+"=");
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
        ende(zähler);
        for(int i=1;i<11;i++){
            if(eingabe[i]!=richtigesErgebnis[i]/zufall2[i]){
                System.out.println("");
                System.out.println(i+". Aufgabe:");
                System.out.println(""+richtigesErgebnis[i]+"/"+zufall2[i]+"="+richtigesErgebnis[i]/zufall2[i]);
                System.out.println("Deine Eingabe war:"+eingabe[i]);
            }
        }
        System.out.println("Wenn du deine Statistik sehen möchtest gebe 'Statistik' ein");
        Scanner p=new Scanner(System.in);
        if("Statistik".equalsIgnoreCase(p.next())){
            diagrammErstellen(zähler, "extrem geteilt");
        }
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

    public void diagrammErstellen(int punktzahl, String schwierigkeitsgrad)
    {
        String[] diagramm=new String[12];
        diagramm[0]="10|   |";
        diagramm[1]=" 9|   |";
        diagramm[2]=" 8|   |";
        diagramm[3]=" 7|   |";
        diagramm[4]=" 6|   |";
        diagramm[5]=" 5|   |";
        diagramm[6]=" 4|   |";
        diagramm[7]=" 3|   |";
        diagramm[8]=" 2|   |";
        diagramm[9]=" 1|   |";
        diagramm[10]="------";
        diagramm[11]=schwierigkeitsgrad;
        if(punktzahl==10)
        {
            diagramm[0]="10| * |";
        }
        if(punktzahl>=9)
        {
            diagramm[1]=" 9| * |";
        }
        if(punktzahl>=8)
        {
            diagramm[2]=" 8| * |";
        }
        if(punktzahl>=7)
        {
            diagramm[3]=" 7| * |";
        }
        if(punktzahl>=6)
        {
            diagramm[4]=" 6| * |";
        }
        if(punktzahl>=5)
        {
            diagramm[5]=" 5| * |";
        }
        if(punktzahl>=4)
        {
            diagramm[6]=" 4| * |";
        }
        if(punktzahl>=3)
        {
            diagramm[7]=" 3| * |";
        }
        if(punktzahl>=2)
        {
            diagramm[8]=" 2| * |";
        }
        if(punktzahl>=1)
        {
            diagramm[9]=" 1| * |";
        }
        for(int zeile=0;zeile<=11;++zeile)
        {
            System.out.println(diagramm[zeile]);
        }
    }
} 

