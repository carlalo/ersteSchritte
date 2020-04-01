
/**
 * Beschreiben Sie hier die Klasse Fibonacci.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fibonacci
{
    public static void main(String[] args){
        System.out.println("\nSumme ist " + fibonacci(4000000));
    }

    public static long fibonacci(int wert){
        long zwischenergebnis=0;
        long[]fib=new long[3];
        fib[0]=1;
        fib[1]=1;
        fib[2]=fib[0]+fib[1];
        //for(int i=2;i<33;++i){
          while(fib[2]<=wert){
            fib[2]=fib[0]+fib[1];
            fib[0]=fib[1];
            fib[1]=fib[2];
            if(fib[2] % 2 == 0){
                System.out.println(fib[2]);
                zwischenergebnis=zwischenergebnis+fib[2];
            }
        }
        return zwischenergebnis;
       
    }
}