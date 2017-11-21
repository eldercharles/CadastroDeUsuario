package TrabalhoAV2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form UsuarioU
     */
    public Usuario() {
        initComponents();
                
        DefaultTableModel modelo = (DefaultTableModel) tbusuario.getModel();
        tbusuario.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }
    
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tbusuario.getModel();
        modelo.setNumRows(0);
        
        UsuarioDAO udao = new UsuarioDAO();
        
                
        for(ClassUsuario user: udao.read()) {
            
            modelo.addRow(new Object[] {
                user.getId(),
                user.getNome(),
                user.getSobreNome(),
                });
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtsobrenome = new javax.swing.JTextField();
        btncadastrar = new javax.swing.JButton();
        btnnovo = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbusuario = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(" ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Sobrenome");

        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });

        btnnovo.setText("Novo");
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });

        btnatualizar.setText("Atualizar");
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });

        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsobrenome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btncadastrar, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 189, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnatualizar)
                        .addGap(53, 53, 53)
                        .addComponent(btnexcluir)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(txtsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnnovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadastrar)
                    .addComponent(btnatualizar)
                    .addComponent(btnexcluir)))
        );

        tbusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbusuarioMouseClicked(evt);
            }
        });
        tbusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbusuarioKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tbusuario);
        if (tbusuario.getColumnModel().getColumnCount() > 0) {
            tbusuario.getColumnModel().getColumn(1).setResizable(false);
            tbusuario.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        // TODO add your handling code here:
        //Novo();
        
        
        
    }//GEN-LAST:event_btnnovoActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
       
         ClassUsuario user = new ClassUsuario();
         UsuarioDAO dao = new UsuarioDAO();
         
         user.setNome(txtnome.getText());
         user.setSobreNome(txtsobrenome.getText());
         dao.create(user);
         
         
         txtnome.setText("");
         txtsobrenome.setText("");
         
         readJTable();
         //Cadastrar();
        
        
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void tbusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbusuarioMouseClicked

        
       if (tbusuario.getSelectedRow() != -1) {

            txtnome.setText(tbusuario.getValueAt(tbusuario.getSelectedRow(), 1).toString());
            txtsobrenome.setText(tbusuario.getValueAt(tbusuario.getSelectedRow(), 2).toString());
            

          }
    }//GEN-LAST:event_tbusuarioMouseClicked

    private void tbusuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbusuarioKeyReleased
        // TODO add your handling code here:
        if (tbusuario.getSelectedRow() != -1) {
            txtnome.setText(tbusuario.getValueAt(tbusuario.getSelectedRow(), 1).toString());
            txtnome.setText(tbusuario.getValueAt(tbusuario.getSelectedRow(), 2).toString());
            
        }
        
    }//GEN-LAST:event_tbusuarioKeyReleased

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        // TODO add your handling code here:
        if (tbusuario.getSelectedRow() != -1) {
        
        ClassUsuario user = new ClassUsuario();
         UsuarioDAO dao = new UsuarioDAO();
         
         user.setNome(txtnome.getText());
         user.setSobreNome(txtsobrenome.getText());
         user.setId((int) tbusuario.getValueAt(tbusuario.getSelectedRow(), 0));
         dao.update(user);
         
         
         txtnome.setText("");
         txtsobrenome.setText("");
         
         readJTable();
         //Atualizar();
        
    }//GEN-LAST:event_btnatualizarActionPerformed
    }
    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // TODO add your handling code here:
        if (tbusuario.getSelectedRow() != -1) {
        
        ClassUsuario user = new ClassUsuario();
         UsuarioDAO dao = new UsuarioDAO();
         
         
         user.setId((int) tbusuario.getValueAt(tbusuario.getSelectedRow(), 0));
         
         dao.delete(user);
         
         
         txtnome.setText("");
         txtsobrenome.setText("");
         
         readJTable();
         //Excluir();
         
        }
        else {
            JOptionPane.showMessageDialog(null," Selecione um usuario para excluir.");
        }
        
        
    }//GEN-LAST:event_btnexcluirActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tbusuario;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtsobrenome;
    // End of variables declaration//GEN-END:variables

 public void Novo() {
     
     txtnome.setEnabled(true);
        txtsobrenome.setEnabled(true);
        
        btncadastrar.setEnabled(true);
        btnatualizar.setEnabled(false);
        btnexcluir.setEnabled(false);
 }

 public void Cadastrar() {
     
     txtnome.setEnabled(false);
        txtsobrenome.setEnabled(false);
        
        btncadastrar.setEnabled(true);
        btnatualizar.setEnabled(false);
        btnexcluir.setEnabled(false);
        
        txtnome.setText("");
        txtsobrenome.setText("");
 }

 public void Atualizar() {
     
     txtnome.setEnabled(true);
        txtsobrenome.setEnabled(true);
        
        btncadastrar.setEnabled(false);
        btnatualizar.setEnabled(true);
        btnexcluir.setEnabled(false); 
        btnnovo.setEnabled(false);
 
}
 public void Excluir() {
     
     txtnome.setEnabled(true);
        txtsobrenome.setEnabled(true);
        
        btncadastrar.setEnabled(false);
        btnatualizar.setEnabled(false);
        btnexcluir.setEnabled(true);
        btnnovo.setEnabled(false);


}
 
 public void Cancelar() {
     
     txtnome.setEnabled(false);
        txtsobrenome.setEnabled(false);
        
        btncadastrar.setEnabled(true);
        btnatualizar.setEnabled(true);
        btnexcluir.setEnabled(true);
 
}
}