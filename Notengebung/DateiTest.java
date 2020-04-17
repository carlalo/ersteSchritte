import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException; 
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.FileSystems;

/**
 * Überprüfe die Klasse "Datei"
 */
public class DateiTest
{

    private Datei datei;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        datei = new Datei();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        datei = null;
    }

    @Test
    public void schreibenFunktioniert()
    {
        assertNotNull(datei);
        try {
            datei.write(2);
        } catch (IOException ioex) {
            fail(ioex.getMessage());
        }    
        assertTrue("Datei 'text' nicht vorhanden", Files.exists(FileSystems.getDefault().getPath("text")));
    }

    @Test
    public void lesenFunktioniert(){
        int wert=0;
        assertNotNull(datei);
        try {
            datei.write(5);
            wert=datei.read();
        } catch (IOException ioex) {
            fail(ioex.getMessage());
        }

        assertEquals(5,wert);
    }

    @Test
    public void schreiben2Funktioniert()
    {
        String hi="hi";
        assertNotNull(datei);
        try {
            datei.writeLine(hi);
        } catch (IOException ioex) {
            fail(ioex.getMessage());
        }    
        assertTrue("Datei 'text' nicht vorhanden", Files.exists(FileSystems.getDefault().getPath("text")));
    }

    @Test
    public void lesen2Funktioniert(){
        String hi="hi";
        String wert="hi";
        assertNotNull(datei);
        try {
            datei.writeLine(hi);
            wert=String.valueOf(datei.readLine());
        } catch (IOException ioex) {
            fail(ioex.getMessage());
        }

        assertEquals(hi,wert);
    }
}
