
public class Multiples_of_3_and_5
{

    public static void main(String[] args)
    {multiples(1000);

    }

    public static long multiples(int wert)
    {long zähler=0;
     long ergebnis=0;
        for(int i=0;i<wert-1;++i)
        {   zähler=zähler+1;
            if(zähler%3!=0){
                if(zähler%5==0){
                    ergebnis=ergebnis+zähler;
                    System.out.println(zähler);
                }
            }else{
                ergebnis=ergebnis+zähler;
                System.out.println(zähler);
            }
        }
        return ergebnis;
    }
}
