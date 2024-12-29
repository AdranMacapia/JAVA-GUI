

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HEXA
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Employees_Form extends javax.swing.JFrame {

    /**
     * Creates new form Workers
     */
    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;
    
    public Employees_Form() {
        initComponents();
        DoConnect();
    }

    public void DoConnect(){
    
        try
        {
             String host ="jdbc:derby://localhost:1527/BSCS_C2021_Group16";
            String uName = "ADMIN1";
            String uPass = "admin1";
            con = DriverManager.getConnection(host, uName, uPass);
            
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL ="select * from Workers";
            rs = stmt.executeQuery(SQL);
            
            rs.next();
            int id_col = rs.getInt("id");
            String id = Integer.toString(id_col);
            String First_Name = rs.getString("First_Name");
            String Last_Name = rs.getString("Last_Name");
            String Job_Title = rs.getString("Job_Title");
            
            tf_id.setText(id);
            tf_FN.setText(First_Name);
            tf_LN.setText(Last_Name);
            tf_JT.setText(Job_Title);
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    
    /**
     * Closes up all the database connection
     * before disposing the frame.
     */
    @Override
    public void dispose() {
        try {
            stmt.close();
            rs.close();
        } catch(SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }

        super.dispose();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_FN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_JT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_LN = new javax.swing.JTextField();
        btn_first = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        btn_UR = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        btn_SNR = new javax.swing.JButton();
        btn_CR = new javax.swing.JButton();
        btn_DR = new javax.swing.JButton();
        btn_Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 350));
        setResizable(false);
        setSize(new java.awt.Dimension(550, 350));

        jPanel1.setBackground(new java.awt.Color(225, 78, 66));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 350));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        tf_id.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        tf_id.setMaximumSize(new java.awt.Dimension(6, 20));
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");

        tf_FN.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        tf_FN.setMaximumSize(new java.awt.Dimension(6, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Job Title");

        tf_JT.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");

        tf_LN.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        tf_LN.setMaximumSize(new java.awt.Dimension(6, 20));

        btn_first.setBackground(new java.awt.Color(225, 78, 66));
        btn_first.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_first.setForeground(new java.awt.Color(255, 255, 255));
        btn_first.setText("First");
        btn_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstActionPerformed(evt);
            }
        });

        btn_prev.setBackground(new java.awt.Color(225, 78, 66));
        btn_prev.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_prev.setForeground(new java.awt.Color(255, 255, 255));
        btn_prev.setText("Prev");
        btn_prev.setMaximumSize(new java.awt.Dimension(57, 25));
        btn_prev.setMinimumSize(new java.awt.Dimension(57, 25));
        btn_prev.setPreferredSize(new java.awt.Dimension(57, 25));
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });

        btn_next.setBackground(new java.awt.Color(225, 78, 66));
        btn_next.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setText("Next");
        btn_next.setMaximumSize(new java.awt.Dimension(57, 25));
        btn_next.setMinimumSize(new java.awt.Dimension(57, 25));
        btn_next.setPreferredSize(new java.awt.Dimension(57, 25));
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_last.setBackground(new java.awt.Color(225, 78, 66));
        btn_last.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_last.setForeground(new java.awt.Color(255, 255, 255));
        btn_last.setText("Last");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        btn_UR.setBackground(new java.awt.Color(225, 78, 66));
        btn_UR.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_UR.setForeground(new java.awt.Color(255, 255, 255));
        btn_UR.setText("Update Record");
        btn_UR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_URActionPerformed(evt);
            }
        });

        btn_Add.setBackground(new java.awt.Color(225, 78, 66));
        btn_Add.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("Add New Record");
        btn_Add.setMaximumSize(new java.awt.Dimension(133, 25));
        btn_Add.setMinimumSize(new java.awt.Dimension(133, 25));
        btn_Add.setPreferredSize(new java.awt.Dimension(133, 25));
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_SNR.setBackground(new java.awt.Color(225, 78, 66));
        btn_SNR.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_SNR.setForeground(new java.awt.Color(255, 255, 255));
        btn_SNR.setText("Save New Record");
        btn_SNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SNRActionPerformed(evt);
            }
        });

        btn_CR.setBackground(new java.awt.Color(225, 78, 66));
        btn_CR.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_CR.setForeground(new java.awt.Color(255, 255, 255));
        btn_CR.setText("Cancel Record");
        btn_CR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CRActionPerformed(evt);
            }
        });

        btn_DR.setBackground(new java.awt.Color(225, 78, 66));
        btn_DR.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_DR.setForeground(new java.awt.Color(255, 255, 255));
        btn_DR.setText("Delete Record");
        btn_DR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DRActionPerformed(evt);
            }
        });

        btn_Logout.setBackground(new java.awt.Color(225, 78, 66));
        btn_Logout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_Logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Logout_30px.png"))); // NOI18N
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_first)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_SNR, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_last))
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_id, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(tf_JT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_LN, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_FN, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btn_UR)
                .addGap(61, 61, 61)
                .addComponent(btn_DR)
                .addGap(61, 61, 61)
                .addComponent(btn_CR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_JT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_LN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_first)
                    .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_last))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SNR, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:                                   
    }//GEN-LAST:event_tf_idActionPerformed

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        // TODO add your handling code here:
                 try
        {
            if(rs.first())
            {
                int id_col = rs.getInt ("ID");
                String id = Integer.toString (id_col);
                String First_Name = rs.getString ("First_Name");
                String Last_Name = rs.getString ("Last_Name");
                String Job_Title = rs.getString ("Job_Title");
                
                tf_id.setText (id);
                tf_FN.setText (First_Name);
                tf_LN.setText (Last_Name);
                tf_JT.setText (Job_Title);
            }
        }
        catch (SQLException err)
        {
            JOptionPane.showMessageDialog (Employees_Form.this, err.getMessage());
        }
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_DRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DRActionPerformed
        // TODO add your handling code here:
                try
        {
            rs.deleteRow();
            stmt.close();
            rs.close();
            stmt = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "select * from Workers";
            rs = stmt.executeQuery(SQL);
            
             rs.next();
            int id_col = rs.getInt("ID");
            String id = Integer.toString(id_col);
            String First_name = rs.getString("First_name");
            String Last_name = rs.getString("Last_name");
            String Job_title = rs.getString("Job_Title");
            
            tf_id.setText(id);
            tf_FN.setText(First_name);
            tf_LN.setText(Last_name);
            tf_JT.setText(Job_title);
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_btn_DRActionPerformed

    private void btn_URActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_URActionPerformed
        // TODO add your handling code here:
     String First_Name = tf_FN.getText();
     String Last_Name = tf_LN.getText();
     String Job_Title = tf_JT.getText();
     String ID = tf_id.getText();
     
     int newID = Integer.parseInt (ID);
     try
     {
         rs.updateInt ("ID", newID);
         rs.updateString ("First_Name", First_Name);
         rs.updateString ("Last_Name", Last_Name);
         rs.updateString ("Job_Title", Job_Title);
         rs.updateRow();
         JOptionPane.showMessageDialog (this, "Updated");
     }
     catch (SQLException err)
     {
         System.out.println(err.getMessage());
     }     
    }//GEN-LAST:event_btn_URActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        try
        {
            if(rs.next())
            {
                int id_col = rs.getInt ("ID");
                String id = Integer.toString (id_col);
                String First_Name = rs.getString ("First_Name");
                String Last_Name = rs.getString ("Last_Name");
                String Job_Title = rs.getString ("Job_Title");
                
                tf_id.setText (id);
                tf_FN.setText (First_Name);
                tf_LN.setText (Last_Name);
                tf_JT.setText (Job_Title);
            }
            else
            {
                rs.previous();
                JOptionPane.showMessageDialog(Employees_Form.this, "End of File");
            }
        }
        catch (SQLException err)
        {
            JOptionPane.showMessageDialog (Employees_Form.this, err.getMessage());
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        // TODO add your handling code here:
                 try
        {
            if(rs.previous())
            {
                int id_col = rs.getInt ("ID");
                String id = Integer.toString (id_col);
                String First_Name = rs.getString ("First_Name");
                String Last_Name = rs.getString ("Last_Name");
                String Job_Title = rs.getString ("Job_Title");
                
                tf_id.setText (id);
                tf_FN.setText (First_Name);
                tf_LN.setText (Last_Name);
                tf_JT.setText (Job_Title);
            }
            else
            {
                rs.next();
                JOptionPane.showMessageDialog(Employees_Form.this, "End of File");
            }
        }
        catch (SQLException err)
        {
            JOptionPane.showMessageDialog (Employees_Form.this, err.getMessage());
        }
    }//GEN-LAST:event_btn_prevActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
         try
        {
            if(rs.last())
            {
                int id_col = rs.getInt ("ID");
                String id = Integer.toString (id_col);
                String First_Name = rs.getString ("First_Name");
                String Last_Name = rs.getString ("Last_Name");
                String Job_Title = rs.getString ("Job_Title");
                
                tf_id.setText (id);
                tf_FN.setText (First_Name);
                tf_LN.setText (Last_Name);
                tf_JT.setText (Job_Title);
            }
        }
        catch (SQLException err)
        {
            JOptionPane.showMessageDialog (Employees_Form.this, err.getMessage());
        }
    }//GEN-LAST:event_btn_lastActionPerformed

    private void btn_CRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CRActionPerformed
        // TODO add your handling code here:
        try
        {
            rs.absolute(curRow);
            
            tf_FN.setText(rs.getString("First_Name"));
            tf_LN.setText(rs.getString("Last_Name"));
            tf_JT.setText(rs.getString("Job_Title"));
            tf_id.setText(Integer.toString(rs.getInt("id")));
        }
        catch (SQLException err)
        {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }
        
            btn_first.setEnabled(true);
            btn_prev.setEnabled(true);
            btn_next.setEnabled(true);
            btn_last.setEnabled(true);
            btn_Add.setEnabled(true);
            btn_DR.setEnabled(true);
            btn_UR.setEnabled(true);
            btn_SNR.setEnabled(true);
            btn_CR.setEnabled(true);
    }//GEN-LAST:event_btn_CRActionPerformed

    private void btn_SNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SNRActionPerformed
        // TODO add your handling code here:
     String First_Name = tf_FN.getText();
     String Last_Name = tf_LN.getText();
     String Job_Title = tf_JT.getText();
     String ID = tf_id.getText();
     
     int newID = Integer.parseInt (ID);
     try
     {
         rs.moveToInsertRow();
     
         rs.updateInt ("id", newID);
         rs.updateString ("First_Name", First_Name);
         rs.updateString ("Last_Name", Last_Name);
         rs.updateString ("Job_Title", Job_Title);
         
         rs.insertRow();
         
         stmt.close();
         rs.close();
         
         stmt = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         String SQL = "select * from Workers";
         rs = stmt.executeQuery (SQL);
         
         rs.next();
         int id_col = rs.getInt ("ID");
         String id2 = Integer.toString (id_col);
         String First_Name2 = rs.getString ("First_Name");
         String Last_Name2 = rs.getString ("Last_Name");
         String Job_Title2 = rs.getString ("Job_Title");
         
            btn_first.setEnabled(true);
            btn_prev.setEnabled(true);
            btn_next.setEnabled(true);
            btn_last.setEnabled(true);
            btn_Add.setEnabled(true);
            btn_SNR.setEnabled(true);
            btn_CR.setEnabled(true);
            btn_DR.setEnabled(false);
            btn_UR.setEnabled(false);
            
            JOptionPane.showMessageDialog(this, "Record Saved");
    }
    catch (SQLException err)
    {
        JOptionPane.showMessageDialog(this, err.getMessage());
    }
    }//GEN-LAST:event_btn_SNRActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
            btn_first.setEnabled(false);
            btn_prev.setEnabled(false);
            btn_next.setEnabled(false);
            btn_last.setEnabled(false);
            btn_UR.setEnabled(false);
            btn_DR.setEnabled(false);
            btn_Add.setEnabled(false);
            btn_CR.setEnabled(true);
            btn_SNR.setEnabled(true);
            
            
            tf_FN.setText("");
            tf_LN.setText("");
            tf_JT.setText("");
            tf_id.setText("");
            try
            {
                curRow = rs.getRow();
            }
            catch (SQLException err)
            {
                JOptionPane.showMessageDialog(this, err.getMessage());
            }    
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do You Want To Exit");

        // Close the employees form and open the login form
        // only if confirmed to close.
        if(option == 0) {
            new Login_Form().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btn_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Employees_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_CR;
    private javax.swing.JButton btn_DR;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_SNR;
    private javax.swing.JButton btn_UR;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_prev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_FN;
    private javax.swing.JTextField tf_JT;
    private javax.swing.JTextField tf_LN;
    private javax.swing.JTextField tf_id;
    // End of variables declaration//GEN-END:variables
}
