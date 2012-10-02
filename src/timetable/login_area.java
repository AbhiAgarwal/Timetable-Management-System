/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login_area.java
 *
 * Created on Nov 10, 2011, 8:23:34 PM
 */
package timetable;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.InetAddress;
import java.util.Date;
import javax.swing.text.DefaultEditorKit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;


public class login_area extends javax.swing.JFrame {

    
    public static int open1 = 0;
    public static int open2 = 0;
    JButton button;
    public static Homework_datetimecheck setURL = new Homework_datetimecheck();
    public static Color FINAL_BG_COLOR = new Color(255, 102, 0);

    
    
    

    private String getIP() {
        String IP = null;
        try {
            InetAddress thisIp =InetAddress.getLocalHost();
            IP = thisIp.getHostAddress();
        } catch (UnknownHostException ex) {
            Logger.getLogger(login_area.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return IP;
    }
    
    private String getFirstName() {
       String name1 = Login_form.getNameEntered();
       System.out.print(name1);
       
        return name1;
    }

    
    private static class tables extends JPanel {
        private static final long serialVersionUID = 1L;
         

        private boolean DEBUG = false;

        public tables() {
            
            super(new GridLayout(1,0));

        String[] columnNames = {"ID",
	                                "Subject",
	                                "Description",
	                                "Difficulty",
	                                "Time",
                                        "Deleted?"};
	int[] ID = new int[100];
        String[] subject1 = new String[100];
        String[] desc1 = new String[100];
        String[] diff1 = new String[100];
        int[] time1 = new int[100];
        int[] delete1 = new int[100];
        
        Timetable_main_RWRAF.read(0);
        
        for(int i=0;i<((Timetable_main_RWRAF.getLength()));i++)
        {
           Timetable_main_RWRAF.read(i);
           ID[i]= Timetable_main_RWRAF.getID();
           subject1[i] = Timetable_main_RWRAF.getSubject();
           desc1[i] = Timetable_main_RWRAF.getDesc();
           diff1[i] = Timetable_main_RWRAF.getDiff();
           time1[i] = Timetable_main_RWRAF.getTime();
           delete1[i] = Timetable_main_RWRAF.checkDelete();
        }
        
                
                Object[][] data = new Object[Timetable_main_RWRAF.getLength()][6];
                
                
                
              for(int i =0; i<Timetable_main_RWRAF.getLength(); i++)
               {
                        data[i][0] = ID[i];
                   
                }
              
              for(int i =0; i<Timetable_main_RWRAF.getLength(); i++)
               {
                        data[i][1] = subject1[i];
                   
                }
              
              for(int i =0; i<Timetable_main_RWRAF.getLength(); i++)
               {
                        data[i][2] = desc1[i];
                   
                }
              
              for(int i =0; i<Timetable_main_RWRAF.getLength(); i++)
               {
                        data[i][3] = diff1[i];
                   
                }
              
               for(int i =0; i<Timetable_main_RWRAF.getLength(); i++)
               {
                        data[i][4] = time1[i];
                   
                }
               
                for(int i =0; i<Timetable_main_RWRAF.getLength(); i++)
               {
                   
                   if(delete1[i] == 0)
                   {
                        data[i][5] = "No";
                       
                   }
                   else if(delete1[i] == 1)
                   {
                        data[i][5] = "Yes";
                       
                   }
                   else if(delete1[i] == 255)
                   {
                        data[i][5] = "Edited";
                       
                   }
                   else
                   {
                        data[i][5] = "Yes";
                       
                   }
                   
                }
                
	/* for(int i =0; i<Timetable_main_RWRAF.getLength(); i++)
               {
                   
                   if(delete1[i] == 0)
                   {
                        data[i][5] = delete1[i];
                       
                   }
                }
                 * 
                 */
	 
	        final JTable table = new JTable(data, columnNames);
	        table.setPreferredScrollableViewportSize(new Dimension(700, 100));
	        table.setFillsViewportHeight(true);
                
	 
	        if (DEBUG) {
	            table.addMouseListener(new MouseAdapter() {
	                public void mouseClicked(MouseEvent e) {
	                    printDebugData(table);
	                }
	            });
	        }
	 
	        //Create the scroll pane and add the table to it.
	        JScrollPane scrollPane = new JScrollPane(table);
	 
	        //Add the scroll pane to this panel.
	        add(scrollPane);
            
            
        }
        
            private void printDebugData(JTable table) {
	        int numRows = table.getRowCount();
	        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();
        
        table.setEnabled(false);
       
        
	 
        System.out.println("Value of data: ");
	        for (int i=0; i < numRows; i++) {
	            System.out.print("    row " + i + ":");
	            for (int j=0; j < numCols; j++) {
	                System.out.print("  " + model.getValueAt(i, j));
	            }
	            System.out.println();
        }
	        System.out.println("--------------------------");
	    }
            

   public boolean isCellEditable(int row, int col) {  
   return false;  
 }  
            
	 
	    /**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event-dispatching thread.
	     */
            
	    private static void createAndShowGUI() {
	        //Create and set up the window.

                
                JFrame frame = new JFrame("View Homework: Table Form");
	        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocation(new java.awt.Point(343, 50));
                frame.setBackground(new java.awt.Color(255, 102, 0));
                frame.setSize(500,150);
                


	        //Create and set up the content pane.
	        tables newContentPane = new tables();
        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
                
	    }
	
    public static void getIP()
    {
        
    }
    }
    
    
    public login_area() {
        initComponents();
     
        jButton1.setBackground(Color.green);
        jButton2.setBackground(Color.RED);
        Color coolOrange = new Color(255, 102, 0);
         jButton3.setBackground(coolOrange);
          jButton4.setBackground(Color.GRAY);
        this.setBackground(login_area.FINAL_BG_COLOR);
            
        Date newDate = new java.util.Date();
        
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy-MM-dd");
            
        
        jLabel14.setText("Date: " + ft.format(newDate));
        
        if(Member_loggedin.getLogginusername2() == null)
        {
        jLabel11.setText("Welcome Client" + "!");
        }
        else {
        jLabel11.setText("Welcome " + Member_loggedin.getLogginusername2() + "!");
        }
       
    }
    
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        org.jdesktop.layout.GroupLayout jDialog1Layout = new org.jdesktop.layout.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("- EDIT HOMEWORK");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel2.setText("- VIEW HOMEWORK TABLE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel3.setText("- ADD HOMEWORK");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setText("- DELETE/UNDELETE HOMEWORK");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setText("- VIEW TIMETABLE");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel11.setText("CLIENT: MR. KOTHARI");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel13.setText("CLIENT EMAIL: ANKO12@PATANA.AC.TH");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel14.setText("DATE: 10TH NOVEMBER 2011");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel15.setText("- VIEW HOMEWORK");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel18.setText("- SEARCH HOMEWORK");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setText("- SIMULATE TIMETABLE");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 20));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 20, 10));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 10));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 20, 10));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 20, 10));

        jMenu3.setText("File");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Administration");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Current Homework");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Choose file");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Logout");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Edit");

        jMenuItem1.setAction(new DefaultEditorKit.CutAction());
        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cut");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAction(new DefaultEditorKit.CopyAction());
        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Copy");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAction(new DefaultEditorKit.PasteAction());
        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Paste");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Print");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Homework");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Timetable");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Timetable_main_RWRAF.read(0);
    if(Timetable_main_RWRAF.getLength() < 11)
{
    if(open1!=1)
 {
    new   Homework_database_add().setVisible(true);
  open1 = 1;
 }
 else
 {
      JOptionPane.showMessageDialog(null,"You already have a window open, please close it to open another one", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }
}
else
{
          JOptionPane.showMessageDialog(null,"You've reached the maximum amounts of tasks you can add - 11", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);

}
}//GEN-LAST:event_jLabel3MouseClicked

