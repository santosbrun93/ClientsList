package visual;

public class CadastroUsuario extends javax.swing.JFrame {

    public CadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloUser = new javax.swing.JLabel();
        jLabelUserCad = new javax.swing.JLabel();
        jLabelPassCad = new javax.swing.JLabel();
        etUsuario = new javax.swing.JTextField();
        jLabelPassConfCad = new javax.swing.JLabel();
        jButtonSaveUser = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabelUserCel = new javax.swing.JLabel();
        jLabelUserFixo = new javax.swing.JLabel();
        ftCelUser = new javax.swing.JFormattedTextField();
        ftCPFuser = new javax.swing.JFormattedTextField();
        ftFixoUser = new javax.swing.JFormattedTextField();
        jLabelNascimento = new javax.swing.JLabel();
        ftNascimentoUser = new javax.swing.JFormattedTextField();
        jLabelUserCPF = new javax.swing.JLabel();
        jLabelUserRG = new javax.swing.JLabel();
        etNomeUser = new javax.swing.JTextField();
        etRG = new javax.swing.JTextField();
        jLabelUserNome = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        pfConfirm = new javax.swing.JPasswordField();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastrar = new javax.swing.JMenuItem();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jMenuItemFind = new javax.swing.JMenuItem();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelGeral = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTituloUser.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelTituloUser.setText("Cadastro de Usuário");

        jLabelUserCad.setText("Usuário");

        jLabelPassCad.setText("Senha");

        etUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etUsuarioActionPerformed(evt);
            }
        });

        jLabelPassConfCad.setText("Confirmar Senha");

        jButtonSaveUser.setText("Salvar Usuário");
        jButtonSaveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveUserActionPerformed(evt);
            }
        });

        jButtonClear.setText("Zerar");

        jLabelUserCel.setText("Telefone Celular");

        jLabelUserFixo.setText("Telefone Fixo");

        ftCelUser.setText("(XX) X XXXX-XXXX");

        ftCPFuser.setText("\"XXX.XXX.XXX-XX\"");
        ftCPFuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftCPFuserActionPerformed(evt);
            }
        });

        ftFixoUser.setText("(XX) XXXX-XXXX");

        jLabelNascimento.setText("Data de Nascimento");

        ftNascimentoUser.setText("DD/MM/AAAA");
        ftNascimentoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftNascimentoUserActionPerformed(evt);
            }
        });

        jLabelUserCPF.setText("CPF");

        jLabelUserRG.setText("RG");

        etNomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNomeUserActionPerformed(evt);
            }
        });

        jLabelUserNome.setText("Nome");

        pfSenha.setText("jPasswordField1");

        pfConfirm.setText("jPasswordField1");

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastrar.setText("Cadastrar Cliente");
        jMenuItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastrar);

        jMenuItemEditar.setText("Editar Cliente");
        jMenuCadastro.add(jMenuItemEditar);

        jMenuItemFind.setText("Localizar Cliente");
        jMenuCadastro.add(jMenuItemFind);

        jMenuItemExcluir.setText("Excluir Cliente");
        jMenuCadastro.add(jMenuItemExcluir);

        jMenuBar.add(jMenuCadastro);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemRelGeral.setText("Relatório Geral de Clientes");
        jMenuRelatorios.add(jMenuItemRelGeral);

        jMenuBar.add(jMenuRelatorios);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabelTituloUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNascimento)
                            .addComponent(jLabelUserCPF)
                            .addComponent(jLabelUserRG)
                            .addComponent(jLabelUserFixo)
                            .addComponent(jLabelUserCel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftCelUser)
                            .addComponent(etRG)
                            .addComponent(etNomeUser)
                            .addComponent(ftFixoUser)
                            .addComponent(ftNascimentoUser)
                            .addComponent(ftCPFuser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelUserNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelUserCad)
                                .addComponent(jLabelPassCad))
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pfSenha)
                                .addComponent(etUsuario)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelPassConfCad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(pfConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSaveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTituloUser)
                        .addGap(221, 221, 221))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelUserCad)
                                .addComponent(etUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelPassCad)
                                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelPassConfCad)
                                .addComponent(pfConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                .addComponent(jButtonSaveUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelUserNome)
                                .addComponent(etNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNascimento)
                                .addComponent(ftNascimentoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelUserCPF)
                                .addComponent(ftCPFuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelUserRG)
                                .addComponent(etRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelUserCel)
                                .addComponent(ftCelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelUserFixo)
                                .addComponent(ftFixoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaveUserActionPerformed

    private void ftCPFuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftCPFuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftCPFuserActionPerformed

    private void ftNascimentoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftNascimentoUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftNascimentoUserActionPerformed

    private void etNomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNomeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNomeUserActionPerformed

    private void etUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etUsuarioActionPerformed

    private void jMenuItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField etNomeUser;
    private javax.swing.JTextField etRG;
    private javax.swing.JTextField etUsuario;
    private javax.swing.JFormattedTextField ftCPFuser;
    private javax.swing.JFormattedTextField ftCelUser;
    private javax.swing.JFormattedTextField ftFixoUser;
    private javax.swing.JFormattedTextField ftNascimentoUser;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonSaveUser;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JLabel jLabelPassCad;
    private javax.swing.JLabel jLabelPassConfCad;
    private javax.swing.JLabel jLabelTituloUser;
    private javax.swing.JLabel jLabelUserCPF;
    private javax.swing.JLabel jLabelUserCad;
    private javax.swing.JLabel jLabelUserCel;
    private javax.swing.JLabel jLabelUserFixo;
    private javax.swing.JLabel jLabelUserNome;
    private javax.swing.JLabel jLabelUserRG;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadastrar;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JMenuItem jMenuItemFind;
    private javax.swing.JMenuItem jMenuItemRelGeral;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPasswordField pfConfirm;
    private javax.swing.JPasswordField pfSenha;
    // End of variables declaration//GEN-END:variables
}
