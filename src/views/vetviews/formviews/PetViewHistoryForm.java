package views.vetviews.formviews;

import controllers.BaseController;
import forms.Form;
import forms.FormViewHandler;
import forms.PseudoWriterForm;
import forms.registerforms.RegisterPetHistory;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.HashMap;
import pseudofiles.PseudoFile;

public class PetViewHistoryForm extends javax.swing.JDialog {
    
    private int updateRowIndex = -1;
    private BaseController baseController;
    private String appoId;
    
    public PetViewHistoryForm(java.awt.Frame parent, boolean modal) {
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

        diagnostic_textarea.setText(currData.get("diagnostico"));
        prescription_textarea.setText(currData.get("prescripcion"));
        appoId = currData.get("idCita");

        this.updateRowIndex = updateRowIndex;
        accept_form_button.setText("Actualizar cambios");
    }
    
    public void setAppoId(String appoId) {
        this.appoId = appoId;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnostic_textarea = new javax.swing.JEditorPane();
        catalogue_label1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        prescription_textarea = new javax.swing.JEditorPane();
        catalogue_label2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        header.setBackground(new java.awt.Color(45, 106, 79));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setAlignmentY(0.0F);
        header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 15));

        header_title.setBackground(new java.awt.Color(55, 71, 79));
        header_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        header_title.setForeground(new java.awt.Color(255, 255, 255));
        header_title.setText("Registrar Historial de Mascota");
        header.add(header_title);

        jPanel1.setBackground(new java.awt.Color(249, 247, 247));

        accept_form_button.setBackground(new java.awt.Color(64, 145, 108));
        accept_form_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        accept_form_button.setForeground(new java.awt.Color(255, 255, 255));
        accept_form_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-login-24.png"))); // NOI18N
        accept_form_button.setText("Añadir Historial");
        accept_form_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 25));
        accept_form_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accept_form_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onAccpetForm(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(247, 249, 249));
        jPanel3.setLayout(new java.awt.GridLayout(4, 2, 0, 10));

        diagnostic_textarea.setBackground(new java.awt.Color(255, 255, 255));
        diagnostic_textarea.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        diagnostic_textarea.setForeground(new java.awt.Color(33, 33, 33));
        diagnostic_textarea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(diagnostic_textarea);

        catalogue_label1.setBackground(new java.awt.Color(247, 249, 249));
        catalogue_label1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        catalogue_label1.setForeground(new java.awt.Color(33, 33, 33));
        catalogue_label1.setText("Diagnostico:");

        prescription_textarea.setBackground(new java.awt.Color(255, 255, 255));
        prescription_textarea.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        prescription_textarea.setForeground(new java.awt.Color(33, 33, 33));
        prescription_textarea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(prescription_textarea);

        catalogue_label2.setBackground(new java.awt.Color(247, 249, 249));
        catalogue_label2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        catalogue_label2.setForeground(new java.awt.Color(33, 33, 33));
        catalogue_label2.setText("Prescripcion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catalogue_label2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(accept_form_button)
                        .addGap(93, 93, 93))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(catalogue_label1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(catalogue_label1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(catalogue_label2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(accept_form_button)))
                .addContainerGap(71, Short.MAX_VALUE))
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
        Form registerForm = new RegisterPetHistory(
            diagnostic_textarea.getText(), 
            prescription_textarea.getText(),
            appoId
        );

        if(updateRowIndex == -1){
            PseudoFile pseudoFile = new PseudoFile(
                new File("data/historial_mascotas.csv")
            );
            PseudoWriterForm pseudoWriterForm = new PseudoWriterForm(
                registerForm, 
                pseudoFile
            );
            pseudoWriterForm.writeRegister();
        }else{
            FormViewHandler formViewHandler = new FormViewHandler(
                registerForm, baseController
            );
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
            java.util.logging.Logger.getLogger(PetViewHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetViewHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetViewHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetViewHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                PetViewHistoryForm dialog = new PetViewHistoryForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel catalogue_label1;
    private javax.swing.JLabel catalogue_label2;
    private javax.swing.JEditorPane diagnostic_textarea;
    private javax.swing.JPanel header;
    private javax.swing.JLabel header_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JEditorPane prescription_textarea;
    // End of variables declaration//GEN-END:variables

}
