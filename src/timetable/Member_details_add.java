/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhi
 */
public class Member_details_add {
    
 private static int time;
 private static int raflength;
 private static int delete;
 
 public static int ID;
 public static String username;
 public static String password;
 public static String subject1;
 public static String subject2;
 public static String subject3;
 public static String subject4;
 public static String subject5;
 public static String subject6;
 public static String subject7;
 public static int delete1;
 
    
         private static Object[] userarray  = null;
         static String filename = Homework_datetimecheck.memberurl;
         static private Homework_database rs = null;
            
    public static Member_details readarray()
    {

        Member_details newuser1 = null;
    {
         try {
             
             RandomAccessFile raf = new RandomAccessFile(filename, "rw");
             
             
           
raflength = (int)((raf.length())/167);

for(int i=0; i<raflength; i++)
{
raf.seek(167*i);

  Member_details_add.ID = raf.read();
  Member_details_add.username = raf.readUTF();
  Member_details_add.password = raf.readUTF();
  Member_details_add.subject1 = raf.readUTF();
  Member_details_add.subject2 = raf.readUTF();
  Member_details_add.subject3 = raf.readUTF();
  Member_details_add.subject4 = raf.readUTF();
  Member_details_add.subject5 = raf.readUTF();
  Member_details_add.subject6 = raf.readUTF();
  Member_details_add.subject7 = raf.readUTF();
  Member_details_add.delete1 = raf.read();
  
  Member_details newmem  = new Member_details(ID, username, password, subject1, subject2, subject3, subject4, subject5, subject6, subject7, delete1);
  
                   Member_details_array.addMember(newmem, i);
  
}

} catch (EOFException ex) { //This exception will be caught when EOF is reached
           
} catch (FileNotFoundException e) {
        e.printStackTrace();
} catch (IOException e) {
        e.printStackTrace();
} 
         
  
}
     return newuser1;
        
        
    }
    
    public static void writearray(int ID, Member_details newuser) throws FileNotFoundException
    {

    try {

RandomAccessFile raf = new RandomAccessFile(filename, "rw");
    
    
// code for adding in spaces

String username1 = (newuser.getUsername());
String password1 = (newuser.getPassword());
String Subject1 = (newuser.getSubject1());
String Subject2 = (newuser.getSubject2());
String Subject3 = (newuser.getSubject3());
String Subject4 = (newuser.getSubject4());
String Subject5 = (newuser.getSubject5());
String Subject6 = (newuser.getSubject6());
String Subject7 = (newuser.getSubject7());
   
char[] usernamearray = new char[10]; //creates a new char array that has the indexies of the length of the word
char[] subject1array = new char[19];
char[] subject2array = new char[19];
char[] subject3array = new char[19];
char[] subject4array = new char[19];
char[] subject5array = new char[19];
char[] subject6array = new char[19];
char[] subject7array = new char[19];

//

for(int a = 0; a < usernamearray.length; a++){
usernamearray[a] = ' ';
}
for(int i = 0; i < username1.length(); i++){
if(i >= 10) 
{
    break;
}
usernamearray[i] = username1.charAt(i);
} 

for(int e=0; e>=10; e++)
{
    System.out.print(usernamearray[e]);
}



//

for(int a = 0; a < subject1array.length; a++){
subject1array[a] = ' ';
}
for(int i = 0; i < Subject1.length(); i++){
if(i >= 19) 
{
    break;
}
subject1array[i] = Subject1.charAt(i);
} 

for(int e=0; e>=19; e++)
{
    System.out.print(subject1array[e]);
}


// 

for(int a = 0; a < subject2array.length; a++){
subject2array[a] = ' ';
}
for(int i = 0; i < Subject2.length(); i++){
if(i >= 19) 
{
    break;
}
subject2array[i] = Subject2.charAt(i);
} 

for(int e=0; e>=19; e++)
{
    System.out.print(subject2array[e]);
}

//

for(int a = 0; a < subject3array.length; a++){
subject3array[a] = ' ';
}
for(int i = 0; i < Subject3.length(); i++){
if(i >= 19) 
{
    break;
}
subject3array[i] = Subject3.charAt(i);
} 

for(int e=0; e>=19; e++)
{
    System.out.print(subject3array[e]);
}

//

for(int a = 0; a < subject4array.length; a++){
subject4array[a] = ' ';
}
for(int i = 0; i < Subject4.length(); i++){
if(i >= 19) 
{
    break;
}
subject4array[i] = Subject4.charAt(i);
} 

for(int e=0; e>=19; e++)
{
    System.out.print(subject4array[e]);
}

//

for(int a = 0; a < subject5array.length; a++){
subject5array[a] = ' ';
}
for(int i = 0; i < Subject5.length(); i++){
if(i >= 19) 
{
    break;
}
subject5array[i] = Subject5.charAt(i);
} 

for(int e=0; e>=19; e++)
{
    System.out.print(subject5array[e]);
}

//

for(int a = 0; a < subject6array.length; a++){
subject6array[a] = ' ';
}
for(int i = 0; i < Subject6.length(); i++){
if(i >= 19) 
{
    break;
}
subject6array[i] = Subject6.charAt(i);
} 

for(int e=0; e>=19; e++)
{
    System.out.print(subject6array[e]);
}

//

for(int a = 0; a < subject7array.length; a++){
subject7array[a] = ' ';
}
for(int i = 0; i < Subject7.length(); i++){
if(i >= 19) 
{
    break;
}
subject7array[i] = Subject7.charAt(i);
} 

for(int e=0; e>=19; e++)
{
    System.out.print(subject7array[e]);
}


// start of writing code


 username = new String(usernamearray);
 subject1 = new String(subject1array);
 subject2 = new String(subject2array);
 subject3 = new String(subject3array);
 subject4 = new String(subject4array);
 subject5 = new String(subject5array);
 subject6 = new String(subject6array);
 subject7 = new String(subject7array);
 
 raflength =   (((int) raf.length())/167);
 
raf.skipBytes( (((int)raf.length()) ));
int length1 = (int)((((raf.length())/167))+ 1);
                raf.write(length1);
                raf.writeUTF(username);
                raf.writeUTF(password1);
                raf.writeUTF(subject1);
                raf.writeUTF(subject2);
                raf.writeUTF(subject3);
                raf.writeUTF(subject4);
                raf.writeUTF(subject5);
                raf.writeUTF(subject6);
                raf.writeUTF(subject7);
                raf.write(0);
    
} catch (FileNotFoundException e) {
        e.printStackTrace();
} catch (IOException e) {
        e.printStackTrace();
}
}
    
    
    public static void addtoarray(String Username, String Password, String Subject1, String Subject2, String Subject3, String Subject4, String Subject5, String Subject6, String Subject7, int delete1)
    {
       
        if(Username != null && Password != null && Subject1 != null && Subject2 != null && Subject3 != null && Subject5 != null && Subject6 != null && Subject7 != null)
        {
        int ID = Member_details_array.getMembers().length;
       
       
       
        Member_details newuser = new Member_details(ID, Username, Password, Subject1, Subject2, Subject3, Subject4, Subject5, Subject6, Subject7, delete1);
        try {
            writearray(ID, newuser);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Member_details_add.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
        else
        {
             JOptionPane.showMessageDialog(null,"Please enter all the information required", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);

        }
    }
    
        public static Object[] getUserArray() {
        return userarray;
    }
        
        public static int getLength()
        {
            return raflength;
        }

    public static void setUserArray(Object[] aUserArray) {
        userarray = aUserArray;
    }
    
    
}
