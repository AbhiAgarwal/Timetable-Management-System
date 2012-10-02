/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class readsettings {
    
   public static String strLine = null;
    
    public static void write(String time){
    
     if(time != null)
     {
        FileWriter fstream = null;
        try {
            fstream = new FileWriter("/Users/Abhi/Desktop/Database/settings" + Member_loggedin.getLogginusername().toLowerCase() + ".dat");
        } catch (IOException ex) {
            Logger.getLogger(readsettings.class.getName()).log(Level.SEVERE, null, ex);
        }
  BufferedWriter out = new BufferedWriter(fstream);
        try {
            out.write(time);
        } catch (IOException ex) {
            Logger.getLogger(readsettings.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //Close the output stream
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(readsettings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    else
    {
               JOptionPane.showMessageDialog(null,"Please re-enter the time", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);

    }}
    
    public static void write(String time, String user){
    
     if(time != null)
     {
        FileWriter fstream = null;
        try {
            fstream = new FileWriter("/Users/Abhi/Desktop/Database/settings" + user.toLowerCase() + ".dat");
        } catch (IOException ex) {
            Logger.getLogger(readsettings.class.getName()).log(Level.SEVERE, null, ex);
        }
  BufferedWriter out = new BufferedWriter(fstream);
        try {
            out.write(time);
        } catch (IOException ex) {
            Logger.getLogger(readsettings.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //Close the output stream
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(readsettings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    else
    {
               JOptionPane.showMessageDialog(null,"Please re-enter the time", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);

    }}
    
 public static String read()
  {
      
  try{
  // Open the file that is the first 
  // command line parameter
  FileInputStream fstream = new FileInputStream("/Users/Abhi/Desktop/Database/settings" + Member_loggedin.getLogginusername().toLowerCase() + ".dat");
  // Get the object of DataInputStream
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  
  //Read File Line By Line
  strLine = br.readLine();
  
  //Close the input stream
  in.close();
    }catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage());
  }
    return strLine;
}
}
