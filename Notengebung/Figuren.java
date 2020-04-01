
public class Figuren
{

    public Figuren()
    {

    }

    public String[] quadratErstellen(int wert)
    {
        String[] ergebnis=new String[wert+2];
        ergebnis[0]="*".repeat(wert);

        for(int i=1;i+2<=wert;++i)
        { ergebnis[i]="*";
            for(int o=0;o<wert-2;++o)
            {ergebnis[i]=ergebnis[i]+" ";

            }
            ergebnis[i]=ergebnis[i]+"*";
        }
        ergebnis[wert-1]="*".repeat(wert);
        return ergebnis;
    }

    public String[] dreieckErstellen(int wert)
    {int index=wert-1;
        String[] ergebnis=new String[wert+2];
        ergebnis[0]=" ".repeat(index)+"*"+" ".repeat(index);
        int leerzeichen=1;      
        index=index-1;
        for(int i=1;i!=wert-1;++i)
        {
            ergebnis[i]=" ".repeat(index)+"*"+" ".repeat(leerzeichen)+"*"+" ".repeat(index);
            index=index-1;
            leerzeichen=leerzeichen+2;

        }
        ergebnis[wert-1]="*".repeat(2*(wert-1)+1);

        return ergebnis;
    }

    public String[] rauteErstellen(int wert)
    {   String[] ergebnis=new String[wert+3];
        ergebnis[0]=" ".repeat(wert-1)+"*"+" ".repeat(wert-1);
        int index=wert-2;
        int leerzeichen=1;
        int count=1;
        
        int zahl=wert/2;
        zahl=zahl+1;
       
        while(count!=zahl)
        {ergebnis[count]=(" ".repeat(index)+"*"+" ".repeat(leerzeichen)+"*"+" ".repeat(index));
            index=index-1;
            leerzeichen=leerzeichen+2;
            count=count+1;
            
        }
        index=index+1;
        leerzeichen=leerzeichen-2;
        while(index!=wert-2)
        {
            index=index+1;
            leerzeichen=leerzeichen-2;
            ergebnis[count]=" ".repeat(index)+"*"+" ".repeat(leerzeichen)+"*"+" ".repeat(index);
            count=count+1;
        }

        ergebnis[wert-1]=" ".repeat(wert-1)+"*"+" ".repeat(wert-1);
        return ergebnis;
    }
    /*Raute wird angegeben, wenn eingegebene Zahl ungerade ist!*/
    public void inReihe(int wert)
    { String[] quadrat= quadratErstellen(wert);
        String[] dreieck=dreieckErstellen(wert);
        String[] raute=rauteErstellen(wert);
        for(int i=0;i<=wert-1;++i){
            if(wert%2!=0)
            {System.out.print(raute[i]);
            System.out.print(" ");}
            System.out.print(quadrat[i]);
            System.out.print(" ");
            System.out.println(dreieck[i]);
        }
    }
}
