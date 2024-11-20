package visao;

import javax.swing.ImageIcon;

/**
 *
 * @author osmar
 */
public class FrmImagem extends javax.swing.JFrame {

    /**
     * Creates new form FrmImagem
     */
    public FrmImagem() {
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

        jLbImagem = new javax.swing.JLabel();
        jBtCarregar = new javax.swing.JButton();
        jBtFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLbImagem.setText("Imagem");

        jBtCarregar.setText("Carregar imagem");
        jBtCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCarregarActionPerformed(evt);
            }
        });

        jBtFechar.setText("Fechar");
        jBtFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtCarregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtFechar)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCarregar)
                    .addComponent(jBtFechar))
                .addGap(18, 18, 18)
                .addComponent(jLbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCarregarActionPerformed
        // TODO add your handling code here:
        //Caminho da imagem
        String localImagem = "/imagem1.jpg";
        //Cria o objeto imagem
        ImageIcon imagem = new ImageIcon(getClass().getResource(localImagem));
        //Coloca a imagem no JLabel.
        jLbImagem.setIcon(imagem);
    }//GEN-LAST:event_jBtCarregarActionPerformed

    private void jBtFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtFecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtFecharActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtCarregar;
    private javax.swing.JButton jBtFechar;
    private javax.swing.JLabel jLbImagem;
    // End of variables declaration//GEN-END:variables
}
