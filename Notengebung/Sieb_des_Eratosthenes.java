
public class Sieb_des_Eratosthenes
{

    public static void main(String[] args)
    {
        zahlenBestimmen(1000);
    }

    public static void zahlenBestimmen(int wert)
    { boolean[] zahlen=new boolean[wert+2];
        for(int i=0;i<=wert;++i)
        {
            zahlen[i]=true;
        }  
        zahlen[0]=false;  
        zahlen[1]=false;
        int count=2;
        int zähler=0;
        while(count<=wert)
        {   zähler=count+count;
            if(zahlen[count]==true)
            {for(int i=zähler;i<wert;++i)
                {zahlen[zähler-1]=false;
                 zähler=zähler+count;

                }
            }
            zähler=0;
            count=count+1;
        }
    }
}