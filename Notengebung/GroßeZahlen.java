
public class GroßeZahlen
{

    public GroßeZahlen()
    {

    }

    private String[] nullErstellen()
    {String[] Null=new String[5];
        Null[0]=" *** ";
        Null[1]=" * * ";
        Null[2]=" * * ";
        Null[3]=" * * ";
        Null[4]=" *** ";

        return Null;  
    }

    private String[] einsErstellen()
    {String[] eins=new String[5];
        eins[0]=" ".repeat(3)+"*"+" ";
        eins[1]="  "+"**"+" ";
        eins[2]=" "+"*"+" "+"*"+" ";
        eins[3]="   "+"*"+" ";
        eins[4]=" "+"****";

        return eins;  
    }

    private String[] zweiErstellen()
    {String[] zwei=new String[5];
        zwei[0]=" "+"***"+" ";
        zwei[1]="   "+"*"+" ";
        zwei[2]=" "+"***"+" ";
        zwei[3]=" "+"*"+"   ";
        zwei[4]=" "+"***"+" ";
        return zwei;
    }

    private String[] dreiErstellen()
    {String[] drei=new String[5];
        drei[0]=" "+"***"+" ";
        drei[1]="   "+"*"+" ";
        drei[2]=" "+"***"+" ";
        drei[3]="   "+"*"+" ";
        drei[4]=" "+"***"+" ";
        return drei;

    }

    private String[] vierErstellen()
    {String[] vier=new String[5];
        vier[0]=" * * ";
        vier[1]=" * * ";
        vier[2]=" *** ";
        vier[3]="   * ";
        vier[4]="   * ";
        return vier;

    }

    private String[] fünfErstellen()
    {String[] fünf=new String[5];
        fünf[0]=" *** ";
        fünf[1]=" *   ";
        fünf[2]=" *** ";
        fünf[3]="   * ";
        fünf[4]=" *** ";
        return fünf;

    }

    private String[] sechsErstellen()
    {String[] sechs=new String[5];
        sechs[0]=" *** ";
        sechs[1]=" *   ";
        sechs[2]=" *** ";
        sechs[3]=" * * ";
        sechs[4]=" *** ";
        return sechs;

    }

    private String[] siebenErstellen()
    {String[] sieben=new String[5];
        sieben[0]=" *** ";
        sieben[1]="   * ";
        sieben[2]="  ** ";
        sieben[3]="   * ";
        sieben[4]="   * ";
        return sieben;

    }

    private String[] achtErstellen()
    {String[] acht=new String[5];
        acht[0]=" *** ";
        acht[1]=" * * ";
        acht[2]=" *** ";
        acht[3]=" * * ";
        acht[4]=" *** ";
        return acht;

    }

    private String[] neunErstellen()
    {String[] sieben=new String[5];
        sieben[0]=" *** ";
        sieben[1]=" * * ";
        sieben[2]=" *** ";
        sieben[3]="   * ";
        sieben[4]=" *** ";

        int[][] zahlen = new int[10][5];
        zahlen[0][0] = 4;
        int[] row0 = zahlen[0];

        return sieben;
    }

    public void ausgabe(String eingabe)
    {String[][] werte=new String[10][5];
        werte[0]=nullErstellen();   
        werte[1]=einsErstellen();   

        werte[2]=zweiErstellen();
        werte[3]=dreiErstellen();
        werte[4]=vierErstellen();
        werte[5]=fünfErstellen();
        werte[6]=sechsErstellen();
        werte[7]=siebenErstellen();
        werte[8]=achtErstellen();
        werte[9]=neunErstellen();
        int count=1;
        if(!eingabe.equalsIgnoreCase("countdown"))
        {
            for(int zeile=0;zeile<5;++zeile)
            {
                count=1;
                while(count<=eingabe.length())
                {
                    if(count!=eingabe.length())
                    {
                        int zahl=Integer.parseInt(String.valueOf(eingabe.charAt(count-1)));
                        System.out.print(werte[zahl][zeile]);
                        count=count+1;
                    }else
                    {
                        if(count==eingabe.length()){
                            int zahl=Integer.parseInt(String.valueOf(eingabe.charAt(count-1)));
                            System.out.println(werte[zahl][zeile]);
                            count=count+1;
                        }
                    }
                }
            }
        }
        if(eingabe.equalsIgnoreCase("countdown"))
        {
            int anzahl=12;
            for(int o=9;o>=0;--o)
            {for(int i=0;i<5;++i)
                {
                    System.out.println(werte[o][i]);

                }

                for(int i=0;i<anzahl;++i)
                {System.out.println(" ");
                }
                sleep(1000);
            }   

            sleep(1000);
            Fratze Fratze =new Fratze();
            Fratze.lachen();
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) {
        }
    }
}
