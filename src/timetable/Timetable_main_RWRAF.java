/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

/**
 *
 * @author Abhi
 */

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;


public class Timetable_main_RWRAF {
    
 
    
 private static int ID;
 private static String subject;
 private static String desc;
 private static String diff;
 private static int time;
 private static int raflength;
 private static int delete;
 private static int t = 1;
 
 public static void removespaces()
 {
     String s = Timetable_main_RWRAF.subject;
         s.trim();
             Timetable_main_RWRAF.subject = s;
        
     String d1 = Timetable_main_RWRAF.desc;
         d1.trim();
             Timetable_main_RWRAF.desc = d1;  
        
     String d2 = Timetable_main_RWRAF.diff;
         d2.trim();
             Timetable_main_RWRAF.diff = d2;   
 }
 
 
public static void write(Homework_database data) {
    
    try {

RandomAccessFile raf = new RandomAccessFile(login_area.setURL.getUrl(), "rw");
    // RandomAccessFile raf = new RandomAccessFile("/Users/Abhi/Desktop/Database" + Member_loggedin.getLogginusername().toLowerCase() + ".dat", "rw");
    
// code for adding in spaces

String subject = (data.getSubject());
String desc = (data.getDeschome());
String difficulty = (data.getDifficulty());
int time = data.getTimetaken();
   
char[] subjectarray = new char[20]; //creates a new char array that has the indexies of the length of the word
char[] descarray = new char[500];
char[] difficultyarray = new char[6];

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

// start of writing code

String subject1 = new String(subjectarray);
String desc1 = new String(descarray);
String diff1 = new String(difficultyarray);
int delete1 = 0;
raflength =   (((int) raf.length())/538);

int length1 = (int)((((raf.length())/538))+ 1);
// raf.skipBytes( (t*((int)raf.length()) ));
raf.seek((t*((int)raf.length()) ));
                raf.writeInt(length1);
                raf.writeUTF(subject1);
                raf.writeUTF(desc1);
                raf.writeUTF(diff1);
                raf.writeByte(time);
                raf.writeByte(delete1);
                
    
} catch (FileNotFoundException e) {
        e.printStackTrace();
} catch (IOException e) {
        e.printStackTrace();
}
}

// READDD

        public static Homework_database read(int value) {
             Homework_database homeworkreturn = null;
    {
         try {
             
           
RandomAccessFile raf = new RandomAccessFile(login_area.setURL.getUrl(), "rw");

raf.seek(raf.length());
raf.seek(538*value);

 Timetable_main_RWRAF.delete = raf.read();
 
raf.seek(raf.length());
raf.seek(538*value);

raflength =   (((int) raf.length())/538);

  Timetable_main_RWRAF.ID = raf.readInt();
  Timetable_main_RWRAF.subject = raf.readUTF();
  Timetable_main_RWRAF.desc = raf.readUTF();
  Timetable_main_RWRAF.diff = raf.readUTF();
  Timetable_main_RWRAF.time = raf.read();
  Timetable_main_RWRAF.delete = raf.read();
  
  removespaces();
  
  
  raflength =   (((int) raf.length())/538);
 
  
} catch (EOFException ex) { //This exception will be caught when EOF is reached
           //  JOptionPane.showMessageDialog(null,"No more homeworks left! :)", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
} catch (FileNotFoundException e) {
        e.printStackTrace();
} catch (IOException e) {
        e.printStackTrace();
} 
         
  
}
     return homeworkreturn;

}
        
        public static void edit(int ID ,String subject, String desc, String difficulty, int time, int delete1)
    {
        
        int raflength;
   
         try {

RandomAccessFile raf = new RandomAccessFile(login_area.setURL.getUrl(), "rw");
    
    
// code for adding in spaces
   
char[] subjectarray = new char[20]; //creates a new char array that has the indexies of the length of the word
char[] descarray = new char[500];
char[] difficultyarray = new char[6];

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

// start of writing code

String subject1 = new String(subjectarray);
String desc1 = new String(descarray);
String diff1 = new String(difficultyarray);


raflength =   (((int) raf.length())/538);

int length1 = (int)((((raf.length())/538))+ 1);

raf.skipBytes((Homework_database_edit_1.getn())*538);
// starts writing
                raf.writeInt(ID);
                raf.writeUTF(subject1);
                raf.writeUTF(desc1);
                raf.writeUTF(diff1);
                raf.writeByte(time);
                raf.writeByte(delete1);
                
                 JOptionPane.showMessageDialog(null,"Homework Edited!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
                 
                 
               
    
} catch (FileNotFoundException e) {
        e.printStackTrace();
} catch (IOException e) {
        e.printStackTrace();
}
         
    }
        
     public static int getID()
        {
            return ID;
        }  
     public static int checkDelete()
        {
            return delete;
        }    
     public static int getTime()
        {
            return time;
        }
     public static String getDesc()
        {
            return desc;
        }
     public static String getDiff()
        {
            return diff;
        }
     public static String getSubject()
        {
            return subject;
        }
     public static int getLength()
     {
         
            return raflength;
     }
}