package timetable;
import java.io.*;
import java.util.Scanner;
import javax.swing.JTextField;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class Timetable_main_writeRAF{
    
    public static void writeRAF(Homework_database data) throws IOException
    {
       
   String fileName = "/Users/Abhi/Desktop/Database"; 

   String subject = (data.getSubject()).toLowerCase();
   String desc = (data.getDeschome()).toLowerCase();
   String difficulty = (data.getDifficulty()).toLowerCase();
   int time = data.getTimetaken();
   
char[] subjectarray = new char[20]; //creates a new char array that has the indexies of the length of the word
char[] descarray = new char[500];
char[] difficultyarray = new char[6];
char[] timearray = new char[3];

// all the subject stuff
for(int a = 0; a < subjectarray.length; a++){
subjectarray[a] = ' ';
}
for(int i = 0; i < subject.length(); i++){
if(i >= 19) 
{
    break;
}
subjectarray[i] = subject.charAt(i);
} 

for(int e=0; e>=19; e++)
{
    System.out.print(subjectarray[e]);
}

// all the desc stuff
for(int a = 0; a < descarray.length; a++){
descarray[a] = ' ';
}
for(int i = 0; i < desc.length(); i++){
if(i >= 499) 
{
    break;
}
descarray[i] = desc.charAt(i);
} 

for(int e=0; e>=499; e++)
{
    System.out.print(descarray[e]);
}


// all the difficulty stuff


for(int a = 0; a < difficultyarray.length; a++){
difficultyarray[a] = ' ';
}
for(int i = 0; i < difficulty.length(); i++){
if(i >= 6) 
{
    break;
}
difficultyarray[i] = difficulty.charAt(i);
} 

for(int e=0; e>=499; e++)
{
    System.out.print(difficultyarray[e]);
}


        ObjectOutputStream outputStream = null;
        try{
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName, true));
            
        }catch(IOException e){
            System.out.println("Could not open the file." + e);
            System.exit(0);
        }
        try{ 
            outputStream.writeObject(subjectarray);
            outputStream.writeObject(descarray);
            outputStream.writeObject(difficultyarray);
            outputStream.write(time);
            outputStream.close();
 
        }catch(IOException e){
            System.out.println("Writing error: " + e);
            System.exit(0);
        }


            
    }
    
 }
    

