package views.adminviews.formviews;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.HashMap;

import controllers.BaseController;
import forms.registerforms.RegisterAppointmentType;
import forms.Form;
import forms.FormViewHandler;

public class AppoTypeViewForm extends javax.swing.JDialog {

    private int updateRowIndex = -1;
    private BaseController baseController;

    public AppoTypeViewForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        centreWindow();
    }
    
    private void centreWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y - 25);
    }

    public void setFields(HashMap<String, String> currData, int updateRowIndex){

        type_field.setText(currData.get("tipo"));
        name_field.setText(currData.get("nombre"));
        time_field.setText(currData.get("tiempo")); 
        hourprice_field.setText(currData.get("precioHora"));
        price_field.setText(currData.get("precio"));

        this.updateRowIndex = updateRowIndex;
        accept_form_button.setText("Actualizar cambios");
    }

    public void setBaseController(BaseController baseController) {
        this.baseController = baseController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        header_title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        accept_form_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        code_label = new javax.swing.JLabel();
        type_field = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        emai_label = new javax.swing.JLabel();
        time_field = new javax.swing.JTextField();
        tel_label = new javax.swing.JLabel();
        hourprice_field = new javax.swing.JTextField();
        tel_label1 = new javax.swing.JLabel();
        price_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        header.setBackground(new java.awt.Color(45, 106, 79));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setAlignmentY(0.0F);
        header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 15));

        header_title.setBackground(new java.awt.Color(55, 71, 79));
        header_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        header_title.setForeground(new java.awt.Color(255, 255, 255));
        header_title.setText("Registrar Provedor");
        header.add(header_title);

        jPanel1.setBackground(new java.awt.Color(249, 247, 247));

        accept_form_button.setBackground(new java.awt.Color(64, 145, 108));
        accept_form_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        accept_form_button.setForeground(new java.awt.Color(255, 255, 255));
        accept_form_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-login-24.png"))); // NOI18N
        accept_form_button.setText("Añadir Provedor");
        accept_form_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 25));
        accept_form_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accept_form_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onAccpetForm(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(247, 249, 249));
        jPanel3.setLayout(new java.awt.GridLayout(5, 2, 0, 10));

        code_label.setBackground(new java.awt.Color(247, 249, 249));
        code_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        code_label.setForeground(new java.awt.Color(33, 33, 33));
        code_label.setText("tipo:");
        jPanel3.add(code_label);

        type_field.setBackground(new java.awt.Color(255, 255, 255));
        type_field.setColumns(15);
        type_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        type_field.setForeground(new java.awt.Color(33, 33, 33));
        type_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        type_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        type_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        type_field.setName(""); // NOI18N
        jPanel3.add(type_field);

        name_label.setBackground(new java.awt.Color(247, 249, 249));
        name_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_label.setForeground(new java.awt.Color(33, 33, 33));
        name_label.setText("nombre:");
        jPanel3.add(name_label);

        name_field.setBackground(new java.awt.Color(255, 255, 255));
        name_field.setColumns(15);
        name_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name_field.setForeground(new java.awt.Color(33, 33, 33));
        name_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        name_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        name_field.setName(""); // NOI18N
        jPanel3.add(name_field);

        emai_label.setBackground(new java.awt.Color(247, 249, 249));
        emai_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emai_label.setForeground(new java.awt.Color(33, 33, 33));
        emai_label.setText("tiempo:");
        jPanel3.add(emai_label);

        time_field.setBackground(new java.awt.Color(255, 255, 255));
        time_field.setColumns(15);
        time_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        time_field.setForeground(new java.awt.Color(33, 33, 33));
        time_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        time_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        time_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        time_field.setName(""); // NOI18N
        jPanel3.add(time_field);

        tel_label.setBackground(new java.awt.Color(247, 249, 249));
        tel_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tel_label.setForeground(new java.awt.Color(33, 33, 33));
        tel_label.setText("precioHora:");
        jPanel3.add(tel_label);

        hourprice_field.setBackground(new java.awt.Color(255, 255, 255));
        hourprice_field.setColumns(15);
        hourprice_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hourprice_field.setForeground(new java.awt.Color(33, 33, 33));
        hourprice_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        hourprice_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        hourprice_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        hourprice_field.setName(""); // NOI18N
        jPanel3.add(hourprice_field);

        tel_label1.setBackground(new java.awt.Color(247, 249, 249));
        tel_label1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tel_label1.setForeground(new java.awt.Color(33, 33, 33));
        tel_label1.setText("precio:");
        jPanel3.add(tel_label1);

        price_field.setBackground(new java.awt.Color(255, 255, 255));
        price_field.setColumns(15);
        price_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        price_field.setForeground(new java.awt.Color(33, 33, 33));
        price_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        price_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        price_field.setName(""); // NOI18N
        jPanel3.add(price_field);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(accept_form_button)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(accept_form_button)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onAccpetForm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onAccpetForm
        Form registerForm = new RegisterAppointmentType(
                type_field.getText(), 
                name_field.getText(), 
                time_field.getText(), 
                hourprice_field.getText(),
                price_field.getText()
        );
        FormViewHandler formViewHandler = new FormViewHandler(
            registerForm, baseController
        );

        if(updateRowIndex == -1){
            formViewHandler.writeRegister();
        }else{
            formViewHandler.updateRegister(updateRowIndex);
        }
    }//GEN-LAST:event_onAccpetForm

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
            java.util.logging.Logger.getLogger(AppoTypeViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppoTypeViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppoTypeViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppoTypeViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AppoTypeViewForm dialog = new AppoTypeViewForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept_form_button;
    private javax.swing.JLabel code_label;
    private javax.swing.JLabel emai_label;
    private javax.swing.JPanel header;
    private javax.swing.JLabel header_title;
    private javax.swing.JTextField hourprice_field;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField price_field;
    private javax.swing.JLabel tel_label;
    private javax.swing.JLabel tel_label1;
    private javax.swing.JTextField time_field;
    private javax.swing.JTextField type_field;
    // End of variables declaration//GEN-END:variables
}