private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
 if(open1!=1)
 {
    new Homework_database_edit_1().setVisible(true);
  open1 = 1;
 }
 else
 {
      JOptionPane.showMessageDialog(null,"You already have a window open, please close it to open another one", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }

 //   this.setVisible(false);// TODO add your handling code here:
}//GEN-LAST:event_jLabel1MouseClicked

private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
 if(open1!=1)
 {
    new Homework_database_remove1().setVisible(true);

  open1 = 1;
 }
 else
 {
      JOptionPane.showMessageDialog(null,"You already have a window open, please close it to open another one", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }
 //   this.setVisible(false);// TODO add your handling code here:
}//GEN-LAST:event_jLabel4MouseClicked

private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
// new Homework_database_viewsearch().setVisible(true);

     if(open1!=1)
 {
    new tables().createAndShowGUI();;

  open1 = 1;
 }
 else
 {
      JOptionPane.showMessageDialog(null,"You already have a window open, please close it to open another one", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }
     
     login_area.open1 = 0;
  //  this.setVisible(false);// TODO add your handling code here:
}//GEN-LAST:event_jLabel2MouseClicked

private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
if(open2==1)
{
     if(open1!=1)
 {
            
                new SimulatedTimeable().setVisible(true);
            

  open1 = 1;
 }
 else
 {
      JOptionPane.showMessageDialog(null,"You already have a window open, please close it to open another one", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }
}
else
{
          JOptionPane.showMessageDialog(null,"Please simulate the timetable first", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);

}

}//GEN-LAST:event_jLabel6MouseClicked

