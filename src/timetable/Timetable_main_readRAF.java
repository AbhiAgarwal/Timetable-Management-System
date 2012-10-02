package timetable;
import java.io.*;



public class Timetable_main_readRAF {
    
private static char[] subjectarray  = null;
private static char[] descarray  = null;
private static char[] difficultyarray  = null;
private static int time = 0;

    @SuppressWarnings("deprecation")
    public static void readRAF() throws IOException
    {
      String fileName = "/Users/Abhi/Desktop/Database";     
      
      
        ObjectInputStream inputStream = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream(fileName));
        }catch(IOException e){
            System.out.println("There was a problem opening the file: " + e);
            System.exit(0);
        }
        
            //Create new blank objects to store the data in.
try{      
    while(true)
            {
                setSubjectarray((char[]) inputStream.readObject());
                setDescarray((char[])inputStream.readObject());
                setDifficultyarray((char[])inputStream.readObject());
                setTime(inputStream.read());
                inputStream.close();
                }
            
            
        }catch(Exception f){
            System.out.println("There was an issue reading from the file: " + f);
            System.exit(0);
        }
        


        }
    /**
     * @return the time
     */
    public static int getTime() {
        return time;
    }

    /**
     * @param aTime the time to set
     */
    public static void setTime(int aTime) {
        time = aTime;
    }

    /**
     * @return the difficultyarray
     */
    public static char[] getDifficultyarray() {
        return difficultyarray;
    }

    /**
     * @param aDifficultyarray the difficultyarray to set
     */
    public static void setDifficultyarray(char[] aDifficultyarray) {
        difficultyarray = aDifficultyarray;
    }

    /**
     * @return the descarray
     */
    public static char[] getDescarray() {
        return descarray;
    }

    /**
     * @param aDescarray the descarray to set
     */
    public static void setDescarray(char[] aDescarray) {
        descarray = aDescarray;
    }

    /**
     * @return the subjectarray
     */
    public static char[] getSubjectarray() {
        return subjectarray;
    }

    /**
     * @param aSubjectarray the subjectarray to set
     */
    public static void setSubjectarray(char[] aSubjectarray) {
        subjectarray = aSubjectarray;
    }
   

    }
