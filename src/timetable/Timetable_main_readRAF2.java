package timetable;
import java.io.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhi
 */
public class Timetable_main_readRAF2 {
    @SuppressWarnings("deprecation")
    public static void readRAF(Homework_database data) throws IOException
    {
      String fileName = "/Users/Abhi/Desktop/Database";     


 /*   try
    {
      DataInputStream instr =  
        new DataInputStream(  		
          new BufferedInputStream( 
            new FileInputStream( fileName ) ) ); 
      try
      {
        while ( true ) {
             System.out.print(instr.readChar());
             
                }
        				
      }

      catch ( EOFException  eof ) 
      {
       // System.out.println( "The sum is: " + sum ); 
        instr.close(); 
      }

      catch ( IOException iox ) 
      {
        System.out.println( "Problems reading " + fileName ); 
        instr.close(); // 
      }
    }

    catch ( IOException iox )
    {
      System.out.println("IO Problems with " + fileName );
    }
  
  */
      
        ObjectInputStream inputStream = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream(fileName));
        }catch(IOException e){
            System.out.println("There was a problem opening the file: " + e);
            System.exit(0);
        }

            
            //Create new blank objects to store the data in.

char[] subjectarray  = null;
char[] descarray  = null;
char[] difficultyarray  = null;
int time = 0;

try{
            subjectarray = (char[])inputStream.readObject();
            descarray = (char[])inputStream.readObject();
            difficultyarray = (char[])inputStream.readObject();
            time = inputStream.read();
            inputStream.close();
            
        }catch(Exception f){
            System.out.println("There was an issue reading from the file: " + f);
            System.exit(0);
        }
        
        for(int a = 0; a < subjectarray.length; a++){
    System.out.print(subjectarray[a]);
}
        System.out.println();
        
        for(int a = 0; a < descarray.length; a++){
    System.out.print(descarray[a]);
}
        System.out.println();
          for(int a = 0; a < difficultyarray.length; a++){
    System.out.print(difficultyarray[a]);
}
          System.out.println();
    System.out.print(time);          
          System.out.println();           
        



        }

    }
