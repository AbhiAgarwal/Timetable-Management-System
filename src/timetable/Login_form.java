/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login_form.java
 *
 * Created on Nov 10, 2011, 2:33:38 PM
 */
package timetable;

/**
 *
 * @author Abhi
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login_form extends javax.swing.JFrame {
static String filename = Homework_datetimecheck.memberurl;
static int numberofpins = 0;
static String enteredname = "";
    /**
     * @return the String1
     */
    public static String getString1() {
        return String1;
    }

    /**
     * @param aString1 the String1 to set
     */
    public static void setString1(String aString1) {
        String1 = aString1;
    }

    /**
     * @return the String2
     */
    public static String getString2() {
        return String2;
    }
    
        public static String getNameEntered() {
        return enteredname;
    }

    /**
     * @param aString2 the String2 to set
     */
    public static void setString2(String aString2) {
        String2 = aString2;
    }

    /**
     * @return the String3
     */
    public static String getString3() {
        return String3;
    }

    /**
     * @param aString3 the String3 to set
     */
    public static void setString3(String aString3) {
        String3 = aString3;
    }

    /**
     * @return the String4
     */
    public static String getString4() {
        return String4;
    }

    /**
     * @param aString4 the String4 to set
     */
    public static void setString4(String aString4) {
        String4 = aString4;
    }

    /**
     * @return the String5
     */
    public static String getString5() {
        return String5;
    }

    /**
     * @param aString5 the String5 to set
     */
    public static void setString5(String aString5) {
        String5 = aString5;
    }

    /**
     * @return the String6
     */
    public static String getString6() {
        return String6;
    }

    /**
     * @param aString6 the String6 to set
     */
    public static void setString6(String aString6) {
        String6 = aString6;
    }

    /**
     * @return the String7
     */
    public static String getString7() {
        return String7;
    }

    /**
     * @param aString7 the String7 to set
     */
    public static void setString7(String aString7) {
        String7 = aString7;
    }

    /**
     * @return the String8
     */
    public static String getString8() {
        return String8;
    }

    /**
     * @param aString8 the String8 to set
     */
    public static void setString8(String aString8) {
        String8 = aString8;
    }

    /**
     * @return the String9
     */
    public static String getString9() {
        return String9;
    }

    /**
     * @param aString9 the String9 to set
     */
    public static void setString9(String aString9) {
        String9 = aString9;
    }
    private int raflength;
    
    private static String String1 = "";
    private static String String2 = "";
    private static String String3 = "";
    private static String String4 = "";
    private static String String5 = "";
    private static String String6 = "";
    private static String String7 = "";
    private static String String8 = "";
    private static String String9 = "";
    
   
    
    public static void loginll()
    {
        
List_load load = new List_load();
load.List_load();

    }

    /** Creates new form Login_form */
    public Login_form() {
        initComponents();
        rootPane.setDefaultButton(jButton1);
        
        checkfile();
        
            
    }


    
    public static void checkfile()
            {
        File file = new File(Homework_datetimecheck.memberurl);
        boolean fexists = file.exists();

                     
                      if (!fexists) {
                          new add_new_user().setVisible(true);
                         
    }
                      
            }
    
    
        public void checkspaceleft()
        {
            
            File file2 = new File("/Users/");
            
            if(file2.getUsableSpace()<1000)
            {
               JOptionPane.showMessageDialog(null,"Please increase the amount of memory in your hard disk in order for this program to function.", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
            }
        
        }
        
        

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        UsernameF1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        button10 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Timetable Management System - Login Form");
        setBackground(new java.awt.Color(102, 102, 102));
        setLocation(new java.awt.Point(50, 50));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Username (CaSe SeNsItIvE):");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel2.setText("0");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetable/header.png"))); // NOI18N
        jLabel3.setMinimumSize(new java.awt.Dimension(490, 235));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 50));

        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 70, -1));

        button1.setLabel("3");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 40, -1));

        button2.setLabel("9");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 40, -1));

        button3.setLabel("2");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 40, -1));

        button4.setLabel("0");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel1.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 40, -1));

        button5.setLabel("4");
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
        });
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel1.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 40, -1));

        button6.setLabel("5");
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
        });
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel1.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 40, -1));

        button7.setLabel("6");
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button7MouseClicked(evt);
            }
        });
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel1.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 40, -1));

        button8.setLabel("7");
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button8MouseClicked(evt);
            }
        });
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel1.add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 40, -1));

        button9.setLabel("8");
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button9MouseClicked(evt);
            }
        });
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        jPanel1.add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 40, -1));
        jPanel1.add(UsernameF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, 30));

        jLabel4.setText("Pin:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jButton2.setText("Reset");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 70, -1));

        button10.setLabel("1");
        button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button10MouseClicked(evt);
            }
        });
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        jPanel1.add(button10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 40, -1));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 501, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
File file = new File(Homework_datetimecheck.memberurl);
        boolean fexists = file.exists();
        int number;
        boolean existornot = false;
                     checkspaceleft();
                      if (!fexists) {
                          new add_new_user().setVisible(true);
                          
                      }
                        else{
              try {
            String username1 = UsernameF1.getText();
           
            
                
            char[] usernamearray = new char[10];
                

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

            String username = new String(usernamearray);


                Member_details_add.readarray();    
                
                
                
                
                RandomAccessFile raf = new RandomAccessFile(filename, "rw");
                
                /* try {
                    System.out.print(raf.length());
                } catch (IOException ex) {
                    Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
                }
                 * 
                 */
                
                try {
                        raflength = (int)((raf.length())/166);
                    } catch (IOException ex) {
                        Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
                    }
             
             for(int i=0; i<raflength; i++)       
             {
                     
                Member_details default1 = Member_details_array.getMembers()[i];
                
                String pass = getString1()+getString2()+getString3()+getString4();

                 if(default1.getUsername().equalsIgnoreCase(username) && default1.getPassword().equals(pass))
                 {
                     Member_loggedin.setLogginusername(UsernameF1.getText());
                     Member_loggedin.setNumber(i);
                     existornot = true;
                     numberofpins = 0;
                     loginll();
                     new login_area().setVisible(true);
                     this.setVisible(false); 
                     
                     break;
                 }
                 
                else
                {
                       
     
                }
             }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              if(existornot == false)
              {
                                   JOptionPane.showMessageDialog(null,"Username or Password not found!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
                                   numberofpins = 0;
UsernameF1.setText("");
jLabel2.setText(Integer.toString(numberofpins));
              }
              
}
                       

}//GEN-LAST:event_jButton1ActionPerformed

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

}//GEN-LAST:event_jButton1MouseClicked

