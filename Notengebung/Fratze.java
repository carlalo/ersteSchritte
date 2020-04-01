
public class Fratze
{
    private Rechteck linkesAuge=new Rechteck();
    private Rechteck rechtesAuge=new Rechteck();
    private Rechteck grinsen=new Rechteck();
    private Quadrat links=new Quadrat();
    private Quadrat rechts=new Quadrat();
    public Fratze()
    {linkesAuge.laengeAendern(60);
        linkesAuge.breiteAendern(60);
        linkesAuge.farbeAendern("weiss");
        linkesAuge.xPositionÄndern(200);
        linkesAuge.yPositionÄndern(100);
        linkesAuge.sichtbarMachen();

        rechtesAuge.laengeAendern(60);
        rechtesAuge.breiteAendern(60);
        rechtesAuge.farbeAendern("weiss");
        rechtesAuge.xPositionÄndern(400);
        rechtesAuge.yPositionÄndern(100);
        rechtesAuge.sichtbarMachen();

        grinsen.laengeAendern(300);
        grinsen.breiteAendern(20);
        grinsen.farbeAendern("weiss");
        grinsen.xPositionÄndern(180);
        grinsen.yPositionÄndern(300);
        grinsen.sichtbarMachen();

        links.groesseAendern(20);
        links.farbeAendern("weiss");
        links.xPositionÄndern(160);
        links.yPositionÄndern(280);
        links.sichtbarMachen();

        rechts.groesseAendern(20);
        rechts.farbeAendern("weiss");
        rechts.xPositionÄndern(480);
        rechts.yPositionÄndern(280);
        rechts.sichtbarMachen();
    }

    public void lachen()
    {

    }
}
