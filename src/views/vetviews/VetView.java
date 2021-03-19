package views.vetviews;

import views.authviews.ProfileView;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;


public class VetView extends javax.swing.JFrame {

    private CardLayout card_layout;
    
    
    public VetView() {
        initComponents();
        
        startCardLayout();
        centreWindow();
    }
    
    private void centreWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y - 25);
    }
    
    private void startCardLayout(){
    
        ProfileView vetProfile = new ProfileView();
        VetAppoimentView vetAppoimentView = new VetAppoimentView();
        PetHistoryView petHistoryView = new PetHistoryView();
        
        card_layout = (CardLayout) (card_content_layout.getLayout());
        card_content_layout.add(vetProfile, "vetProfile");
        card_content_layout.add(vetAppoimentView, "vetAppoimentView");
        card_content_layout.add(petHistoryView, "petHistoryView");
        
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
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        profile_button = new javax.swing.JButton();
        appoiment_button = new javax.swing.JButton();
        pet_button = new javax.swing.JButton();
        reviews_button = new javax.swing.JButton();
        card_content_layout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 249, 249));

        header.setBackground(new java.awt.Color(45, 106, 79));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setAlignmentY(0.0F);
        header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 40, 30));

        header_title.setBackground(new java.awt.Color(55, 71, 79));
        header_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        header_title.setForeground(new java.awt.Color(255, 255, 255));
        header_title.setText("Veterinario");
        header.add(header_title);

        jPanel4.setBackground(new java.awt.Color(247, 249, 249));

        jPanel2.setBackground(new java.awt.Color(247, 249, 249));
        jPanel2.setLayout(new java.awt.GridLayout(4, 1, 5, 10));

        profile_button.setBackground(new java.awt.Color(64, 145, 108));
        profile_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        profile_button.setForeground(new java.awt.Color(255, 255, 255));
        profile_button.setText("Perfil");
        profile_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        profile_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnProfile(evt);
            }
        });
        jPanel2.add(profile_button);

        appoiment_button.setBackground(new java.awt.Color(64, 145, 108));
        appoiment_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        appoiment_button.setForeground(new java.awt.Color(255, 255, 255));
        appoiment_button.setText("Agenda");
        appoiment_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        appoiment_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appoiment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnSchedule(evt);
            }
        });
        jPanel2.add(appoiment_button);

        pet_button.setBackground(new java.awt.Color(64, 145, 108));
        pet_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pet_button.setForeground(new java.awt.Color(255, 255, 255));
        pet_button.setText("Historial");
        pet_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        pet_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pet_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnHistory(evt);
            }
        });
        jPanel2.add(pet_button);

        reviews_button.setBackground(new java.awt.Color(64, 145, 108));
        reviews_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        reviews_button.setForeground(new java.awt.Color(255, 255, 255));
        reviews_button.setText("Reviews");
        reviews_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        reviews_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reviews_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnReview(evt);
            }
        });
        jPanel2.add(reviews_button);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );

        card_content_layout.setBackground(new java.awt.Color(247, 249, 249));
        card_content_layout.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(card_content_layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_content_layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnSchedule(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnSchedule
        card_layout.show(card_content_layout, "vetAppoimentView");
    }//GEN-LAST:event_OnSchedule

    private void OnProfile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnProfile
        card_layout.show(card_content_layout, "vetProfile");
    }//GEN-LAST:event_OnProfile

    private void OnHistory(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnHistory
        card_layout.show(card_content_layout, "petHistoryView");
    }//GEN-LAST:event_OnHistory

    private void OnReview(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnReview
       
    }//GEN-LAST:event_OnReview

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
            java.util.logging.Logger.getLogger(VetView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VetView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VetView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VetView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VetView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appoiment_button;
    private javax.swing.JPanel card_content_layout;
    private javax.swing.JPanel header;
    private javax.swing.JLabel header_title;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton pet_button;
    private javax.swing.JButton profile_button;
    private javax.swing.JButton reviews_button;
    // End of variables declaration//GEN-END:variables
}
