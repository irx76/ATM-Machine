/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author irosh
 */
public class FastCash extends javax.swing.JFrame {

    /**
     * Creates new form FastCash
     */
    Connection conn;
    PreparedStatement pst;
    public FastCash() {
        initComponents();
    }
    int accountnum;
    Locale ll;
    public FastCash(int acc,Locale lcl) {
        Locale.setDefault(lcl);
        ll=lcl;
        initComponents();
        try {
            accountnum=acc;
            String url = "jdbc:derby://localhost:1527/BankABC";
            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
            java.sql.Statement stmnt= conn.createStatement();
            ResultSet RS=stmnt.executeQuery("Select * FROM ACCOUNT Where ACC_ID ="+acc);
            RS.next();
            int nikantemp=RS.getInt("BALANCE"); //containts current balance
            jLabel2.setText(""+nikantemp);
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
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
        Button1000_FastCash = new javax.swing.JButton();
        Button2000_FastCash = new javax.swing.JButton();
        Button5000_FastCash = new javax.swing.JButton();
        Button10000_FastCash = new javax.swing.JButton();
        Button15000_FastCash = new javax.swing.JButton();
        LabelBack_Fastcashpanel = new javax.swing.JLabel();
        LabelLogout1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelLogin = new javax.swing.JLabel();
        Button20000_FastCash = new javax.swing.JButton();

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

        Button1000_FastCash.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Button1000_FastCash.setForeground(new java.awt.Color(51, 0, 153));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        Button1000_FastCash.setText(bundle.getString("FastCash.Button1000_FastCash.text")); // NOI18N
        Button1000_FastCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1000_FastCashActionPerformed(evt);
            }
        });

        Button2000_FastCash.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Button2000_FastCash.setForeground(new java.awt.Color(51, 0, 153));
        Button2000_FastCash.setText(bundle.getString("FastCash.Button2000_FastCash.text")); // NOI18N
        Button2000_FastCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2000_FastCashActionPerformed(evt);
            }
        });

        Button5000_FastCash.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Button5000_FastCash.setForeground(new java.awt.Color(51, 0, 153));
        Button5000_FastCash.setText(bundle.getString("FastCash.Button5000_FastCash.text")); // NOI18N
        Button5000_FastCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5000_FastCashActionPerformed(evt);
            }
        });

        Button10000_FastCash.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Button10000_FastCash.setForeground(new java.awt.Color(51, 0, 153));
        Button10000_FastCash.setText(bundle.getString("FastCash.Button10000_FastCash.text")); // NOI18N
        Button10000_FastCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10000_FastCashActionPerformed(evt);
            }
        });

        Button15000_FastCash.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        Button15000_FastCash.setForeground(new java.awt.Color(51, 0, 153));
        Button15000_FastCash.setText(bundle.getString("FastCash.Button15000_FastCash.text")); // NOI18N
        Button15000_FastCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button15000_FastCashActionPerformed(evt);
            }
        });

        LabelBack_Fastcashpanel.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        LabelBack_Fastcashpanel.setForeground(new java.awt.Color(255, 0, 0));
        LabelBack_Fastcashpanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBack_Fastcashpanel.setText(bundle.getString("FastCash.LabelBack_Fastcashpanel.text")); // NOI18N
        LabelBack_Fastcashpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelBack_FastcashpanelMouseClicked(evt);
            }
        });

        LabelLogout1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        LabelLogout1.setForeground(new java.awt.Color(255, 255, 255));
        LabelLogout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogout1.setText(bundle.getString("FastCash.LabelLogout1.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(bundle.getString("FastCash.jLabel3.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        LabelLogin.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        LabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        LabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogin.setText(bundle.getString("FastCash.LabelLogin.text")); // NOI18N

        Button20000_FastCash.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        Button20000_FastCash.setForeground(new java.awt.Color(51, 0, 153));
        Button20000_FastCash.setText(bundle.getString("FastCash.Button20000_FastCash.text")); // NOI18N
        Button20000_FastCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button20000_FastCashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button2000_FastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1000_FastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5000_FastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(244, 244, 244)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Button15000_FastCash, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(Button10000_FastCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button20000_FastCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(LabelBack_Fastcashpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button1000_FastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button2000_FastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button5000_FastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button10000_FastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button15000_FastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button20000_FastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(LabelBack_Fastcashpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public int IDincrement() throws SQLException{
        
            String url = "jdbc:derby://localhost:1527/BankABC";
            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
            Statement stmnt= conn.createStatement();
            ResultSet RS=stmnt.executeQuery("Select TID FROM TRANSACTIONS ORDER BY TID DESC ");
            if(RS.next()==true){
                int TIDtemp=RS.getInt(1); 
                
                return TIDtemp+1;
                
            }   
            else{
                return 1; 
            }
            
    }        
    
    private void LabelBack_FastcashpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBack_FastcashpanelMouseClicked
        // TODO add your handling code here:
        new MainMenu(accountnum,ll).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelBack_FastcashpanelMouseClicked

    public String setDate(){
        Date d=new Date();
        SimpleDateFormat SDF=new SimpleDateFormat("dd/MM/YYYY ");
        String DateRN=SDF.format(d);
        String DateRNN=DateRN;
        return DateRNN;
    }
    
    public String setTime(){
        
        Date d=new Date();
        SimpleDateFormat SDF=new SimpleDateFormat("hh:mm:ss a");
        String TimeRN=SDF.format(d);
        System.out.println(TimeRN);
        return TimeRN;
    }

    
    private void Fastcashtaker(int amm,String ref){
        try {
            String url = "jdbc:derby://localhost:1527/BankABC";
            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
//            Statement stmnt= conn.createStatement();
//            ResultSet RS=stmnt.executeQuery("Select * FROM ACCOUNT Where ACC_ID ="+temp_accno);
//            RS.next();
//            int nikantemp=RS.getInt("BALANCE"); //containts current balance
//            int totalBalance=nikantemp+ammnt;
            pst = conn.prepareStatement("INSERT INTO TRANSACTIONS VALUES (?,?,?,?,?,?,?)");
            
            pst.setInt(1,IDincrement());
            pst.setInt(2, accountnum);
            pst.setString(3, "FastCash");
            
            pst.setString(4, setDate());
            pst.setInt(5, amm);
            pst.setString(6, setTime());
            pst.setString(7, ref);
            
            pst.executeUpdate();
            
//            JOptionPane.showMessageDialog(rootPane, "Record Updated ");
//            Button_Reset_Deposit_PanelActionPerformed(evt);
            
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void Button1000_FastCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1000_FastCashActionPerformed
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(rootPane, "Confirm (Yes/No)", "WARNING", JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
        int ammnt=1000;
        int temp_accno=accountnum;
        
         
        
        try{
            String url = "jdbc:derby://localhost:1527/BankABC";
            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
            Statement stmnt= conn.createStatement();
            ResultSet RS=stmnt.executeQuery("Select * FROM ACCOUNT Where ACC_ID ="+temp_accno);
            RS.next();
            int nikantemp=RS.getInt("BALANCE"); //containts current balance
            if(ammnt>nikantemp){
                JOptionPane.showMessageDialog(rootPane, "NOT ENOUGH MONEY!", "YOU ARE BROKE", JOptionPane.ERROR_MESSAGE);
                
            }
            if(ammnt<nikantemp){
                String refe=JOptionPane.showInputDialog("Your reference : ");
                int totalBalance=nikantemp-ammnt;
                pst = conn.prepareStatement("UPDATE ACCOUNT SET BALANCE=? WHERE ACC_ID=?");
                pst.setInt(1, totalBalance);
                pst.setInt(2, temp_accno);
                pst.executeUpdate();
                Fastcashtaker(ammnt,refe);
                

                JOptionPane.showMessageDialog(rootPane, "Money:  "+ammnt);
                jLabel2.setText(""+totalBalance);
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_Button1000_FastCashActionPerformed

    private void Button2000_FastCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2000_FastCashActionPerformed
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(rootPane, "Confirm (Yes/No)", "WARNING", JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
        int ammnt=2000;
        int temp_accno=accountnum;
        
         
        
        try{
            String url = "jdbc:derby://localhost:1527/BankABC";
            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
            Statement stmnt= conn.createStatement();
            ResultSet RS=stmnt.executeQuery("Select * FROM ACCOUNT Where ACC_ID ="+temp_accno);
            RS.next();
            int nikantemp=RS.getInt("BALANCE"); //containts current balance
            if(ammnt>nikantemp){
                JOptionPane.showMessageDialog(rootPane, "NOT ENOUGH MONEY!", "YOU ARE BROKE", JOptionPane.ERROR_MESSAGE);
                
            }
            if(ammnt<nikantemp){
                String refe=JOptionPane.showInputDialog("Your reference : ");
                int totalBalance=nikantemp-ammnt;
                pst = conn.prepareStatement("UPDATE ACCOUNT SET BALANCE=? WHERE ACC_ID=?");
                pst.setInt(1, totalBalance);
                pst.setInt(2, temp_accno);
                pst.executeUpdate();
                Fastcashtaker(ammnt,refe);

                JOptionPane.showMessageDialog(rootPane, "Money:  "+ammnt);
                jLabel2.setText(""+totalBalance);
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_Button2000_FastCashActionPerformed

    private void Button5000_FastCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5000_FastCashActionPerformed
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(rootPane, "Confirm (Yes/No)", "WARNING", JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
        int ammnt=5000;
        int temp_accno=accountnum;
        
         
        
        try{
            String url = "jdbc:derby://localhost:1527/BankABC";
            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
            Statement stmnt= conn.createStatement();
            ResultSet RS=stmnt.executeQuery("Select * FROM ACCOUNT Where ACC_ID ="+temp_accno);
            RS.next();
            int nikantemp=RS.getInt("BALANCE"); //containts current balance
            if(ammnt>nikantemp){
                JOptionPane.showMessageDialog(rootPane, "NOT ENOUGH MONEY!", "YOU ARE BROKE", JOptionPane.ERROR_MESSAGE);
                
            }
            if(ammnt<nikantemp){
                String refe=JOptionPane.showInputDialog("Your reference : ");
                int totalBalance=nikantemp-ammnt;
                pst = conn.prepareStatement("UPDATE ACCOUNT SET BALANCE=? WHERE ACC_ID=?");
                pst.setInt(1, totalBalance);
                pst.setInt(2, temp_accno);
                pst.executeUpdate();
                Fastcashtaker(ammnt,refe);

                JOptionPane.showMessageDialog(rootPane, "Money:  "+ammnt);
                jLabel2.setText(""+totalBalance);
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_Button5000_FastCashActionPerformed

    private void Button10000_FastCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10000_FastCashActionPerformed
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(rootPane, "Confirm (Yes/No)", "WARNING", JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
        int ammnt=10000;
        int temp_accno=accountnum;
        
         
        
        try{
            String url = "jdbc:derby://localhost:1527/BankABC";
            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
            Statement stmnt= conn.createStatement();
            ResultSet RS=stmnt.executeQuery("Select * FROM ACCOUNT Where ACC_ID ="+temp_accno);
            RS.next();
            int nikantemp=RS.getInt("BALANCE"); //containts current balance
            if(ammnt>nikantemp){
                JOptionPane.showMessageDialog(rootPane, "NOT ENOUGH MONEY!", "YOU ARE BROKE", JOptionPane.ERROR_MESSAGE);
                
            }
            if(ammnt<nikantemp){
                String refe=JOptionPane.showInputDialog("Your reference : ");
                int totalBalance=nikantemp-ammnt;
                pst = conn.prepareStatement("UPDATE ACCOUNT SET BALANCE=? WHERE ACC_ID=?");
                pst.setInt(1, totalBalance);
                pst.setInt(2, temp_accno);
                pst.executeUpdate();
                Fastcashtaker(ammnt,refe);

                JOptionPane.showMessageDialog(rootPane, "Money:  "+ammnt);
                jLabel2.setText(""+totalBalance);
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_Button10000_FastCashActionPerformed

    private void Button15000_FastCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button15000_FastCashActionPerformed
        // TODO add your handling code here
        int result=JOptionPane.showConfirmDialog(rootPane, "Confirm (Yes/No)", "WARNING", JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
        int ammnt=15000;
        int temp_accno=accountnum;
        
         
        
        try{
            String url = "jdbc:derby://localhost:1527/BankABC";
            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
            Statement stmnt= conn.createStatement();
            ResultSet RS=stmnt.executeQuery("Select * FROM ACCOUNT Where ACC_ID ="+temp_accno);
            RS.next();
            int nikantemp=RS.getInt("BALANCE"); //containts current balance
            if(ammnt>nikantemp){
                JOptionPane.showMessageDialog(rootPane, "NOT ENOUGH MONEY!", "YOU ARE BROKE", JOptionPane.ERROR_MESSAGE);
                
            }
            if(ammnt<nikantemp){
                String refe=JOptionPane.showInputDialog("Your reference : ");
                int totalBalance=nikantemp-ammnt;
                pst = conn.prepareStatement("UPDATE ACCOUNT SET BALANCE=? WHERE ACC_ID=?");
                pst.setInt(1, totalBalance);
                pst.setInt(2, temp_accno);
                pst.executeUpdate();
                Fastcashtaker(ammnt,refe);

                JOptionPane.showMessageDialog(rootPane, "Money:  "+ammnt);
                jLabel2.setText(""+totalBalance);
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_Button15000_FastCashActionPerformed

    private void Button20000_FastCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button20000_FastCashActionPerformed
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(rootPane, "Confirm (Yes/No)", "WARNING", JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
        int ammnt=20000;
        int temp_accno=accountnum;
        
         
        
        try{
            String url = "jdbc:derby://localhost:1527/BankABC";
            conn = DriverManager.getConnection(url, "IROSH", "abc@123");
            Statement stmnt= conn.createStatement();
            ResultSet RS=stmnt.executeQuery("Select * FROM ACCOUNT Where ACC_ID ="+temp_accno);
            RS.next();
            int nikantemp=RS.getInt("BALANCE"); //containts current balance
            if(ammnt>nikantemp){
                JOptionPane.showMessageDialog(rootPane, "NOT ENOUGH MONEY!", "YOU ARE BROKE", JOptionPane.ERROR_MESSAGE);
                
            }
            if(ammnt<nikantemp){
                String refe=JOptionPane.showInputDialog("Your reference : ");
                if(refe.isEmpty()){JOptionPane.showMessageDialog(rootPane, "reference cant be empty", "ERROR", JOptionPane.ERROR_MESSAGE);}
                else{
                int totalBalance=nikantemp-ammnt;
                pst = conn.prepareStatement("UPDATE ACCOUNT SET BALANCE=? WHERE ACC_ID=?");
                pst.setInt(1, totalBalance);
                pst.setInt(2, temp_accno);
                pst.executeUpdate();
                Fastcashtaker(ammnt,refe);

                JOptionPane.showMessageDialog(rootPane, "Money:  "+ammnt);
                jLabel2.setText(""+totalBalance);
                }
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_Button20000_FastCashActionPerformed

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
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button10000_FastCash;
    private javax.swing.JButton Button1000_FastCash;
    private javax.swing.JButton Button15000_FastCash;
    private javax.swing.JButton Button20000_FastCash;
    private javax.swing.JButton Button2000_FastCash;
    private javax.swing.JButton Button5000_FastCash;
    private javax.swing.JLabel LabelBack_Fastcashpanel;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelLogout1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