private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_button1ActionPerformed

private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_button2ActionPerformed

private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_button3ActionPerformed

private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_button4ActionPerformed

private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_button5ActionPerformed

private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_button6ActionPerformed

private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_button7ActionPerformed

private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_button8ActionPerformed

private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_button9ActionPerformed

private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
if(numberofpins < 4)
{
    if(numberofpins == 0)
    {
        Login_form.setString1("0");
    }
    if(numberofpins == 1)
    {
        Login_form.setString2("0");
    }
    if(numberofpins == 2)
    {
        Login_form.setString3("0");
    }
    if(numberofpins == 3)
    {
        Login_form.setString4("0");
    }
    numberofpins +=1;
    jLabel2.setText(Integer.toString(numberofpins));
}
else
{
    System.out.print(Timetable_main_RWRAF.checkDelete());           
                 JOptionPane.showMessageDialog(null,"You've already entered your 4 digit pin!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
      
}
        
        // TODO add your handling code here:
}//GEN-LAST:event_button4MouseClicked

private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
if(numberofpins < 4)
{
    if(numberofpins == 0)
    {
        Login_form.setString1("2");
    }
    if(numberofpins == 1)
    {
        Login_form.setString2("2");
    }
    if(numberofpins == 2)
    {
        Login_form.setString3("2");
    }
    if(numberofpins == 3)
    {
        Login_form.setString4("2");
    }
    numberofpins +=1;
    jLabel2.setText(Integer.toString(numberofpins));
}
    else
{
    System.out.print(Timetable_main_RWRAF.checkDelete());           
                 JOptionPane.showMessageDialog(null,"You've already entered your 4 digit pin!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
      
}// TODO add your handling code here:
}//GEN-LAST:event_button3MouseClicked

private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
if(numberofpins < 4)
{
    if(numberofpins == 0)
    {
        Login_form.setString1("3");
    }
    if(numberofpins == 1)
    {
        Login_form.setString2("3");
    }
    if(numberofpins == 2)
    {
        Login_form.setString3("3");
    }
    if(numberofpins == 3)
    {
        Login_form.setString4("3");
    }
    numberofpins +=1;
    jLabel2.setText(Integer.toString(numberofpins));
}
    else
{
    System.out.print(Timetable_main_RWRAF.checkDelete());           
                 JOptionPane.showMessageDialog(null,"You've already entered your 4 digit pin!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
}
}//GEN-LAST:event_button1MouseClicked

private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
if(numberofpins < 4)
{
    if(numberofpins == 0)
    {
        Login_form.setString1("4");
    }
    if(numberofpins == 1)
    {
        Login_form.setString2("4");
    }
    if(numberofpins == 2)
    {
        Login_form.setString3("4");
    }
    if(numberofpins == 3)
    {
        Login_form.setString4("4");
    }
    numberofpins +=1;
    jLabel2.setText(Integer.toString(numberofpins));
}
    else
{
    System.out.print(Timetable_main_RWRAF.checkDelete());           
                 JOptionPane.showMessageDialog(null,"You've already entered your 4 digit pin!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
}
}//GEN-LAST:event_button5MouseClicked

