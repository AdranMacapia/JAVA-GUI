/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adrian
 */
public class Employee_List extends javax.swing.JFrame {
    /**
     * The SQL connection.
     */
    Connection connection;
    
    /**
     * The SQL statement for the employee list.
     */
    Statement statement;
    
    /**
     * The SQL result set for the employee list.
     */
    ResultSet resultSet;

    /**
     * Creates new form Employee_List
     */
    public Employee_List() {
        initComponents();
        loadEmployeeData();
    }

    /**
     * Closes up all the database connection
     * before disposing the frame.
     */
    @Override
    public void dispose() {
        try {
            if(statement != null) {
                statement.close();
            }
            
            if(resultSet != null) {
                resultSet.close();
            }
        } catch(SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }

        super.dispose();
    }
    
    /**
     * Method to load data from the database into the JTable.
     */
    private void loadEmployeeData() {
        String url ="jdbc:derby://localhost:1527/C:/BSCS_C2021_Group16";
        String user = "APP";
        String password = "admin1";

        String query = "SELECT id, first_name, last_name, job_title FROM Workers";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            // Get the table model
            DefaultTableModel model = (DefaultTableModel) employeeListTable.getModel();

            // Clear any existing rows
            model.setRowCount(0);

            // Iterate through the ResultSet and add rows to the table model
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("First_Name");
                String lastName = resultSet.getString("Last_Name");
                String jobTitle = resultSet.getString("Job_Title");

                model.addRow(new Object[]{id, firstName, lastName, jobTitle});
            }
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
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

        employeeListPanel = new javax.swing.JPanel();
        employeeListScrollPane = new javax.swing.JScrollPane();
        employeeListTable = new javax.swing.JTable();
        employeeListHeaderPanel = new javax.swing.JPanel();
        employeeListHeaderLabel = new javax.swing.JLabel();
        headerBackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(550, 350));
        setResizable(false);

        employeeListPanel.setBackground(new java.awt.Color(255, 255, 255));

        employeeListScrollPane.setMinimumSize(new java.awt.Dimension(550, 320));
        employeeListScrollPane.setPreferredSize(new java.awt.Dimension(550, 320));
        employeeListScrollPane.setRequestFocusEnabled(false);

        employeeListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Job Title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeListTable.setGridColor(new java.awt.Color(255, 255, 255));
        employeeListTable.setRowSelectionAllowed(false);
        employeeListTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        employeeListScrollPane.setViewportView(employeeListTable);

        javax.swing.GroupLayout employeeListPanelLayout = new javax.swing.GroupLayout(employeeListPanel);
        employeeListPanel.setLayout(employeeListPanelLayout);
        employeeListPanelLayout.setHorizontalGroup(
            employeeListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(employeeListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(employeeListScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        employeeListPanelLayout.setVerticalGroup(
            employeeListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(employeeListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(employeeListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        employeeListHeaderPanel.setBackground(new java.awt.Color(225, 78, 66));

        employeeListHeaderLabel.setBackground(new java.awt.Color(255, 255, 255));
        employeeListHeaderLabel.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        employeeListHeaderLabel.setText("Employee list");

        headerBackBtn.setText("Go back");
        headerBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headerBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout employeeListHeaderPanelLayout = new javax.swing.GroupLayout(employeeListHeaderPanel);
        employeeListHeaderPanel.setLayout(employeeListHeaderPanelLayout);
        employeeListHeaderPanelLayout.setHorizontalGroup(
            employeeListHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeListHeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeeListHeaderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(headerBackBtn)
                .addContainerGap())
        );
        employeeListHeaderPanelLayout.setVerticalGroup(
            employeeListHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeListHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(employeeListHeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(headerBackBtn))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(employeeListHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(employeeListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(employeeListHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 320, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(employeeListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void headerBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headerBackBtnActionPerformed
        new Transactions().setVisible(true);
        dispose();
    }//GEN-LAST:event_headerBackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel employeeListHeaderLabel;
    private javax.swing.JPanel employeeListHeaderPanel;
    private javax.swing.JPanel employeeListPanel;
    private javax.swing.JScrollPane employeeListScrollPane;
    private javax.swing.JTable employeeListTable;
    private javax.swing.JButton headerBackBtn;
    // End of variables declaration//GEN-END:variables
}
