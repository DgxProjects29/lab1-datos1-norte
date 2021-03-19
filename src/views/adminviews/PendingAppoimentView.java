
package views.adminviews;

import controllers.BaseController;
import controllers.SimpleController;
import inevaup.dialogs.InfoDialog;
import java.io.File;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import models.Appointment;
import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileWriter;


public class PendingAppoimentView extends javax.swing.JPanel {

    private final BaseController controller;
    
    public PendingAppoimentView() {
        initComponents();
        
        PseudoFile pseudoFile = new PseudoFile(
            new File("data/citas_pendientes.csv"), 
            Appointment.getColumns()
        );

        controller = new SimpleController(
            (DefaultTableModel) pending_appo_table.getModel(), 
            pseudoFile
        );
        
        updateTable();
    }
    
    private void updateTable(){
        try {
            controller.updateTable();
        } catch (IOException e) {
            fileExceptionDialog();
        }
    }

    private void fileExceptionDialog(){
        InfoDialog dialog = new InfoDialog(null, "Error", 
            "Un error inesperado acaba de ocurrir", InfoDialog.TypeInfoDialog.ERROR_DIALOG
        );
        dialog.setVisible(true);
    }
    
    private void pickARowDialog(){
        InfoDialog dialog = new InfoDialog(null, "Ninguna fila selecionada", 
            "Por favor seleciona un registro", 
            InfoDialog.TypeInfoDialog.INFO_DIALOG
        );
        dialog.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card_content_layout = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pending_appo_table = new javax.swing.JTable();
        accept_appo = new javax.swing.JButton();

        card_content_layout.setBackground(new java.awt.Color(247, 249, 249));

        pending_appo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idCita", "tipoCita", "empieza", "idMascota", "cedVet"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pending_appo_table);

        accept_appo.setBackground(new java.awt.Color(64, 145, 108));
        accept_appo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        accept_appo.setForeground(new java.awt.Color(255, 255, 255));
        accept_appo.setText("Aceptar cita");
        accept_appo.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 25));
        accept_appo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accept_appo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onAcceptAppoiment(evt);
            }
        });

        javax.swing.GroupLayout card_content_layoutLayout = new javax.swing.GroupLayout(card_content_layout);
        card_content_layout.setLayout(card_content_layoutLayout);
        card_content_layoutLayout.setHorizontalGroup(
            card_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_content_layoutLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(accept_appo)
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_content_layoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        card_content_layoutLayout.setVerticalGroup(
            card_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_content_layoutLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(accept_appo)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(card_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(card_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void onAcceptAppoiment(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onAcceptAppoiment

        int row = pending_appo_table.getSelectedRow();
        if (row != -1){
            try {
                registerAppoiment(row);
                controller.getTableModel().removeRow(row);
                controller.reWriteFile();
            } catch (IOException e) {
                fileExceptionDialog();
            }
            
        }else{
            pickARowDialog();
        }
    }//GEN-LAST:event_onAcceptAppoiment
    
    private void registerAppoiment(int row) throws IOException{
        
        PseudoFile pseudoFile = new PseudoFile(
            new File("data/citas.csv")
        );
        
        String[] appoiment = new String[]{
            (String)controller.getTableModel().getValueAt(row, 0),
            (String)controller.getTableModel().getValueAt(row, 1),
            (String)controller.getTableModel().getValueAt(row, 2),
            (String)controller.getTableModel().getValueAt(row, 3),
            (String)controller.getTableModel().getValueAt(row, 4)
        };
        
        PseudoFileWriter pseudoFileWriter 
            = new PseudoFileWriter(pseudoFile, true);
        pseudoFileWriter.addRegister(appoiment);
        pseudoFileWriter.write();
        pseudoFileWriter.close();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept_appo;
    private javax.swing.JPanel card_content_layout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pending_appo_table;
    // End of variables declaration//GEN-END:variables
}
