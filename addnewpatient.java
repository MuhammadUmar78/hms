/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;
 import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Muhammad Umar Asif
 */
public class addnewpatient extends javax.swing.JFrame {

    /**
     * Creates new form addnewpatient
     */
    public addnewpatient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ptid = new javax.swing.JTextField();
        ptname = new javax.swing.JTextField();
        cont = new javax.swing.JTextField();
        ptage = new javax.swing.JTextField();
        gend = new javax.swing.JComboBox<>();
        bg = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        amde = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jButton4.setText("Add");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Muhammad Umar Asif\\Desktop\\hms\\HMS ICON\\add new patient background.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(330, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 410, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Patient Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 65, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 104, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 143, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 182, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 221, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Blood Group");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 266, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 305, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Any Major Disease Earlier");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 344, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 382, -1, -1));

        ptid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(ptid, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 64, 222, -1));

        ptname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(ptname, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 103, 222, -1));

        cont.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contActionPerformed(evt);
            }
        });
        getContentPane().add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 142, 222, -1));

        ptage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(ptage, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 181, 222, -1));

        gend.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gend.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        getContentPane().add(gend, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 220, 222, -1));

        bg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgActionPerformed(evt);
            }
        });
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 265, 222, -1));

        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 304, 222, -1));

        amde.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(amde, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 343, 222, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 110, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Muhammad Umar Asif\\Desktop\\hms\\HMS ICON\\add new patient background.jpg")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contActionPerformed

    private void bgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bgActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

      Connection conn = null;
      try {
           String url = new String();
           String user = new String();
           String password = new String();
           url ="jdbc:mysql://localhost:3306/hostpitalms";
           user = "root";
           password = "";
           
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null,"Connection Successfuly");
                } 
       catch (Exception e) 
               {
                    JOptionPane.showMessageDialog(null, "Connection Failed" +e);
                }  
      String patientid=ptid.getText();
      String name=ptname.getText();
      String contact=cont.getText();
      String age=ptage.getText();
      String gender=gend.getSelectedItem().toString();
      String bloodgroup=bg.getText();
      String address=add.getText();
      String anymd=amde.getText(); 
        try {
         java.sql.PreparedStatement   pst = conn.prepareStatement("insert into addnewpatient(patientid,name,contact,age,gender,bloodgroup,address,anymd)values(?,?,?,?,?,?,?,?)");
            pst.setString(1,patientid);   
            pst.setString(2, name);
            pst.setString(3, contact);
            pst.setString(4, age);
            pst.setString(5, gender);
            pst.setString(6, bloodgroup);
            pst.setString(7, address);
            pst.setString(8, anymd);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"User Inserted......!");
            setVisible(false);
            new addnewpatient().setVisible(true);
//             ptname.setText("");
//             cont.setText("");
//             ptage.setText("");
//             bg.setText("");
//             add.setText("");
//             amde.setText("");
            }          
            catch (SQLException ex) {
            Logger.getLogger(addnewpatient.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnewpatient().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField amde;
    private javax.swing.JTextField bg;
    private javax.swing.JTextField cont;
    private javax.swing.JComboBox<String> gend;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField ptage;
    private javax.swing.JTextField ptid;
    private javax.swing.JTextField ptname;
    // End of variables declaration//GEN-END:variables
}
