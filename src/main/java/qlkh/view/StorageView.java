
package qlkh.view;

//import com.raven.radial_menu.EventRadialMenu;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import qlkh.entity.Storage;
import qlkh.utils.ExportarExcel;
import swing.tabledark.TableDark;
import swing.textfield.TextField;

/**
 *
 * @author Admin
 */
public class StorageView extends javax.swing.JFrame {

    /**
     * Creates new form StorageView
     */
    public StorageView() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new swing.combobox.Combobox();
        delButton = new swing.button.ButtonGradient();
        editButton = new swing.button.ButtonGradient();
        addButton = new swing.button.ButtonGradient();
        jLabel3 = new javax.swing.JLabel();
        cancelSearch = new swing.button.ButtonGradient();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new swing.tabledark.TableDark();
        textField1 = new swing.textfield.TextField();
        buttonGradient1 = new swing.button.ButtonGradient();
        searchButton1 = new swing.button.ButtonGradient();
        sortBtn = new swing.button.ButtonGradient();
        ChartButton = new swing.button.ButtonGradient();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon("src/main/java/Images/AppIcon.jpg").getImage());
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("__");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, -10, 40, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 29));

        jComboBox1.setBackground(new Color(0,0,0,10));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mã hàng", "Tên hàng", "Đơn vị", "Giá" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setLabeText("Tìm kiếm/ Sắp xếp");
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 40));

        delButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delButton.setForeground(new java.awt.Color(255, 102, 102));
        delButton.setText("Xóa");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });
        getContentPane().add(delButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 130, 40));
        //delButton.setOpaque(false);
        //delButton.setBackground(new java.awt.Color(0, 204, 204));
        //
        //delButton.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        //
        //delButton.setForeground(new java.awt.Color(255, 255, 255));
        //delButton.setBorder(new RoundedBorder(20));
        //delButton.setText("<html><font color = rgb(240, 99, 71)>Xóa</font></html>");

        editButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(204, 255, 255));
        editButton.setText("Sửa");
        editButton.setBorderPainted(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 130, 40));
        //editButton.setOpaque(false);
        //editButton.setBackground(new java.awt.Color(0, 204, 204));
        //
        //editButton.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        //
        //editButton.setForeground(new java.awt.Color(255, 255, 255));
        //editButton.setBorder(new RoundedBorder(20));
        //editButton.setText("<html><font color = white>Sửa</font></html>");

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(102, 255, 153));
        addButton.setText("Thêm");
        addButton.setActionCommand("Thêm ");
        addButton.setBorder(new RoundedBorder(20));
        addButton.setBorderPainted(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        addButton.setDefaultCapable(false);
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 40));
        //addButton.setOpaque(false);
        ////addButton.setBackground(new java.awt.Color(0, 204, 204));
        //
        //addButton.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        //
        //addButton.setForeground(new java.awt.Color(255, 255, 255));
        //addButton.setColor1(new Color(132,211,255));
        //addButton.setColor2(new Color(235,235,235));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 118, 211));
        jLabel3.setText("QUẢN LÝ KHO HÀNG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 300, 40));

        cancelSearch.setText("Hủy");
        cancelSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(cancelSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 80, 30));
        cancelSearch.setColor1(new Color(153,255,255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hàng", "Tên hàng", "Đơn vị", "Số lượng", "Giá"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        jTable1.fixTable(jScrollPane2);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setMinWidth(360);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(360);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(500);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(60);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 760, 370));
        getContentPane().add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 40));

        buttonGradient1.setText("Xuất File Excel");
        buttonGradient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 130, 30));
        buttonGradient1.setColor1(new Color(0,204,102));

        searchButton1.setText("Tìm kiếm");
        searchButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(searchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 100, 30));
        searchButton1.setColor2(new Color(153,255,255));

        sortBtn.setText("Sắp xếp");
        sortBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(sortBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 90, 30));
        sortBtn.setColor2(new Color(91,189,233));
        sortBtn.setColor1(new Color(91,189,233));

        ChartButton.setLabel("Biểu đồ");
        getContentPane().add(ChartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 140, 30));

        jLabel1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jLabel1AncestorResized(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 580));
        EnabledFalse();
        jLabel1.setIcon(new ImageIcon("src/main/java/Images/BG.jpg"));

        setSize(new java.awt.Dimension(1000, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delButtonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel1AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jLabel1AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorResized

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
   
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
        this.setExtendedState(StorageView.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed

    private void buttonGradient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient1ActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_buttonGradient1ActionPerformed

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
            java.util.logging.Logger.getLogger(StorageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StorageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StorageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StorageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StorageView().setVisible(true);
              
            }
        });
    }
    public String getSearchItem(){
        return textField1.getText().trim();
    }
    public String getComboBoxSeachVal(){
        if (jComboBox1.getSelectedItem()==null) return "";
        else return jComboBox1.getSelectedItem().toString().trim();
    }
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    public void showListStorage(List<Storage> list) {
        int size = list.size();
        // với bảng studentTable có 5 cột, 
        // khởi tạo mảng 2 chiều students, trong đó:
        // số hàng: là kích thước của list student 
        // số cột: là 5
        Object [][] storage = new Object[size][5];
        for (int i = 0; i < size; i++) {
            storage[i][0] = list.get(i).getId();
            storage[i][1] = list.get(i).getName();
            storage[i][2] = list.get(i).getUnit();
            storage[i][3] = list.get(i).getQuantity();
            storage[i][4] = list.get(i).getPrice();
        }
        jTable1.setModel(new DefaultTableModel(storage, columnNames));
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setMinWidth(360);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(360);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(500);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(60);
}
    }

    public class RoundedBorder implements Border {

            private int radius;


            RoundedBorder(int radius) {
                this.radius = radius;
            }


            public Insets getBorderInsets(Component c) {
                return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
                }


            public boolean isBorderOpaque() {
                return true;
                }


            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                g.drawRoundRect(x, y, width-1, height-1, radius, radius);
            }
}
     public EditView view = new EditView();
     private String [] columnNames = new String [] {
            "Mã hàng", "Tên hàng", "Đơn vị", "Số lượng", "Giá/Đơn vị"};
      private Object data = new Object [][] {};
      
      public void setEditView(EditView ed){
          this.view = ed;
      }
       public void fillStorageFromSelectedRow() {
        // lấy chỉ số của hàng được chọn 
        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            view.setIdFieldText(jTable1.getModel().getValueAt(row, 0).toString());
            view.setNameFieldText(jTable1.getModel().getValueAt(row, 1).toString());
            view.setUnitFieldText(jTable1.getModel().getValueAt(row, 2).toString());
            view.setQuantityFieldText(jTable1.getModel().getValueAt(row, 3).toString());
            view.setPriceFieldText(jTable1.getModel().getValueAt(row, 4).toString());
            // enable Edit and Delete buttons
//            editButton.setEnabled(true);
//            delButton.setEnabled(true);
//            // disable Add button
//            addButton.setEnabled(false);
        }
    }
       public void clearSearch(){
           textField1.setText("");
       }
       public void EnabledFalse(){
            addButton.setEnabled(true);
            editButton.setEnabled(false);
            delButton.setEnabled(false);
       }
       public void EnabledTrue(){
            addButton.setEnabled(true);
            editButton.setEnabled(true);
            delButton.setEnabled(true);
       }
       public void clearStorageInfo() {
            view.setIdFieldText("");
            view.setNameFieldText("");
            view.setUnitFieldText("");
            view.setQuantityFieldText("");
            view.setPriceFieldText("");
            addButton.setEnabled(true);
            editButton.setEnabled(false);
            delButton.setEnabled(false);
        // disable Edit and Delete buttons
//        editStudentBtn.setEnabled(false);
//        deleteStudentBtn.setEnabled(false);
//        // enable Add button
//        addStudentBtn.setEnabled(true);
    }
       public void clearStorageInfoNotID() {
            view.setNameFieldText("");
            view.setUnitFieldText("");
            view.setQuantityFieldText("");
            view.setPriceFieldText("");
            addButton.setEnabled(true);
            editButton.setEnabled(false);
            delButton.setEnabled(false);
        // disable Edit and Delete buttons
//        editStudentBtn.setEnabled(false);
//        deleteStudentBtn.setEnabled(false);
//        // enable Add button
//        addStudentBtn.setEnabled(true);
    }
       public void showStorage(Storage st) {
        view.setIdFieldText("" + st.getId());
        view.setIdFieldText(st.getName());
        view.setIdFieldText(st.getUnit());
        view.setIdFieldText("" + st.getQuantity());
        view.setIdFieldText("" + st.getPrice());
        // enable Edit and Delete buttons
//        editStudentBtn.setEnabled(true);
//        deleteStudentBtn.setEnabled(true);
//        // disable Add button
//        addStudentBtn.setEnabled(false);
    }
       
       public Storage getStorageInfo() {
        // validate student
       return view.getStorageInfo();
    }
       public void actionPerformed(ActionEvent e) {
    }
    
    public void valueChanged(ListSelectionEvent e) {
    }
    
    public void addAddListener(ActionListener listener) {
        addButton.addActionListener(listener);
        
    }
    
    public void addEditListener(ActionListener listener) {
        editButton.addActionListener(listener);
    }
    
    public void addSearchListener(ActionListener listener) {
        searchButton1.addActionListener(listener);
    }
    
    public void addDeleteListener(ActionListener listener) {
        delButton.addActionListener(listener);
    }
    
    public void addChartListener(ActionListener listener) {
        ChartButton.addActionListener(listener);
    }
     public void addSortListener(ActionListener listener) {
        sortBtn.addActionListener(listener);
    }
    
    public void addToExcelListenner(ActionListener listener){
        buttonGradient1.addActionListener(listener);
    }
    
    public void addSearchCanceltener(ActionListener listener) {
       cancelSearch.addActionListener(listener);
    }
    
    public void addListSelectionListener(ListSelectionListener listener) {
        jTable1.getSelectionModel().addListSelectionListener(listener);
    }
    
    public void addClearListener(ActionListener listener) {
        if (view!=null)
        view.addClearListener(listener);
    }
     public void addConfirmListener(ActionListener listener) {
         if (view!=null)
        view.addConfirmListener(listener);
    }
     public void addCancelListener(ActionListener listener) {
         if (view!=null)
        view.addCancelListener(listener);
    }
     
    
      public class RoundJTextField extends JTextField {
    private Shape shape;
    public RoundJTextField(int size) {
        super(size);
        setOpaque(false); // As suggested by @AVD in comment.
    }
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
         g.setColor(new Color(49,86,155));
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
    }
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds())) {
             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         }
         return shape.contains(x, y);
    }
}
      public JTable getTable(){
          return this.jTable1;
      }
     
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.button.ButtonGradient ChartButton;
    private javax.swing.JButton addButton;
    private swing.button.ButtonGradient buttonGradient1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private swing.button.ButtonGradient cancelSearch;
    private javax.swing.JButton delButton;
    private javax.swing.JButton editButton;
    private swing.combobox.Combobox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.tabledark.TableDark jTable1;
    private swing.button.ButtonGradient searchButton1;
    private swing.button.ButtonGradient sortBtn;
    private swing.textfield.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
