import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Herausforderungen
{

    public Herausforderungen()
    {

    }

    public void zahlengeist()
    {for(int i=0;i!=100;i++){
            if(i/5*5!=i){
                System.out.println(i);
            }else{if(i/7*7!=i){
                    System.out.println("Hui");
                }else{System.out.println("Hui Buh");}
            }
        }

    }

    public String umkehren(String text) {
        int a =text.length()-1;
        String ausgabe="";
        while (a!=-1){
            ausgabe+=text.charAt(a);
            a=a-1; 
        }
        return ausgabe;
    }

    /*Mit Kommas bitte*/
    public int[] sortieren(int[]array ){

        int i=array.length;

        for(int e=0;e<i;++e){
            for(int g=0;g<i-1;++g){
                if(array[g]>array[g+1]){
                    int u=array[g];
                    array[g]=array[g+1];
                    array[g+1]=u;
                }
            }

        }

        return array;  
    }

    public boolean anagramme(String eins,String zwei){
        char[]a=eins.toCharArray();
        char[]b=zwei.toCharArray();
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        
        return String.valueOf(a).equals(String.valueOf(b));
    }
}
