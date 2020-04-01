
import java.io.*;
import java.util.*;
class Datei
{ 
    private static String DATEINAME = "text2";
    private static String SELF_CONTROL_FILE = "self-control.txt";
    private static String DATEI="anzahl.txt";
    public void write(int wert) throws IOException
    {
        try(FileWriter writer=new FileWriter(DATEINAME)){
            writer.write(wert);
        }
        System.out.println("Erfolgreich gespeichert.");
    } 
    public void writeFile(int wert) throws IOException
    {
        try(FileWriter writer=new FileWriter(DATEI)){
            writer.write(wert);
        }
        System.out.println("Erfolgreich gespeichert.");
    } 

    public int read()throws IOException 
    {  
        int text;
        try(FileReader reader =new FileReader(DATEINAME)){
            text=reader.read();
        }
        return text;
    }
    public int readFile()throws IOException 
    {  
        int text;
        try(FileReader reader =new FileReader(DATEI)){
            text=reader.read();
        }
        return text;
    }
    public void writeLine(String wert) throws IOException
    {   
        try(FileWriter writer=new FileWriter(SELF_CONTROL_FILE,true)){
            writer.write(wert);
        }

    }

    public String readLine() throws IOException 
    {
        String wert = "";

        try(BufferedReader reader = new BufferedReader(new FileReader(SELF_CONTROL_FILE))) {
            wert = reader.readLine();
        }    
        
        return wert;
    }
    
   
}
