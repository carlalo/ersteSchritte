
public class BewegtesRechteck
{
    private Rechteck Rechteck=new Rechteck();

    public BewegtesRechteck()
    {Rechteck.laengeAendern(30);
        Rechteck.breiteAendern(30);
        Rechteck.farbeAendern("rot");
        Rechteck.xPositionÄndern(500);
        Rechteck.yPositionÄndern(500);
        Rechteck.sichtbarMachen();

    }

    public void imQuadratbewegen(int wert)
    {for(int i=0;i<=wert;++i)
        {
            Rechteck.langsamHorizontalBewegen(300);
            Rechteck.langsamVertikalBewegen(300);
            Rechteck.langsamHorizontalBewegen(-300);
            Rechteck.langsamVertikalBewegen(-300);
        }

    }
    
     public void nachRechts(int wert)
    {for(int i=0;i<=wert;++i)
        {
            Rechteck.nachRechtsBewegen();
        }

    }
    public void nachLinks(int wert)
    {for(int i=0;i<=wert;++i)
        {
            Rechteck.nachLinksBewegen();
        }

    }
    public void nachOben(int wert)
    {for(int i=0;i<=wert;++i)
        {
            Rechteck.nachObenBewegen();
        }

    }
    public void nachUnten(int wert)
    {for(int i=0;i<=wert;++i)
        {
            Rechteck.nachUntenBewegen();
        }

    }
}
