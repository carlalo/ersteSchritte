/* Berechnet den Notenschnitt für den Fall das es drei(oder weniger) mündliche Noten gibt
*  und vier(oder weniger) schriftliche Noten
*  Bitte die Methode notenschnitt() ausführen
   */

public class Notenschnitt
{
   private double notenschnittm ;
   private double notenschnitts;
   private double ergebnis; 
    public Notenschnitt()
    {notenschnittm=0;
     notenschnitts=0;
     ergebnis=0;
   
    }

  /*Bitte geben sie ihre Noten ein! Wenn die Note nicht existiert bitte 0 eintragen!!*/
    public void notenschnitt(double mündlich1,double mündlich2, double mündlich3, double schriftlich1, double schriftlich2 , double schriftlich3, double schriftlich4)
    {if(notenschnittmberechnen(mündlich1,mündlich2,mündlich2)!=0){
        if(notenschnittsberechnen(schriftlich1,schriftlich2,schriftlich3,schriftlich4)!=0){
            ergebnis=(notenschnittmberechnen(mündlich1,mündlich2,mündlich2)+notenschnittsberechnen(schriftlich1,schriftlich2,schriftlich3,schriftlich4)*2)/3;
        }else{ergebnis=notenschnittmberechnen(mündlich1,mündlich2,mündlich2);}
    }else{ergebnis=0;}
    System.out.println("Der Notenschnitt ihrer Noten ist: "+ergebnis);  
    }
    
    private double notenschnittmberechnen(double n1,double n2, double n3)
    {if(n1!=0){
        if(n2!=0){
            if(n3!=0){notenschnittm=(n1+n2+n3)/3;}
            else{notenschnittm=(n1+n2)/2;}
        }else{notenschnittm=n1;}
    } else{notenschnittm=0;}      
    return notenschnittm;
    }
     private double notenschnittsberechnen(double n1,double n2, double n3, double n4)
    {if(n1!=0){
        if(n2!=0){
            if(n3!=0){
                if(n4!=0){notenschnitts=(n1+n2+n3+n4)/4;}
                else{notenschnitts=(n1+n2+n3)/3;}
            }else{notenschnitts=(n1+n2)/2;}
        }else{notenschnitts=n1;}
    } else{notenschnitts=0;}      
    return notenschnitts;
    }
}
