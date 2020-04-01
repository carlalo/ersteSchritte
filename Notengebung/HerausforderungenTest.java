
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HerausforderungenTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HerausforderungenTest
{  
    private Herausforderungen herausforderung = new Herausforderungen();

    @Test
    public void umkehrenfunktioniert()
    {
        assertEquals("ih",herausforderung.umkehren("hi"));
    }

    @Test
    public void sortierenfunktioniert()
    {
        int alter[] = new int[4];

        alter[0] = 53;
        alter[1] = 46;
        alter[2] = 12;
        alter[3] = 16;

        int[] sortiert=herausforderung.sortieren(alter);
        assertArrayEquals(new int[] { 12, 16, 46, 53}, sortiert);
    }

    @Test
    public void anagrammefunktioniert(){
        assertTrue(herausforderung.anagramme("vater","verta"));
        assertFalse(herausforderung.anagramme("vater","mutter"));
    }
    
    

    @Test
    public void fibonacciFunktioniert()
    {
        Herausforderungen herausfo1 = new Herausforderungen();
    }
}

