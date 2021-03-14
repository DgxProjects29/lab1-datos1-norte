package adminviews.formviews;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.HashMap;

import controllers.BaseController;
import registerforms.RegisterProvider;
import forms.Form;
import forms.FormViewHandler;

public class ProviderViewForm extends javax.swing.JDialog {

    private int updateRowIndex = -1;
    private BaseController baseController;

    public ProviderViewForm(java.awt.Frame parent, boolean modal) {
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

        code_field.setText(currData.get("codigo"));
        name_field.setText(currData.get("nombre"));
        email_field.setText(currData.get("email")); 
        tel_field.setText(currData.get("telefono"));

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
        code_field = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        emai_label = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        tel_label = new javax.swing.JLabel();
        tel_field = new javax.swing.JTextField();

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
        jPanel3.setLayout(new java.awt.GridLayout(4, 2, 0, 10));

        code_label.setBackground(new java.awt.Color(247, 249, 249));
        code_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        code_label.setForeground(new java.awt.Color(33, 33, 33));
        code_label.setText("Codigo:");
        jPanel3.add(code_label);

        code_field.setBackground(new java.awt.Color(255, 255, 255));
        code_field.setColumns(15);
        code_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        code_field.setForeground(new java.awt.Color(33, 33, 33));
        code_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        code_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        code_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        code_field.setName(""); // NOI18N
        jPanel3.add(code_field);

        name_label.setBackground(new java.awt.Color(247, 249, 249));
        name_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_label.setForeground(new java.awt.Color(33, 33, 33));
        name_label.setText("Nombre:");
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
        emai_label.setText("Correo:");
        jPanel3.add(emai_label);

        email_field.setBackground(new java.awt.Color(255, 255, 255));
        email_field.setColumns(15);
        email_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        email_field.setForeground(new java.awt.Color(33, 33, 33));
        email_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        email_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        email_field.setName(""); // NOI18N
        jPanel3.add(email_field);

        tel_label.setBackground(new java.awt.Color(247, 249, 249));
        tel_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tel_label.setForeground(new java.awt.Color(33, 33, 33));
        tel_label.setText("Telefono");
        jPanel3.add(tel_label);

        tel_field.setBackground(new java.awt.Color(255, 255, 255));
        tel_field.setColumns(15);
        tel_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tel_field.setForeground(new java.awt.Color(33, 33, 33));
        tel_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tel_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        tel_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        tel_field.setName(""); // NOI18N
        jPanel3.add(tel_field);

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
                .addContainerGap(136, Short.MAX_VALUE))
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
        Form registerForm = new RegisterProvider(
                code_field.getText(), 
                name_field.getText(), 
                email_field.getText(), 
                tel_field.getText()
        );
        FormViewHandler formViewHandler = new FormViewHandler(
            registerForm, baseController
        );

        if(updateRowIndex == -1){
            formViewHandler.writeRegister();
        }else{
            formViewHandler.updateRegister(updateRowIndex);
        }
        /* PseudoWriterForm pseudoWriterForm = 
            new PseudoWriterForm(registerForm, pseudoFile);
        pseudoWriterForm.writeRegister(); */
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
            java.util.logging.Logger.getLogger(ProviderViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProviderViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProviderViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProviderViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProviderViewForm dialog = new ProviderViewForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField code_field;
    private javax.swing.JLabel code_label;
    private javax.swing.JLabel emai_label;
    private javax.swing.JTextField email_field;
    private javax.swing.JPanel header;
    private javax.swing.JLabel header_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField tel_field;
    private javax.swing.JLabel tel_label;
    // End of variables declaration//GEN-END:variables
}