private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
if(numberofpins < 4)
{
    if(numberofpins == 0)
    {
        Login_form.setString1("5");
    }
    if(numberofpins == 1)
    {
        Login_form.setString2("5");
    }
    if(numberofpins == 2)
    {
        Login_form.setString3("5");
    }
    if(numberofpins == 3)
    {
        Login_form.setString4("5");
    }
    numberofpins +=1;
    jLabel2.setText(Integer.toString(numberofpins));
}
    else
{
    System.out.print(Timetable_main_RWRAF.checkDelete());           
                 JOptionPane.showMessageDialog(null,"You've already entered your 4 digit pin!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
}// TODO add your handling code here:
}//GEN-LAST:event_button6MouseClicked

private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
if(numberofpins < 4)
{
    if(numberofpins == 0)
    {
        Login_form.setString1("6");
    }
    if(numberofpins == 1)
    {
        Login_form.setString2("6");
    }
    if(numberofpins == 2)
    {
        Login_form.setString3("6");
    }
    if(numberofpins == 3)
    {
        Login_form.setString4("6");
    }
    
    numberofpins +=1;
    jLabel2.setText(Integer.toString(numberofpins));
}
    else
{
    System.out.print(Timetable_main_RWRAF.checkDelete());           
                 JOptionPane.showMessageDialog(null,"You've already entered your 4 digit pin!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
}// TODO add your handling code here:
}//GEN-LAST:event_button7MouseClicked

private void button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseClicked
if(numberofpins < 4)
{
    if(numberofpins == 0)
    {
        Login_form.setString1("7");
    }
    if(numberofpins == 1)
    {
        Login_form.setString2("7");
    }
    if(numberofpins == 2)
    {
        Login_form.setString3("7");
    }
    if(numberofpins == 3)
    {
        Login_form.setString4("7");
    }
    
    numberofpins +=1;
    jLabel2.setText(Integer.toString(numberofpins));
}
    else
{
    System.out.print(Timetable_main_RWRAF.checkDelete());           
                 JOptionPane.showMessageDialog(null,"You've already entered your 4 digit pin!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
}// TODO add your handling code here:
}//GEN-LAST:event_button8MouseClicked

private void button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseClicked
if(numberofpins < 4)
{
    if(numberofpins == 0)
    {
        Login_form.setString1("8");
    }
    if(numberofpins == 1)
    {
        Login_form.setString2("8");
    }
    if(numberofpins == 2)
    {
        Login_form.setString3("8");
    }
    if(numberofpins == 3)
    {
        Login_form.setString4("8");
    }
    
    numberofpins +=1;
    jLabel2.setText(Integer.toString(numberofpins));
}
    else
{
    System.out.print(Timetable_main_RWRAF.checkDelete());           
                 JOptionPane.showMessageDialog(null,"You've already entered your 4 digit pin!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
}// TODO add your handling code here:
}//GEN-LAST:event_button9MouseClicked

private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
if(numberofpins < 4)
{
    if(numberofpins == 0)
    {
        Login_form.setString1("9");
    }
    if(numberofpins == 1)
    {
        Login_form.setString2("9");
    }
    if(numberofpins == 2)
    {
        Login_form.setString3("9");
    }
    if(numberofpins == 3)
    {
        Login_form.setString4("9");
    }
    numberofpins +=1;
    
    jLabel2.setText(Integer.toString(numberofpins));
    
}
    else
{
    System.out.print(Timetable_main_RWRAF.checkDelete());           
                 JOptionPane.showMessageDialog(null,"You've already entered your 4 digit pin!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
}// TODO add your handling code here:
}//GEN-LAST:event_button2MouseClicked

private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
numberofpins = 0;
jLabel2.setText(Integer.toString(numberofpins));

setString1("");
setString2("");
setString3("");
setString4("");


}//GEN-LAST:event_jButton2MouseClicked

private void button10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MouseClicked
if(numberofpins < 4)
{
    if(numberofpins == 0)
    {
        Login_form.setString1("1");
    }
    if(numberofpins == 1)
    {
        Login_form.setString2("1");
    }
    if(numberofpins == 2)
    {
        Login_form.setString3("1");
    }
    if(numberofpins == 3)
    {
        Login_form.setString4("1");
    }
    numberofpins +=1;
    
    jLabel2.setText(Integer.toString(numberofpins));
    
}
    else
{
    System.out.print(Timetable_main_RWRAF.checkDelete());           
                 JOptionPane.showMessageDialog(null,"You've already entered your 4 digit pin!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
}// TODO add your handling code here:// TODO add your handling code here:
}//GEN-LAST:event_button10MouseClicked

private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_button10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UsernameF1;
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
