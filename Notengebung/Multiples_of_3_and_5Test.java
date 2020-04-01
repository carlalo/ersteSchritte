

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Multiples_of_3_and_5Test
{
    Multiples_of_3_and_5 multiple=new Multiples_of_3_and_5();
    public Multiples_of_3_and_5Test()
    {
    }

    
    @Before
    public void setUp()
    {
    }

  
    @After
    public void tearDown()
    {
    }
    @Test
    public void unterZehn(){
    long wert=multiple.multiples(10);
    assertEquals(23,wert);
    }
}
