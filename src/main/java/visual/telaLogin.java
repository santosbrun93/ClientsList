package visual;


public class telaLogin extends javax.swing.JFrame {

    public telaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogin = new javax.swing.JButton();
        jButtonQuit = new javax.swing.JButton();
        jLabelPassLog = new javax.swing.JLabel();
        jLabelUserLog = new javax.swing.JLabel();
        etUserLog = new javax.swing.JTextField();
        pfSenhaLog = new javax.swing.JPasswordField();
        jButtonCadastroUser = new javax.swing.JButton();
        jLabelTituloLog = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonLogin.setText("Acessar");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin);
        jButtonLogin.setBounds(140, 230, 90, 23);

        jButtonQuit.setText("Sair");
        jButtonQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQuit);
        jButtonQuit.setBounds(240, 230, 70, 23);

        jLabelPassLog.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelPassLog.setText("Senha:");
        getContentPane().add(jLabelPassLog);
        jLabelPassLog.setBounds(140, 190, 40, 17);

        jLabelUserLog.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelUserLog.setText("Usuário:");
        getContentPane().add(jLabelUserLog);
        jLabelUserLog.setBounds(140, 160, 50, 20);

        etUserLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etUserLogActionPerformed(evt);
            }
        });
        getContentPane().add(etUserLog);
        etUserLog.setBounds(190, 160, 120, 20);

        pfSenhaLog.setText("jPasswordField1");
        getContentPane().add(pfSenhaLog);
        pfSenhaLog.setBounds(190, 190, 120, 20);

        jButtonCadastroUser.setText("Cadastrar Usuário");
        jButtonCadastroUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroUserActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastroUser);
        jButtonCadastroUser.setBounds(140, 270, 170, 23);

        jLabelTituloLog.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTituloLog.setText("Login de Usuário");
        jLabelTituloLog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelTituloLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelTituloLog);
        jLabelTituloLog.setBounds(160, 100, 140, 40);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_sportalgos.jpg"))); // NOI18N
        jLabelFundo.setLabelFor(this);
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 450, 390);

        setSize(new java.awt.Dimension(467, 424));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        
        MenuPrincipal main = new MenuPrincipal();    
        
        main.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void etUserLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etUserLogActionPerformed
      
    }//GEN-LAST:event_etUserLogActionPerformed

    private void jButtonCadastroUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroUserActionPerformed
        
        CadastroUsuario user = new CadastroUsuario();
        
        user.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButtonCadastroUserActionPerformed

    private void jButtonQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButtonQuitActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField etUserLog;
    private javax.swing.JButton jButtonCadastroUser;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonQuit;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelPassLog;
    private javax.swing.JLabel jLabelTituloLog;
    private javax.swing.JLabel jLabelUserLog;
    private javax.swing.JPasswordField pfSenhaLog;
    // End of variables declaration//GEN-END:variables
}
