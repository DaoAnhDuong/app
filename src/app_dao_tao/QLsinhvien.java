/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_dao_tao;

import Class.Sinhvien;
import Modify.SinhvienModify;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class QLsinhvien extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    List<Sinhvien> studentList = new ArrayList<>();
    private int selectedindex;

    /**
     * Creates new form QLsinhvien
     */
    public QLsinhvien() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icon/main.png")).getImage());
        setTitle("HUS-App");
        tableModel = (DefaultTableModel) student.getModel();
        showStudent();
        /* student.addMouseListener(new MouseListener () {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(student.getSelectedRowCount());
               selectedindex=student.getSelectedRowCount();
                 //System.out.println(selectedindex);
        if(selectedindex>=0)
        {
            msvText.setText(studentList.get(selectedindex).getMaSinhVien());
            hovatenTtext.setText(studentList.get(selectedindex).getHoVaTen());
            ngaysinhText.setText(studentList.get(selectedindex).getNgaySinh());
           diachiText.setText(studentList.get(selectedindex).getDiaChi());
            gioitinhCombo.setSelectedItem(studentList.get(selectedindex).getGioiTinh());
        }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
            }
        }  );*/
    }

    private void showStudent() {
        studentList = SinhvienModify.findAll();

        tableModel.setRowCount(0);

        studentList.forEach(sinhvien -> {
            tableModel.addRow(new Object[]{sinhvien.getMaSinhVien(), sinhvien.getHoVaTen(), sinhvien.getNgaySinh(), sinhvien.getDiaChi(), sinhvien.getGioiTinh()});
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        hovatenTtext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        msvText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gioitinhCombo = new javax.swing.JComboBox<>();
        luuButton = new javax.swing.JButton();
        suaButton = new javax.swing.JButton();
        xoaButton = new javax.swing.JButton();
        lammoiButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        diachiText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        timkiemField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ngaysinhText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("                              QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                .addGap(144, 144, 144))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("Họ và tên");

        jLabel3.setText("Ngày Sinh");

        jLabel4.setText("Mã Sinh Viên ");

        jLabel5.setText("Giới tính");

        gioitinhCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "bê đê" }));
        gioitinhCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gioitinhComboActionPerformed(evt);
            }
        });

        luuButton.setBackground(new java.awt.Color(255, 51, 51));
        luuButton.setText("Lưu ");
        luuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuButtonActionPerformed(evt);
            }
        });

        suaButton.setBackground(new java.awt.Color(0, 255, 0));
        suaButton.setText("Sửa");
        suaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaButtonActionPerformed(evt);
            }
        });

        xoaButton.setBackground(new java.awt.Color(0, 255, 255));
        xoaButton.setText("Xóa");
        xoaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaButtonActionPerformed(evt);
            }
        });

        lammoiButton.setText("Làm mới");
        lammoiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lammoiButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Địa chỉ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logout_100px.png"))); // NOI18N
        exitLabel.setText("jLabel9");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setText("Tìm Kiếm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setText("(Tìm kiếm sinh viên theo mã sinh viên)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gioitinhCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msvText)
                    .addComponent(hovatenTtext)
                    .addComponent(diachiText, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(ngaysinhText))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(luuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xoaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lammoiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(182, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                        .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timkiemField, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(timkiemField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(msvText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(hovatenTtext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(luuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lammoiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ngaysinhText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(diachiText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(gioitinhCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );

        student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Sinh Viên", "Họ và Tên", "Ngày Sinh", "Địa chỉ", "Giới tính"
            }
        ));
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentMousePressed(evt);
            }
        });
        student.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studentKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(student);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(timkiemField.getText().length()>0)
       {
           studentList=SinhvienModify.findbyMSV(timkiemField.getText());
           showStudent();
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
        dispose();
        new MainAdmin().setVisible(true);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void lammoiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lammoiButtonActionPerformed
        msvText.setText("");
        hovatenTtext.setText("");
        ngaysinhText.setText("");
        diachiText.setText("");
        gioitinhCombo.setSelectedIndex(0);
    }//GEN-LAST:event_lammoiButtonActionPerformed

    private void gioitinhComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gioitinhComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gioitinhComboActionPerformed

    private void luuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuButtonActionPerformed
        String msv = msvText.getText();
        String hovaten = hovatenTtext.getText();
        String ngaysinh = ngaysinhText.getText();
        String diachi = diachiText.getText();
        String gioitinh = gioitinhCombo.getSelectedItem().toString();

        Sinhvien std = new Sinhvien(msv, hovaten, ngaysinh, diachi, gioitinh);

        SinhvienModify.insert(std);

        showStudent();
        msvText.setText("");
        hovatenTtext.setText("");
        ngaysinhText.setText("");
        diachiText.setText("");
        gioitinhCombo.setSelectedIndex(0);
    }//GEN-LAST:event_luuButtonActionPerformed

    private void xoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaButtonActionPerformed

        
        if (student.getSelectedRow() >= 0) {
            Sinhvien std = studentList.get(student.getSelectedRow());
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete?", "thông báo", JOptionPane.YES_NO_OPTION);
            System.out.println("option: " + option);
            if (option == 0) {
                SinhvienModify.delete(std.getMaSinhVien());
                showStudent();
            }
        }

    }//GEN-LAST:event_xoaButtonActionPerformed

    private void suaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaButtonActionPerformed
        if(student.getSelectedRow() >= 0){
        String msv = msvText.getText();
        String hovaten = hovatenTtext.getText();
        String ngaysinh = ngaysinhText.getText();
        String diachi = diachiText.getText();
        String gioitinh = gioitinhCombo.getSelectedItem().toString();

        Sinhvien std = new Sinhvien(msv, hovaten, ngaysinh, diachi, gioitinh);

        SinhvienModify.update(std);

        showStudent();}
    }//GEN-LAST:event_suaButtonActionPerformed

    private void studentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentKeyPressed
        

     }//GEN-LAST:event_studentKeyPressed

    private void studentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMousePressed
        System.out.println(student.getSelectedRow());
        msvText.setText(student.getValueAt(student.getSelectedRow(), 0).toString());
        hovatenTtext.setText(student.getValueAt(student.getSelectedRow(), 1).toString());
        ngaysinhText.setText(student.getValueAt(student.getSelectedRow(), 2).toString());
      diachiText.setText(student.getValueAt(student.getSelectedRow(), 3).toString());
        gioitinhCombo.setSelectedItem(student.getValueAt(student.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_studentMousePressed

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
            java.util.logging.Logger.getLogger(QLsinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLsinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLsinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLsinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new QLsinhvien().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diachiText;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JComboBox<String> gioitinhCombo;
    private javax.swing.JTextField hovatenTtext;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lammoiButton;
    private javax.swing.JButton luuButton;
    private javax.swing.JTextField msvText;
    private javax.swing.JTextField ngaysinhText;
    private javax.swing.JTable student;
    private javax.swing.JButton suaButton;
    private javax.swing.JTextField timkiemField;
    private javax.swing.JButton xoaButton;
    // End of variables declaration//GEN-END:variables
}
