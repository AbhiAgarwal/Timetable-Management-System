/*
 * To change this template, choose Tools | Templates
/**
 *
 * @author Abhi Agarwal
 * Timetable Management System
 * Abhi Agarwal, 30th January 2012
 * Bangkok Patana School
 * 
 * Mac Book Pro 10.7, 2.66 GHz Intel Core i7, 4GB 1067 MHz DDR3
 * The function to view records in the RAF
 * Integrated Development Environment Netbeans 7.0.1
 * 
 */
package timetable;


/**
 *
 * @author Abhi
 */
public class Homework_database_view extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    
    private int n = 0;
    

    /** Creates new form Homework_database_view */
    public Homework_database_view() {
        initComponents();
        this.setDefaultCloseOperation(0);
        jPanel3.setBackground(login_area.FINAL_BG_COLOR);
       
        Timetable_main_RWRAF.read(3);

for(int i=0; i<=Timetable_main_RWRAF.getLength(); i++)
{
    Timetable_main_RWRAF.read(i);
 if (Timetable_main_RWRAF.checkDelete() == 0)
 {
jTextField8.setText(Integer.toString(Timetable_main_RWRAF.getID()));
            
jTextField6.setText(Timetable_main_RWRAF.getSubject());
           
jTextArea1.setText(Timetable_main_RWRAF.getDesc());
           
jTextField7.setText(Timetable_main_RWRAF.getDiff());

jTextField3.setText(Integer.toString(Timetable_main_RWRAF.getTime()));

n = i;
break;
 }
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

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(343, 50));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetable/header.png"))); // NOI18N
        jLabel7.setMinimumSize(new java.awt.Dimension(490, 235));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 50));

        jLabel12.setText("Return");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        jLabel8.setText("Difficulty: \u0000");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel9.setText("Subject:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 100, -1));

        jLabel10.setText("Description of homework: ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel11.setText("Task Time: \u0000");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, 20));

        jButton2.setText("<");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, -1));

        jButton3.setText(">");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 60, -1));

        jLabel13.setText("ID:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 330, 130));

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 180, -1));

        jTextField7.setEditable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 100, -1));

        jTextField8.setEditable(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 100, -1));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 475, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
    this.setVisible(false);
     login_area.open1 = 0;
}//GEN-LAST:event_jLabel12MouseClicked

private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField3ActionPerformed

private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Timetable_main_RWRAF.read(Timetable_main_RWRAF.getLength());

n+=1;        
for(int i=n; i<=Timetable_main_RWRAF.getLength(); i++)
{
    Timetable_main_RWRAF.read(i);
 if (Timetable_main_RWRAF.checkDelete() == 0)
 {
jTextField8.setText(Integer.toString(Timetable_main_RWRAF.getID()));
            
jTextField6.setText(Timetable_main_RWRAF.getSubject());
           
jTextArea1.setText(Timetable_main_RWRAF.getDesc());
           
jTextField7.setText(Timetable_main_RWRAF.getDiff());

jTextField3.setText(Integer.toString(Timetable_main_RWRAF.getTime()));

n=i;

break;
 }
}
 
/*
for(int i=n; i<=Timetable_main_RWRAF.getLength(); i++)
{
    Timetable_main_RWRAF.read(i);
    
 if (Timetable_main_RWRAF.checkDelete() == 0)
 {
    
    if(n<Timetable_main_RWRAF.getLength())    
{
        Timetable_main_RWRAF.read(n);
             n += 1;
    
jTextField8.setText(Integer.toString(Timetable_main_RWRAF.getID()));

jTextField6.setText(Timetable_main_RWRAF.getSubject());
           
jTextArea1.setText(Timetable_main_RWRAF.getDesc());
           
jTextField7.setText(Timetable_main_RWRAF.getDiff());

jTextField3.setText(Integer.toString(Timetable_main_RWRAF.getTime()));
break;
}
else
{
     JOptionPane.showMessageDialog(null,"No more homeworks left! :)", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
}
 }
 else
 {
     JOptionPane.showMessageDialog(null,"No more homeworks left! :)", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
 }
}
*/
}//GEN-LAST:event_jButton3MouseClicked

private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField6ActionPerformed

private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField7ActionPerformed

private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField8ActionPerformed

private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
/*    
   if(n>=1)
   {
    n -= 1;
      Timetable_main_RWRAF.read(n);
    
jTextField8.setText(Integer.toString(Timetable_main_RWRAF.getID()));

jTextField6.setText(Timetable_main_RWRAF.getSubject());
           
jTextArea1.setText(Timetable_main_RWRAF.getDesc());
           
jTextField7.setText(Timetable_main_RWRAF.getDiff());

jTextField3.setText(Integer.toString(Timetable_main_RWRAF.getTime()));
   }
   else{
         JOptionPane.showMessageDialog(null,"This is the first homework!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
   }
     * 
     */
    if(n>=1){
    Timetable_main_RWRAF.read(Timetable_main_RWRAF.getLength());

n-=1;        
for(int i=n; i<=Timetable_main_RWRAF.getLength(); i++)
{
    Timetable_main_RWRAF.read(i);
 if (Timetable_main_RWRAF.checkDelete() == 0)
 {
jTextField8.setText(Integer.toString(Timetable_main_RWRAF.getID()));
            
jTextField6.setText(Timetable_main_RWRAF.getSubject());
           
jTextArea1.setText(Timetable_main_RWRAF.getDesc());
           
jTextField7.setText(Timetable_main_RWRAF.getDiff());

jTextField3.setText(Integer.toString(Timetable_main_RWRAF.getTime()));

break;
 }
}
    }
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
            java.util.logging.Logger.getLogger(Homework_database_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homework_database_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homework_database_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homework_database_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            

            @Override
            public void run() {
                new Homework_database_view().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
