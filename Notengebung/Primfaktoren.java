import java.util.List;
import java.util.ArrayList;
public class Primfaktoren
{

    public static void main(String[] args)
    {FaktorenFinden(10001);

    }

    public static void FaktorenFinden(int wert)
    {
        int index=1;
        int count=0;
        int zählerzuteilbarem=0;
        System.out.println(1);
        while(count<wert){
            for(int i=1;i!=index;++i){
                if(index%i!=0)
                {
                    zählerzuteilbarem=zählerzuteilbarem+1;
                }

            }
            if(zählerzuteilbarem==index-2)
            {
                ++count;
                System.out.println(String.format("%d. Primzahl: %d", count, index));
            }
            zählerzuteilbarem=0;
            index=index+1;

        }
    }

    public static int sum_of_factors_below_given_number(int wert)
    { int index=1;
        int ergebnis=0;
        int zählerzuteilbarem=0;
        System.out.println(1);
        while(index<wert){
            for(int i=1;i!=index;++i){
                if(index%i!=0)
                {
                    zählerzuteilbarem=zählerzuteilbarem+1;
                }

            }
            if(zählerzuteilbarem==index-2)
            {
                ergebnis=ergebnis+index;
                System.out.println(index);
            }
            zählerzuteilbarem=0;
            index=index+1;

        }
        System.out.println(ergebnis);
        return ergebnis;
    }
}
