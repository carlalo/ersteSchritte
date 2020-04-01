import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;
import java.awt.BorderLayout;
public class Flugzeug
{
    private Rechteck linkerFlügel;
    private Rechteck rechterFlügel;
    private Rechteck linkesGeschoss;
    private Rechteck rechtesGeschoss;
    private Rechteck hintererFlügel;
    private Rechteck körper;
    private Dreieck bug;

    private int g=0;
    private String d="d";
    private String Null="0";
    //private Leinwand leinwand=new Leinwand();

    public Flugzeug()
    {
       
        
        linkesGeschoss=new Rechteck();
        linkesGeschoss.laengeAendern(5);
        linkesGeschoss.breiteAendern(60);
        linkesGeschoss.xPositionÄndern(725);
        linkesGeschoss.yPositionÄndern(700);
        linkesGeschoss.sichtbarMachen();
        linkesGeschoss.farbeAendern("rot");

        rechtesGeschoss=new Rechteck();
        rechtesGeschoss.laengeAendern(5);
        rechtesGeschoss.breiteAendern(60);
        rechtesGeschoss.xPositionÄndern(830);
        rechtesGeschoss.yPositionÄndern(700);
        rechtesGeschoss.sichtbarMachen();
        rechtesGeschoss.farbeAendern("rot");

        linkerFlügel=new Rechteck();
        linkerFlügel.laengeAendern(60);
        linkerFlügel.breiteAendern(20);
        linkerFlügel.xPositionÄndern(700);
        linkerFlügel.yPositionÄndern(730);
        linkerFlügel.sichtbarMachen();
        linkerFlügel.farbeAendern("weiss");

        rechterFlügel=new Rechteck();
        rechterFlügel.laengeAendern(60);  
        rechterFlügel.breiteAendern(20);
        rechterFlügel.xPositionÄndern(800);
        rechterFlügel.yPositionÄndern(730);
        rechterFlügel.sichtbarMachen();
        rechterFlügel.farbeAendern("weiss");

        körper=new Rechteck();
        körper.laengeAendern(40);
        körper.breiteAendern(130);
        körper.xPositionÄndern(760);
        körper.yPositionÄndern(660);
        körper.sichtbarMachen();
        körper.farbeAendern("weiss");

        hintererFlügel=new Rechteck();
        hintererFlügel.laengeAendern(80);
        hintererFlügel.breiteAendern(15);
        hintererFlügel.xPositionÄndern(740);
        hintererFlügel.yPositionÄndern(790);
        hintererFlügel.sichtbarMachen();
        hintererFlügel.farbeAendern("rot");

        bug=new Dreieck();
        bug.groesseAendern(20, 40);
        bug.sichtbarMachen();
        bug.xPositionÄndern(780);
        bug.yPositionÄndern(640);
        bug.farbeAendern("rot");
         Leinwand leinwand=Leinwand.gibLeinwand();
        
    }

    public void nachRechts(int wert) 
    {

        linkerFlügel.horizontalBewegen(wert);
        rechterFlügel.horizontalBewegen(wert);
        linkesGeschoss.horizontalBewegen(wert);
        rechtesGeschoss.horizontalBewegen(wert);
        körper.horizontalBewegen(wert);
        bug.horizontalBewegen(wert);
        hintererFlügel.horizontalBewegen(wert);

    }
 public void nachLinks(int wert) 
    {

        linkerFlügel.horizontalBewegen(-wert);
        rechterFlügel.horizontalBewegen(-wert);
        linkesGeschoss.horizontalBewegen(-wert);
        rechtesGeschoss.horizontalBewegen(-wert);
        körper.horizontalBewegen(-wert);
        bug.horizontalBewegen(-wert);
        hintererFlügel.horizontalBewegen(-wert);

    }
}
