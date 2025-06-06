/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

/**
 *
 * @author Mike
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Създаване на НОВА поръчка");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Търсене на поръчка по ИМЕ на клиент");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Търсене на поръчка по артикул");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Търсене на поръчка по ТЕЛЕФОН на клиент");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Изход + Затваряне");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("Добре Дошли!");

        jButton6.setText("Редактиране на поръчка");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jMenu1.setText("Действия");

        jMenuItem1.setText("Създаване на НОВА поръчка");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Търсене на поръчка по име на клиент");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Търене на поръчка по артикул");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Търсене на поръчка по телефон на клиент");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Connect dbConnection = new Connect();
    Connection conn = dbConnection.conn;
    
    try {
        
        String sqlProducts = "SELECT product_name FROM products";
        dbConnection.stmt = conn.createStatement();
        dbConnection.rs = dbConnection.stmt.executeQuery(sqlProducts);

        
        JComboBox<String> productComboBox = new JComboBox<>();
        while (dbConnection.rs.next()) {
            productComboBox.addItem(dbConnection.rs.getString("product_name"));
        }

        
        JTextField nameField = new JTextField();
        JTextField phoneField = new JTextField();
        JSpinner quantitySpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1)); 
        JTextField priceField = new JTextField();
        JRadioButton deliveryToOffice = new JRadioButton("До офис на куриер");
        JRadioButton deliveryToAddress = new JRadioButton("До адрес на клиента");
        ButtonGroup deliveryGroup = new ButtonGroup();
        deliveryGroup.add(deliveryToOffice);
        deliveryGroup.add(deliveryToAddress);
        JTextField addressField = new JTextField();

        
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Изберете продукт:"));
        panel.add(productComboBox);
        panel.add(new JLabel("Име и Фамилия:"));
        panel.add(nameField);
        panel.add(new JLabel("Телефон:"));
        panel.add(phoneField);
        panel.add(new JLabel("Брой продукти:"));
        panel.add(quantitySpinner);
        panel.add(new JLabel("Цена:"));
        panel.add(priceField);
        panel.add(new JLabel("Метод на доставка:"));
        panel.add(deliveryToOffice);
        panel.add(deliveryToAddress);
        panel.add(new JLabel("Адрес:"));
        panel.add(addressField);

        
        Object[] options = {"Създай", "Отказ"};
        int result = JOptionPane.showOptionDialog(
            null, panel, "Създаване на нова поръчка", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, 
            null, options, options[0]);

        
        if (result == JOptionPane.OK_OPTION) {
            String selectedProduct = (String) productComboBox.getSelectedItem();
            String clientName = nameField.getText().trim();
            String phone = phoneField.getText().trim();
            int quantity = (Integer) quantitySpinner.getValue();
            String price = priceField.getText().trim();
            String deliveryMethod = deliveryToOffice.isSelected() ? "До офис на куриер" : "До адрес на клиента";
            String address = addressField.getText().trim();

            
            if (clientName.isEmpty() || phone.isEmpty() || price.isEmpty() || quantity <= 0 || 
                (!deliveryToOffice.isSelected() && !deliveryToAddress.isSelected()) || address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Моля, попълнете всички задължителни полета!", "Грешка", JOptionPane.ERROR_MESSAGE);
                return;
            }

            
            String sqlInsertOrder = "INSERT INTO orders (product, client_name, phone, quantity, price, delivery_method, address) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sqlInsertOrder);
            pstmt.setString(1, selectedProduct);
            pstmt.setString(2, clientName);
            pstmt.setString(3, phone);
            pstmt.setInt(4, quantity); // Въвеждане на броя продукти
            pstmt.setString(5, price); // Въвеждане на цената
            pstmt.setString(6, deliveryMethod);
            pstmt.setString(7, address); // Запис на адреса независимо от метода за доставка
            pstmt.executeUpdate();

            
            JOptionPane.showMessageDialog(null, "Успешна Поръчка!", "Информация", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Възникна грешка: " + e.getMessage(), "Грешка", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (dbConnection.rs != null) dbConnection.rs.close();
            if (dbConnection.stmt != null) dbConnection.stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        SearchByPhone searchWindow = new SearchByPhone();
        searchWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        SearchByProduct searchWindow = new SearchByProduct();
        searchWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Connect dbConnection = new Connect(); 
    Connection conn = dbConnection.conn;
    
    try {
        
        String sqlProducts = "SELECT product_name FROM products";
        dbConnection.stmt = conn.createStatement();
        dbConnection.rs = dbConnection.stmt.executeQuery(sqlProducts);

        
        JComboBox<String> productComboBox = new JComboBox<>();
        while (dbConnection.rs.next()) {
            productComboBox.addItem(dbConnection.rs.getString("product_name"));
        }

        
        JTextField nameField = new JTextField();
        JTextField phoneField = new JTextField();
        JSpinner quantitySpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1)); 
        JTextField priceField = new JTextField(); 
        JRadioButton deliveryToOffice = new JRadioButton("До офис на куриер");
        JRadioButton deliveryToAddress = new JRadioButton("До адрес на клиента");
        ButtonGroup deliveryGroup = new ButtonGroup();
        deliveryGroup.add(deliveryToOffice);
        deliveryGroup.add(deliveryToAddress);
        JTextField addressField = new JTextField();

        
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Изберете продукт:"));
        panel.add(productComboBox);
        panel.add(new JLabel("Име и Фамилия:"));
        panel.add(nameField);
        panel.add(new JLabel("Телефон:"));
        panel.add(phoneField);
        panel.add(new JLabel("Брой продукти:"));
        panel.add(quantitySpinner);
        panel.add(new JLabel("Цена:"));
        panel.add(priceField); 
        panel.add(new JLabel("Метод на доставка:"));
        panel.add(deliveryToOffice);
        panel.add(deliveryToAddress);
        panel.add(new JLabel("Адрес:"));
        panel.add(addressField);

        
        Object[] options = {"Създай", "Отказ"};
        int result = JOptionPane.showOptionDialog(
            null, panel, "Създаване на нова поръчка", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, 
            null, options, options[0]);

        
        if (result == JOptionPane.OK_OPTION) {
            String selectedProduct = (String) productComboBox.getSelectedItem();
            String clientName = nameField.getText().trim();
            String phone = phoneField.getText().trim();
            int quantity = (Integer) quantitySpinner.getValue(); 
            String price = priceField.getText().trim(); 
            String deliveryMethod = deliveryToOffice.isSelected() ? "До офис на куриер" : "До адрес на клиента";
            String address = addressField.getText().trim();

            
            if (clientName.isEmpty() || phone.isEmpty() || price.isEmpty() || quantity <= 0 || 
                (!deliveryToOffice.isSelected() && !deliveryToAddress.isSelected()) || address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Моля, попълнете всички задължителни полета!", "Грешка", JOptionPane.ERROR_MESSAGE);
                return;
            }

            
            String sqlInsertOrder = "INSERT INTO orders (product, client_name, phone, quantity, price, delivery_method, address) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sqlInsertOrder);
            pstmt.setString(1, selectedProduct);
            pstmt.setString(2, clientName);
            pstmt.setString(3, phone);
            pstmt.setInt(4, quantity); 
            pstmt.setString(5, price); 
            pstmt.setString(6, deliveryMethod);
            pstmt.setString(7, address); 
            pstmt.executeUpdate();

            
            JOptionPane.showMessageDialog(null, "Успешна Поръчка!", "Информация", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Възникна грешка: " + e.getMessage(), "Грешка", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (dbConnection.rs != null) dbConnection.rs.close();
            if (dbConnection.stmt != null) dbConnection.stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        SearchByName searchWindow = new SearchByName();
        searchWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SearchByPhone searchWindow = new SearchByPhone();
        searchWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        EditOrder searchWindow = new EditOrder();
        searchWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        SearchByName searchWindow = new SearchByName();
        searchWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        SearchByProduct searchWindow = new SearchByProduct();
        searchWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
