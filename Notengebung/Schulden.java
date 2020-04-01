import java.io.IOException;

public class Schulden
{
    private int schuldenstand;
    private Datei text;
    public Schulden()
    {schuldenstand=0;
        text= new Datei();
    }

    public int ausgeben()throws IOException
    {schuldenstand=text.read();
        System.out.println("Ihr schuldet mir momentan "+schuldenstand+" Euro.");
        return schuldenstand;
    }

    public void machen(int betrag) throws IOException
    {schuldenstand=schuldenstand+betrag;
        text.write(schuldenstand);
    }
}
