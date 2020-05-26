
public class Bildschirmzeit
{
    int minuten;
    int Stunden;

    public Bildschirmzeit()
    {
    }

    public void start(int anfang)
    {
        for(int index=0;index<70;++index)
        {
            int aktZeit=zeit();
            minuten=minuten+1;
            if(minuten==60)
            {
                Stunden=Stunden+1;
                minuten=0;
            }
            sleep(1000);
        }
        int minutenakt=anfang%10;
        anfang=anfang/10;
        minutenakt=minutenakt+anfang%10;
        int Stundenakt=anfang;
        System.out.println("Die aktuelle Uhrzeit beträgt: "+Stundenakt+Stunden+":"+minutenakt+minuten);
    }

    

    private int zeit()
    {
        System.out.println(Stunden+":"+minuten);
        return Stunden*60+minuten;
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) {
        }
    }
}
