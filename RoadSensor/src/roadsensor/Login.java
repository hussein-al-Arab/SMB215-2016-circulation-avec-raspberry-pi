/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadsensor;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.read.biff.BiffException;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author mlhit10
 */


public class Login extends javax.swing.JFrame {
public String S1 = "";
public String S2 = "";
public String S3 = "";
public String S4 = "";
public String S5 = "";
public String S1Access = "";
public String S2Access = "";
public String S3Access = "";
public String S4Access = "";
public String S5Access = "";
/**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernametextfield = new javax.swing.JTextField();
        passwordtextfield = new javax.swing.JPasswordField();
        cancelbutton = new javax.swing.JToggleButton();
        enterbutton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Login");

        jLabel2.setText("Enter |UserName");

        jLabel3.setText("Enter Password");

        usernametextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametextfieldActionPerformed(evt);
            }
        });

        passwordtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextfieldActionPerformed(evt);
            }
        });

        cancelbutton.setText("Cancel");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        enterbutton.setText("Enter");
        enterbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernametextfield)
                            .addComponent(passwordtextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(cancelbutton)
                        .addGap(18, 18, 18)
                        .addComponent(enterbutton)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbutton)
                    .addComponent(enterbutton))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernametextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametextfieldActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
close();
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void enterbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterbuttonActionPerformed
        // TODO add your handling code here:
        String password = passwordtextfield.getText();
        String username = usernametextfield.getText();
        try {  
            File f;
            File S1Doc;
            File S2Doc;
            File S3Doc;
            File S4Doc;
            File S5Doc;
            f=new File("C:\\Users\\mlhit10\\Desktop\\SensorData\\Users.xls");
            S1Doc = new File ("C:\\Users\\mlhit10\\Desktop\\SensorData\\S1.xls");
            S2Doc = new File ("C:\\Users\\mlhit10\\Desktop\\SensorData\\S2.xls");
            S3Doc = new File ("C:\\Users\\mlhit10\\Desktop\\SensorData\\S3.xls");
            S4Doc = new File ("C:\\Users\\mlhit10\\Desktop\\SensorData\\S4.xls");
            S5Doc = new File ("C:\\Users\\mlhit10\\Desktop\\SensorData\\S5.xls");
            jxl.Workbook wb;
            jxl.Workbook wbS1;
            jxl.Workbook wbS2;
            jxl.Workbook wbS3;
            jxl.Workbook wbS4;
            jxl.Workbook wbS5;
            wb=jxl.Workbook.getWorkbook(f);
            wbS1=jxl.Workbook.getWorkbook(S1Doc);
            wbS2=jxl.Workbook.getWorkbook(S2Doc);
            wbS3=jxl.Workbook.getWorkbook(S3Doc);
            wbS4=jxl.Workbook.getWorkbook(S4Doc);
            wbS5=jxl.Workbook.getWorkbook(S5Doc);
            jxl.Sheet s=wb.getSheet(0);
            jxl.Sheet sS1=wbS1.getSheet(0);
            jxl.Sheet sS2=wbS2.getSheet(0);
            jxl.Sheet sS3=wbS3.getSheet(0);
            jxl.Sheet sS4=wbS4.getSheet(0);
            jxl.Sheet sS5=wbS5.getSheet(0);
            int row=s.getRows();
            int rowS1=sS1.getRows();
            int rowS2=sS2.getRows();
            int rowS3=sS3.getRows();
            int rowS4=sS4.getRows();
            int rowS5=sS5.getRows();
            int col=s.getColumns();
            int colS1=sS1.getColumns();
            int colS2=sS2.getColumns();
            int colS3=sS3.getColumns();
            int colS4=sS4.getColumns();
            int colS5=sS5.getColumns();
            
            for (int i=0;i<row;i++){
                for (int j=0; j<col;j++){
                    jxl.Cell c=s.getCell(j, i);
                    if(c.getContents().equals(username) ){
                        if(s.getCell(j+1, i).getContents().equals(password)){
                            
                            S1Access = ""+s.getCell(j+3,i).getContents();
                            S2Access = ""+s.getCell(j+4,i).getContents();
                            S3Access = ""+s.getCell(j+5,i).getContents();
                            S4Access = ""+s.getCell(j+6,i).getContents();
                            S5Access = ""+s.getCell(j+7,i).getContents();
                            System.out.print("Priviliges: "+S1Access+" "+S2Access+" "+S3Access+" "+S4Access+" "+S5Access+" \n");
                            
                            
                             if( Double.valueOf(sS1.getCell(3,rowS1-1).getContents())<10 &&
                Double.valueOf(sS1.getCell(3,rowS1-2).getContents())<10 &&
                Double.valueOf(sS1.getCell(3,rowS1-3).getContents())<10 &&                 
                Double.valueOf(sS1.getCell(3,rowS1-4).getContents())<10) {
                    S1="True";
                } else {
                   S1="False";    
                            }  
            if( Double.valueOf(sS2.getCell(3,rowS2-1).getContents())<10 &&
                Double.valueOf(sS2.getCell(3,rowS2-2).getContents())<10 &&
                Double.valueOf(sS2.getCell(3,rowS2-3).getContents())<10 &&                 
                Double.valueOf(sS2.getCell(3,rowS2-4).getContents())<10) {
                    S2="True";
                } else {
                   S2="False";    
                            } 
            if( Double.valueOf(sS3.getCell(3,rowS3-1).getContents())<10 &&
                Double.valueOf(sS3.getCell(3,rowS3-2).getContents())<10 &&
                Double.valueOf(sS3.getCell(3,rowS3-3).getContents())<10 &&                 
                Double.valueOf(sS3.getCell(3,rowS3-4).getContents())<10) {
                    S3="True";
                } else {
                   S3="False";    
                            } 
            if( Double.valueOf(sS4.getCell(3,rowS4-1).getContents())<10 &&
                Double.valueOf(sS4.getCell(3,rowS4-2).getContents())<10 &&
                Double.valueOf(sS4.getCell(3,rowS4-3).getContents())<10 &&                 
                Double.valueOf(sS4.getCell(3,rowS4-4).getContents())<10) {
                    S4="True";
                } else {
                   S4="False";    
                            } 
            if( Double.valueOf(sS5.getCell(3,rowS5-1).getContents())<10 &&
                Double.valueOf(sS5.getCell(3,rowS5-2).getContents())<10 &&
                Double.valueOf(sS5.getCell(3,rowS5-3).getContents())<10 &&                 
                Double.valueOf(sS5.getCell(3,rowS5-4).getContents())<10) {
                    S5="True";
                } else {
                   S5="False";    
                            } 
                            System.out.print("Status: "+S1+" "+S2+" "+S3+" "+S4+" "+S5+" \n");
                            welcome w=new welcome(S1,S1Access,S2,S2Access,S3,S3Access,S4,S4Access,S5,S5Access);
                           w.setVisible(true);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null,"wrong password","wrong password",JOptionPane.ERROR_MESSAGE);
                            passwordtextfield.setText("");
                            usernametextfield.setText("");
                            break;
                        } 
                    } 
                } 
            } 
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_enterbuttonActionPerformed

    private void passwordtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextfieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passwordtextfieldActionPerformed

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
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Login().setVisible(true);
                }
            });
        
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cancelbutton;
    private javax.swing.JToggleButton enterbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordtextfield;
    private javax.swing.JTextField usernametextfield;
    // End of variables declaration//GEN-END:variables

private void close(){
    WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
}




}
