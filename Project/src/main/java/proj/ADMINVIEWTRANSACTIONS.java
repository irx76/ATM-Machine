/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author irosh
 */
public class ADMINVIEWTRANSACTIONS extends javax.swing.JFrame {

    /**
     * Creates new form ADMINVIEWTRANSACTIONS
     */
    Connection conn;
    PreparedStatement pst;
    
    public ADMINVIEWTRANSACTIONS() {
        initComponents();
        LoadTable();
    }
    
    int adminID;
    Locale ll;
    public ADMINVIEWTRANSACTIONS(int adID,Locale lcl) {
        Locale.setDefault(lcl);
        ll=lcl;
        initComponents();
        adminID=adID;
        LoadTable();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Label_accName_mainmenu = new javax.swing.JLabel();
        LabelLogout1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        LabelLogin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableStatement = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        LabelBACK_balancePanel = new javax.swing.JLabel();
        TextfieldACCno = new javax.swing.JTextField();
        Button_print_statementPanel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\irosh\\OneDrive\\Desktop\\JAVA\\Project\\Logo v3.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Label_accName_mainmenu.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        LabelLogout1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        LabelLogout1.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        LabelLogout1.setText(bundle.getString("ADMINVIEWTRANSACTIONS.LabelLogout1.text")); // NOI18N

        LabelLogin.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        LabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        LabelLogin.setText(bundle.getString("ADMINVIEWTRANSACTIONS.LabelLogin.text")); // NOI18N

        TableStatement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "TID", "Account no", "Type", "Amount", "Date", "Time", "Reference"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableStatement);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(bundle.getString("ADMINVIEWTRANSACTIONS.jLabel2.text")); // NOI18N

        LabelBACK_balancePanel.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        LabelBACK_balancePanel.setForeground(new java.awt.Color(255, 0, 0));
        LabelBACK_balancePanel.setText(bundle.getString("ADMINVIEWTRANSACTIONS.LabelBACK_balancePanel.text")); // NOI18N
        LabelBACK_balancePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelBACK_balancePanelMouseClicked(evt);
            }
        });

        TextfieldACCno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextfieldACCnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextfieldACCnoKeyTyped(evt);
            }
        });

        Button_print_statementPanel.setForeground(new java.awt.Color(51, 0, 153));
        Button_print_statementPanel.setText(bundle.getString("ADMINVIEWTRANSACTIONS.Button_print_statementPanel.text")); // NOI18N
        Button_print_statementPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_print_statementPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(576, 576, 576)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_accName_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextfieldACCno, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(322, 322, 322))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_print_statementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(LabelBACK_balancePanel)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelLogin)
                        .addGap(256, 256, 256))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_accName_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelLogin))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextfieldACCno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBACK_balancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_print_statementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(LabelLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    void LoadTable() {
        try {
            String url = "jdbc:derby://localhost:1527/BankABC";
            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
            pst = conn.prepareStatement("SELECT TID,ACC_NUM,TYPE,AMOUNT,TDATE,TTIME,REFERENCE FROM IROSH.TRANSACTIONS" );
            ResultSet rs = pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) TableStatement.getModel();
            dtm.setRowCount(0);

            while (rs.next() == true) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                dtm.addRow(v);
            }
            TableStatement.setModel(dtm);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    private void LabelBACK_balancePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBACK_balancePanelMouseClicked
        // TODO add your handling code here:
        new ADMIN(adminID,ll).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelBACK_balancePanelMouseClicked

    private void TextfieldACCnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextfieldACCnoKeyReleased
        // TODO add your handling code here:

//        try {
//            String url = "jdbc:derby://localhost:1527/BankABC";
//            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
//            pst = conn.prepareStatement("SELECT TID,ACC_NUM,TYPE,AMOUNT,TDATE,TTIME,REFERENCE FROM IROSH.TRANSACTIONS Where TYPE LIKE ? ");
//            //            pst.setString(1, "%"+TextFieldSearch.getText()+"%");
//            pst.setString(1,"%"+TextfieldACCno.getText()+"%");
//            ResultSet rs = pst.executeQuery();
//            DefaultTableModel dtm = (DefaultTableModel) TableStatement.getModel();
//            dtm.setRowCount(0);
//
//            while (rs.next() == true) {
//                Vector v = new Vector();
//                v.add(rs.getString(1));
//                v.add(rs.getString(2));
//                v.add(rs.getString(3));
//                v.add(rs.getString(4));
//                v.add(rs.getString(5));
//                v.add(rs.getString(6));
//                v.add(rs.getString(7));
//
//                dtm.addRow(v);
//            }
//            TableStatement.setModel(dtm);
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }

            DefaultTableModel ob=(DefaultTableModel)TableStatement.getModel();
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
        TableStatement.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(TextfieldACCno.getText(),1));


    }//GEN-LAST:event_TextfieldACCnoKeyReleased

    public String setDate(){
        Date d=new Date();
        SimpleDateFormat SDF=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss a");
        String DateRN=SDF.format(d);
        String DateRNN=DateRN;
        return DateRNN;
    }
    
    private void Button_print_statementPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_print_statementPanelActionPerformed
        // TODO add your handling code here:
        MessageFormat header= new MessageFormat("ABC Bank transactions on"+setDate());
        MessageFormat footer= new MessageFormat ("Page{0,number,integer}");

        try {
            TableStatement.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Button_print_statementPanelActionPerformed

    private void TextfieldACCnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextfieldACCnoKeyTyped
        // TODO add your handling code here:
        char c= evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();}
    }//GEN-LAST:event_TextfieldACCnoKeyTyped

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
            java.util.logging.Logger.getLogger(ADMINVIEWTRANSACTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMINVIEWTRANSACTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMINVIEWTRANSACTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMINVIEWTRANSACTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMINVIEWTRANSACTIONS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_print_statementPanel;
    private javax.swing.JLabel LabelBACK_balancePanel;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelLogout1;
    private javax.swing.JLabel Label_accName_mainmenu;
    private javax.swing.JTable TableStatement;
    private javax.swing.JTextField TextfieldACCno;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
