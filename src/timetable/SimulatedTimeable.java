/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SimulatedTimeable.java
 *
 * Created on Feb 16, 2012, 10:37:38 PM
 */
package timetable;



public final class SimulatedTimeable extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    private static int a = 0;
   private List_Homework_database list = new List_Homework_database();
        private int n = 0;
  private int n1 = 0;
  private int n2 = 0;
  private int n3 = 0; 
    private int n4 = 0;  
   private String currenttime = "";
   private Homework_database[] sorted;
   
   
    public SimulatedTimeable() {
        
        
        
        initComponents();
        jPanel1.setBackground(login_area.FINAL_BG_COLOR);
        
Timetable_main_RWRAF.read(0);

   
   Homework_database[] array1 = new Homework_database[Timetable_main_RWRAF.getLength()+1];
   Homework_database[] array2 = new Homework_database[Timetable_main_RWRAF.getLength()+1];
       
for(int i=0; i<=Timetable_main_RWRAF.getLength(); i++)
{
        Timetable_main_RWRAF.read(i);

        int ID = Timetable_main_RWRAF.getID();
            
        String Subject = Timetable_main_RWRAF.getSubject();
           
        String desc = (Timetable_main_RWRAF.getDesc());
           
        String diff = (Timetable_main_RWRAF.getDiff());

        int time = (Timetable_main_RWRAF.getTime());

        int delete = Timetable_main_RWRAF.checkDelete();

        Homework_database details = new Homework_database(ID ,Subject, desc, diff, time, delete);

        
        
array1[i] = details; 
list.add(details);

        }

for(a=0; a<array1.length; a++)
{
   array2[a] = list.get(a+1);
}

        jTable1.getModel().setValueAt("05:00 - 05:30", n, 0);
        jTable1.getModel().setValueAt("Wake up", n, 1);
        n++;
        
        jTable1.getModel().setValueAt("05:30 - 06:00", n, 0);
        jTable1.getModel().setValueAt("Breakfast", n, 1);
        n++;

        sorted = sort(array2, 0, array2.length-1);
        generate();
        
        jTable1.getModel().setValueAt(currenttime + " - 05:00", n, 0);
        jTable1.getModel().setValueAt("Personal Activities and Sleep", n, 1);
    }

    public void generate()
    {
        
        // variables
        Timetable_main_RWRAF.read(0);
        String[] times={
            "00:00","00:15","00:30", "00:45",
            "01:00","01:15","01:30","01:45",
            "02:00","02:15","02:30","02:45",
            "03:00","03:15","03:30","03:45",
            "04:00","04:15","04:30","04:45",
            "05:00", "05:15","05:30","05:45",
            "06:00","06:15","06:30","06:45",
            "07:00","07:15","07:30","07:45",
            "8:00","8:15","8:30","8:45",
            "9:00", "9:15", "9:30", "9:45", 
            "10:00", "10:15", "10:30", "10:45", 
            "11:00", "11:15", "11:30", "11:45", 
            "12:00", "12:15", "12:30","12:45",
            "13:00","13:15","13:30","13:45", 
            "14:00", "14:15", "14:30", "14:45", 
            "15:00", "15:15", "15:30", "15:45", 
            "16:00", "16:15", "16:30", "16:45",
            "17:00", "17:15", "17:30", "17:45", 
            "18:00","18:15","18:30","18:45", 
            "19:00", "19:15","19:30","19:45", 
            "20:00","20:15", "20:30", "20:45",
            "21:00","21:15", "21:30", "21:45", 
            "22:00", "22:15", "22:30", "22:45",
            "23:00", "23:15", "23:15", "23:45",
            "24:00", "24:15", "24:30", "24:45",
            "25:00", "25:15", "25:30", "25:45",
            "26:00", "26:15", "26:30"};
        
        
        int place = 0;
        int timeofsort = 0;
        String nwwe = "";
        String timex = readsettings.read();
        char [] index = timex.toCharArray();
        int place2= 0; 
        int sort1 = 0;
        int operation =0;
        
        // loading
        List_load tablelist = new List_load();
        tablelist.List_load();
        List_Homework_database list1 = tablelist.getList();
        
        // used to find the current time in the time array
        
   for(int f=0; f<times.length; f++)
    {
        if(times[f].equals(timex))
    {
            place = f;
            break;
        }
        }
        
        setCurrenttime(times[place]);
        
        // set n as 0
        // To go through the different places in the subjects
        for(int e=0; e<=Timetable_main_RWRAF.getLength(); e++)
{

    
        Timetable_main_RWRAF.read(e);
        // to set the subjects in their places
        
            if (getSorted()[e].getDelete() == 0)
 {
     
     int index1 = Character.getNumericValue(index[0]);
     // sets the integer index 1 to the first digit of the time
     
     timeofsort = getSorted()[e].getTimetaken();
     
    String[] parsethis2 = getCurrenttime().split(":");
      int timenumber = Integer.parseInt(parsethis2[1]) + timeofsort;
      
    if(timeofsort<60)
    {
        
     timenumber = Integer.parseInt(parsethis2[1]) + timeofsort;
        
    nwwe = parsethis2[0] + ":" + (timenumber); // sets the String nwwe to the first of first digit of time, and sorted time taken
     // either 15, 30, or 45, with 60 there is another condition    
    }
    
    if(timenumber==60)
    {
        
        int timenumber2 = Integer.parseInt(parsethis2[0]) + 1;
        nwwe = (timenumber2) + ":" + "00"; 
    }
    
    if(timenumber>60 && timenumber<120)
    {
        int time3 = timenumber-60;
        int[] timearray = new int[2];
        if(String.valueOf(time3).trim().length() == 1)
        {
            timearray[0]=0;
            timearray[1]=time3;
            
            int timenumber2 = Integer.parseInt(parsethis2[0]) + 1;
        nwwe = (timenumber2) + ":" + timearray[0]+timearray[1];    
        }
        else{
        int timenumber2 = Integer.parseInt(parsethis2[0]) + 1;
        nwwe = (timenumber2) + ":" + time3;     
        }
        
    
    }
    
        if(timenumber>120 && timenumber<180)
    {
        int time3 = timenumber-120;
                    
            int timenumber2 = Integer.parseInt(parsethis2[0]) + 2;
        nwwe = (timenumber2) + ":" + time3;    
        
        
        
    }

              jTable1.getModel().setValueAt("Subject: "+getSorted()[e].getSubject().trim() + ", Description: " + getSorted()[e].getDeschome().trim() + ", Difficulty: " + getSorted()[e].getDifficulty().trim(), n, 1);
              
               
     if((timeofsort%60) == 0)
       {    
            sort1 = timeofsort/60; // so the sort1 value is either 1, 2 or 3
            
           String[] parsethis = getCurrenttime().split(":");
            
            int currenttime2 = Integer.parseInt(parsethis[0]);
            int currenttime3 = Integer.parseInt(parsethis[1]);
            
            operation = currenttime2 + sort1; // index1 being the initial time
            
            String find = (Integer.toString(operation)) + ":" +  currenttime3;
            
            for(int f=0; f<times.length; f++)
            {
                 if(times[f].equals(find))
                {
                    place2 = f;
                    break;
                }

                    
                 }
            nwwe = ((times[place2]));
       }
     
     
                
    
     String[] parsethis3 = nwwe.split(":");
     int timecheck5 = Integer.parseInt(parsethis3[0]);
          if(timecheck5 >= 24)
     {
         String find;
            
            int currenttime4 = Integer.parseInt(parsethis3[0]);
            int currenttime5 = Integer.parseInt(parsethis3[1]);
            
            if(currenttime4 == 24)
            {
                find = "00" + ":" + currenttime5;
                
                for(int f=0; f<times.length; f++)
            {
                 if(times[f].equals(find))
                {
                    place2 = f;
                    break;
                }
            }
     }
            
               if(currenttime4 == 25)
            {
                find = "01" + ":" + currenttime5;
                
                for(int f=0; f<times.length; f++)
            {
                 if(times[f].equals(find))
                {
                    place2 = f;
                    break;
                }
            }
     }
                        
              if(currenttime4 == 26)
            {
                find = "02" + ":" + currenttime5;
                
                for(int f=0; f<times.length; f++)
            {
                 if(times[f].equals(find))
                {
                    place2 = f;
                    break;
                }
            }
     }
          nwwe = ((times[place2]));     
     }
          

  //
                jTable1.getModel().setValueAt(getCurrenttime() + " - " + nwwe, n, 0);
 
                setCurrenttime(nwwe);
                    
                   
                    
                if((e%2 == 0))
       {    
            n++;
           String[] parsethis = getCurrenttime().split(":");
            
            int currenttime2 = Integer.parseInt(parsethis[0]);
            int currenttime3 = Integer.parseInt(parsethis[1]);
            int timec = currenttime3 + 15;
            
            operation = currenttime2; // index1 being the initial time
            
            String find = (Integer.toString(operation)) + ":" +  timec;
            
            if((timec%60)==0)
            
            {
                int number = 1 + (operation);
                find = (Integer.toString(number)) + ":00";
            }
            
            for(int f=0; f<times.length; f++)
            {
                 if(times[f].equals(find))
                {
                    place2 = f;
                    break;
                }

                    
                 }
            nwwe = ((times[place2]));
       
     
      jTable1.getModel().setValueAt(getCurrenttime() + " - " + nwwe, n, 0);
       jTable1.getModel().setValueAt("15 minute break", n, 1);
                setCurrenttime(nwwe);

    

 }
                 n+=1;
        
        
    }
 }
    }
    
    public static Homework_database[] sort(Homework_database[] nums, int start, int finish)
    {
int mid, left, right;
Homework_database temp;
left = start;
right = finish;
mid = nums[(start + finish)/2].getTimetaken(); // pivot element chosen from
                                 // the middle of the list
while (right > left)
{ 
    while (nums[left].getTimetaken() < mid)
{ 
                left += 1; } 
        
        while (mid < nums[right].getTimetaken()) 
        { 
                right -= 1; 
        } 
        
        if (left <= right)
    {
         temp = nums[left]; 
    nums[left] = nums[right];
    nums[right] = temp;
                left += 1;
                right -= 1;
}
 } 
if (start < right)
{ 
    sort(nums, start, right); 
} 
if (left < finish)
{ 
    sort(nums, left, finish); 
    
    }
return nums;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(343, 50, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLocation(new java.awt.Point(343, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetable/header.png"))); // NOI18N
        jLabel3.setMinimumSize(new java.awt.Dimension(490, 235));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 460, 50));

        jLabel6.setText("Return");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        jLabel1.setText("Homework:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Time", "Timetable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(150);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(150);
        jTable1.getColumnModel().getColumn(1).setResizable(false);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 570, 350));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    this.setVisible(false);// TODO add your handling code here:
    login_area.open1=0;
}//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(SimulatedTimeable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulatedTimeable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulatedTimeable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulatedTimeable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SimulatedTimeable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the sorted
     */
    public Homework_database[] getSorted() {
        return sorted;
    }

    /**
     * @param sorted the sorted to set
     */
    public void setSorted(Homework_database[] sorted) {
        this.sorted = sorted;
    }

    /**
     * @return the currenttime
     */
    public String getCurrenttime() {
        return currenttime;
    }

    /**
     * @param currenttime the currenttime to set
     */
    public void setCurrenttime(String currenttime) {
        this.currenttime = currenttime;
    }

    /**
     * @return the array1
     */
}

