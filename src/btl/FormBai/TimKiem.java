/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl.FormBai;


import btl.dulieu.ketnoicsdl;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI
 */
public class TimKiem extends javax.swing.JFrame {

    /**
     * Creates new form TimKiem
     */
    public static int quyen;
    public static String us,pw;
    public TimKiem(int q,String tk,String mk){
        initComponents();
        us=tk;
        pw=mk;
        ShowTable();
        Loai();
         quyen=q;
          setLocationRelativeTo(null);
    }
      public int Dem()
    {int dem=0;
        try {
            
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.GetData("tbnhanvien");
            while(rs.next())
            {
                dem++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dem;
    }
     public void ShowTable()
    {
        DefaultTableModel model =(DefaultTableModel)tbNhanVien.getModel();
        model.setRowCount(Dem());
        try {
            
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.GetData("tbnhanvien");
            int i=0;
            while(rs.next())
            {
                tbNhanVien.setValueAt(rs.getString("manv"), i, 0);
                 tbNhanVien.setValueAt(rs.getString("tennv"), i, 1);
                  tbNhanVien.setValueAt(rs.getString("loainv"), i, 2);
                   tbNhanVien.setValueAt(rs.getString("ngaysinh"), i, 3);
                    tbNhanVien.setValueAt(rs.getString("sodienthoai"), i, 4);
                     tbNhanVien.setValueAt(rs.getString("diachi"), i, 5);
                      tbNhanVien.setValueAt(rs.getString("macalam"), i, 6);
                     i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void Loai()
    {
        DefaultComboBoxModel model = (DefaultComboBoxModel)txtLoai.getModel();
        
        try {
            
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.GetData("tbchucvu");
            int i=0;
            while(rs.next())
            {
                model.addElement(rs.getString("loainv"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
                DefaultComboBoxModel model2 = (DefaultComboBoxModel)txtMaCa.getModel();
        
        try {
            
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.GetData("tbcalam");
            int i=0;
            while(rs.next())
            {
                model2.addElement(rs.getString("macalam"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtLoai = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtDiaChi1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMaCa = new javax.swing.JComboBox<>();
        rdCa = new javax.swing.JRadioButton();
        rdTen = new javax.swing.JRadioButton();
        rdLoai = new javax.swing.JRadioButton();
        rdDiaChi = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Tìm Kiếm Nhân Viên");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi Tiết Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tên Nhân Viên");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 57, -1, -1));

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });
        jPanel2.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 234, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Loại Nhân Viên");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 117, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Địa Chỉ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 234, -1));

        txtLoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLoai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtLoaiItemStateChanged(evt);
            }
        });
        jPanel2.add(txtLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 230, -1));

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });
        jPanel2.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });
        jPanel2.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, -1, -1));

        txtDiaChi1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txtDiaChi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 234, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Mã Ca Làm");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtMaCa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaCa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtMaCaItemStateChanged(evt);
            }
        });
        jPanel2.add(txtMaCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 230, -1));

        buttonGroup1.add(rdCa);
        rdCa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdCa.setText("Theo Ca");
        rdCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdCaActionPerformed(evt);
            }
        });
        jPanel2.add(rdCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        buttonGroup1.add(rdTen);
        rdTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdTen.setText("Theo Tên");
        jPanel2.add(rdTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        buttonGroup1.add(rdLoai);
        rdLoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdLoai.setText("Theo Loại");
        rdLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLoaiActionPerformed(evt);
            }
        });
        jPanel2.add(rdLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        buttonGroup1.add(rdDiaChi);
        rdDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdDiaChi.setText("Theo Địa Chỉ");
        rdDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDiaChiActionPerformed(evt);
            }
        });
        jPanel2.add(rdDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 840, 350));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel3.setFocusable(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Loai Nhân Viên", "Ngày Sinh", "Số Điện Thoại", "Địa Chỉ", "Mã Ca Làm"
            }
        ));
        tbNhanVien.setRowHeight(35);
        tbNhanVien.setShowVerticalLines(true);
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 820, 260));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 840, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        // TODO add your handling code here:
        int vitri=tbNhanVien.getSelectedRow();
        
        txtTen.setText((String) tbNhanVien.getValueAt(vitri, 1));
        txtLoai.setSelectedItem((String) tbNhanVien.getValueAt(vitri, 2));
       
        txtDiaChi.setText((String) tbNhanVien.getValueAt(vitri, 5));
        txtMaCa.setSelectedItem((String) tbNhanVien.getValueAt(vitri, 6));

    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void txtMaCaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtMaCaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaCaItemStateChanged

    public int DemTen()
    {int dem=0;
        try {
            
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.TimKiem("tennv",txtTen.getText());
            while(rs.next())
            {
                dem++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dem;
    }
     public void ShowTableTen()
    {
        DefaultTableModel model =(DefaultTableModel)tbNhanVien.getModel();
        model.setRowCount(DemTen());
        try {
            
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.TimKiem("tennv",txtTen.getText());
            int i=0;
            while(rs.next())
            {
                tbNhanVien.setValueAt(rs.getString("manv"), i, 0);
                 tbNhanVien.setValueAt(rs.getString("tennv"), i, 1);
                  tbNhanVien.setValueAt(rs.getString("loainv"), i, 2);
                   tbNhanVien.setValueAt(rs.getString("ngaysinh"), i, 3);
                    tbNhanVien.setValueAt(rs.getString("sodienthoai"), i, 4);
                     tbNhanVien.setValueAt(rs.getString("diachi"), i, 5);
                      tbNhanVien.setValueAt(rs.getString("macalam"), i, 6);
                     i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public int DemLoai()
    {int dem=0;
        try {
             String ma=(String) txtLoai.getSelectedItem();
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.TimKiem("loainv",ma);
            while(rs.next())
            {
                dem++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dem;
    }
     public void ShowTableLoai()
    {
        DefaultTableModel model =(DefaultTableModel)tbNhanVien.getModel();
        model.setRowCount(DemLoai());
        try {
             String ma=(String) txtLoai.getSelectedItem();
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.TimKiem("loainv",ma);
            int i=0;
            while(rs.next())
            {
                tbNhanVien.setValueAt(rs.getString("manv"), i, 0);
                 tbNhanVien.setValueAt(rs.getString("tennv"), i, 1);
                  tbNhanVien.setValueAt(rs.getString("loainv"), i, 2);
                   tbNhanVien.setValueAt(rs.getString("ngaysinh"), i, 3);
                    tbNhanVien.setValueAt(rs.getString("sodienthoai"), i, 4);
                     tbNhanVien.setValueAt(rs.getString("diachi"), i, 5);
                      tbNhanVien.setValueAt(rs.getString("macalam"), i, 6);
                     i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public int DemDiaChi()
    {int dem=0;
        try {
            
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.TimKiem("diachi",txtDiaChi.getText());
            while(rs.next())
            {
                dem++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dem;
    }
     public void ShowTableDiaChi()
    {
        DefaultTableModel model =(DefaultTableModel)tbNhanVien.getModel();
        model.setRowCount(DemDiaChi());
        try {
            
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.TimKiem("diachi",txtDiaChi.getText());
            int i=0;
            while(rs.next())
            {
                tbNhanVien.setValueAt(rs.getString("manv"), i, 0);
                 tbNhanVien.setValueAt(rs.getString("tennv"), i, 1);
                  tbNhanVien.setValueAt(rs.getString("loainv"), i, 2);
                   tbNhanVien.setValueAt(rs.getString("ngaysinh"), i, 3);
                    tbNhanVien.setValueAt(rs.getString("sodienthoai"), i, 4);
                     tbNhanVien.setValueAt(rs.getString("diachi"), i, 5);
                      tbNhanVien.setValueAt(rs.getString("macalam"), i, 6);
                     i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public int DemCa()
    {int dem=0;
        try {
            String ma=(String) txtMaCa.getSelectedItem();
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.TimKiem("macalam",ma);
            while(rs.next())
            {
                dem++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dem;
    }
     public void ShowTableCa()
    {
        DefaultTableModel model =(DefaultTableModel)tbNhanVien.getModel();
        model.setRowCount(DemCa());
        try {
             String ma=(String) txtMaCa.getSelectedItem();
            ketnoicsdl kn= new ketnoicsdl();
            ResultSet rs=kn.TimKiem("macalam",ma);
            int i=0;
            while(rs.next())
            {
                tbNhanVien.setValueAt(rs.getString("manv"), i, 0);
                 tbNhanVien.setValueAt(rs.getString("tennv"), i, 1);
                  tbNhanVien.setValueAt(rs.getString("loainv"), i, 2);
                   tbNhanVien.setValueAt(rs.getString("ngaysinh"), i, 3);
                    tbNhanVien.setValueAt(rs.getString("sodienthoai"), i, 4);
                     tbNhanVien.setValueAt(rs.getString("diachi"), i, 5);
                      tbNhanVien.setValueAt(rs.getString("macalam"), i, 6);
                     i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void TimKiem()
    {
        if(rdTen.isSelected()==true)
        {
            if(DemTen()==0)
            {
                JOptionPane.showMessageDialog(null, "Không Có Nhân Viên Nào Tên Này");
            }
            ShowTableTen();
        }
        if(rdLoai.isSelected())
        {
            if(DemLoai()==0)
            {
                JOptionPane.showMessageDialog(null, "Không Có Nhân Viên Nào Loại Này");
            }
            ShowTableLoai();
        }
        if(rdDiaChi.isSelected()==true)
        {
            if(DemDiaChi()==0)
            {
                JOptionPane.showMessageDialog(null, "Không Có Nhân Viên Nào Địa Chỉ Này");
            }
            ShowTableDiaChi();
        }
        if(rdCa.isSelected())
        {
            if(DemCa()==0)
            {
                JOptionPane.showMessageDialog(null, "Không Có Nhân Viên Nào Ca Này");
            }
            ShowTableCa();
        }
    }
    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        // TODO add your handling code here:
        TimKiem();
        
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void txtLoaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtLoaiItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiItemStateChanged

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        this.dispose();
        FormNhanVien a= new FormNhanVien(quyen,us,pw);
        a.setVisible(true);
    }//GEN-LAST:event_btnThoatMouseClicked

    private void rdCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdCaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdCaActionPerformed

    private void rdLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdLoaiActionPerformed

    private void rdDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdDiaChiActionPerformed

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
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TimKiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdCa;
    private javax.swing.JRadioButton rdDiaChi;
    private javax.swing.JRadioButton rdLoai;
    private javax.swing.JRadioButton rdTen;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDiaChi1;
    private javax.swing.JComboBox<String> txtLoai;
    private javax.swing.JComboBox<String> txtMaCa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}