private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked


    if(open1!=1)
 {
   new Homework_database_view().setVisible(true);

  open1 = 1;
 }
 else
 {
      JOptionPane.showMessageDialog(null,"You already have a window open, please close it to open another one", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }
}//GEN-LAST:event_jLabel15MouseClicked

private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked


    if(open1!=1)
 {
   new Homework_database_search().setVisible(true);

  open1 = 1;
 }
 else
 {
      JOptionPane.showMessageDialog(null,"You already have a window open, please close it to open another one", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }
}//GEN-LAST:event_jLabel18MouseClicked

private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
//
}//GEN-LAST:event_jMenu1MouseClicked

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
new Homework_print().setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
// Modal dialog with OK button
   int response;

   response = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?");
    
  if(response == 0)
  {
      
      Date newDate = new java.util.Date();
             
      SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd");
      
      
      
      
      File formerdirectory = new File(Homework_datetimecheck.urlpart0);
      File targetdirectory = new File("/Database/Backup/");
            try {
                FileUtils.copyDirectory(formerdirectory, targetdirectory);
            } catch (IOException ex) {
                Logger.getLogger(login_area.class.getName()).log(Level.SEVERE, null, ex);
            }


      
      
   new Login_form().setVisible(true);
    this.setVisible(false);// TODO add your handling code here:
  }
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    if(open1!=1)
 {
   new administration().setVisible(true);

  open1 = 1;
 }
 else
 {
      JOptionPane.showMessageDialog(null,"You already have a window open, please close it to open another one", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem7ActionPerformed

private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    if(open1!=1)
 {
            try {
                new Stimulated_timetable_database_simulate().setVisible(true);
            } catch (InterruptedException ex) {
                Logger.getLogger(login_area.class.getName()).log(Level.SEVERE, null, ex);
            }

  open1 = 1;
  open2 = 1;
 }
 else
 {
      JOptionPane.showMessageDialog(null,"You already have a window open, please close it to open another one", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }// TODO add your handling code here:
}//GEN-LAST:event_jLabel7MouseClicked

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
if(open2==1)
{
    new print_timetable().setVisible(true);
}// TODO add your handling code here:// TODO add your handling code here:
else
{
 JOptionPane.showMessageDialog(null,"Please simulate the timetable first", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);

}
}//GEN-LAST:event_jMenuItem5ActionPerformed

    @SuppressWarnings("deprecation")
private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    if(open1!=1)
 {
   
new Homework_current().setVisible(true);
  open1 = 1;
 }
 else
 {
      JOptionPane.showMessageDialog(null,"You already have a window open, please close it to open another one", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(login_area.this);// TODO add your handling code here:
        String returnarea = jFileChooser1.getSelectedFile().getName();

String newurl = "";
newurl = setURL.getUrlpart0() + returnarea;
setURL.setUrl(newurl);

}//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    FINAL_BG_COLOR = Color.green;        // TODO add your handling code here:
    jPanel1.setBackground(FINAL_BG_COLOR);
    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
    FINAL_BG_COLOR = new Color(255, 102, 0);       // TODO add your handling code here:
    jPanel1.setBackground(FINAL_BG_COLOR);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
    FINAL_BG_COLOR = Color.GRAY;       // TODO add your handling code here:
    jPanel1.setBackground(FINAL_BG_COLOR);        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
   FINAL_BG_COLOR = Color.RED;       // TODO add your handling code here:
    jPanel1.setBackground(FINAL_BG_COLOR);        // TODO add your handling code here:        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(login_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new login_area().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
