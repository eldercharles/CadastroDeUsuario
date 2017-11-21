
package TrabalhoAV2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Perfil extends javax.swing.JInternalFrame {

   
    public Perfil() {
        initComponents();
         DefaultTableModel modelo = (DefaultTableModel) tbperfil.getModel();
        tbperfil.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }

    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tbperfil.getModel();
        modelo.setNumRows(0);
        
        PerfilDAO pdao = new PerfilDAO();
        
                
        for(ClassPerfil perf: pdao.read()) {
            
            modelo.addRow(new Object[] {
                perf.getId_perfil(),
                perf.getNomePerfil(),
                perf.getDescricao(),
                });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btncadastrar = new javax.swing.JButton();
        txtdescricao = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnnovo = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbperfil = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(" ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfil"));

        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btncadastrar)
                        .addGap(154, 154, 154)
                        .addComponent(btnatualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnexcluir)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnnovo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadastrar)
                    .addComponent(btnatualizar)
                    .addComponent(btnexcluir))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tbperfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Perfil", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbperfilMouseClicked(evt);
            }
        });
        tbperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbperfilKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tbperfil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        // TODO add your handling code here:
       //Novo();    
        
        
        
    }//GEN-LAST:event_btnnovoActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        // TODO add your handling code here:
        ClassPerfil perf = new ClassPerfil();
         PerfilDAO daoPerf = new PerfilDAO();
         
         perf.setNomePerfil(txtnome.getText());
         perf.setDescricao(txtdescricao.getText());
         
         daoPerf.create(perf);
         
         txtnome.setText("");
         txtdescricao.setText("");
         
         readJTable();
         //Cadastrar();
        
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        // TODO add your handling code here:
        if (tbperfil.getSelectedRow() != -1) {
        
        ClassPerfil perf = new ClassPerfil();
         PerfilDAO daoperf = new PerfilDAO();
         
         perf.setNomePerfil(txtnome.getText());
         perf.setDescricao(txtdescricao.getText());
         perf.setId_perfil((int) tbperfil.getValueAt(tbperfil.getSelectedRow(), 0));
         daoperf.update(perf);
         
         
         txtnome.setText("");
         txtdescricao.setText("");
         
         readJTable();
         //Cadastrar();
        
        
        
    }//GEN-LAST:event_btnatualizarActionPerformed
    }
    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // TODO add your handling code here:
        if (tbperfil.getSelectedRow() != -1) {
        
        ClassPerfil perf = new ClassPerfil();
         PerfilDAO pdao = new PerfilDAO();
         
         
         perf.setId_perfil((int) tbperfil.getValueAt(tbperfil.getSelectedRow(), 0));
         
         pdao.delete(perf);
         
         
         txtnome.setText("");
         txtdescricao.setText("");
         
         readJTable();
         //Cadastrar();
         
        }
        else {
            JOptionPane.showMessageDialog(null," Selecione um produto para excluir.");
        }
        
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void tbperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbperfilMouseClicked
        // TODO add your handling code here:
        if (tbperfil.getSelectedRow() != -1) {

            txtnome.setText(tbperfil.getValueAt(tbperfil.getSelectedRow(), 1).toString());
            txtdescricao.setText(tbperfil.getValueAt(tbperfil.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tbperfilMouseClicked
    }
    private void tbperfilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbperfilKeyReleased
        // TODO add your handling code here:
        if (tbperfil.getSelectedRow() != -1) {

            txtnome.setText(tbperfil.getValueAt(tbperfil.getSelectedRow(), 1).toString());
            txtdescricao.setText(tbperfil.getValueAt(tbperfil.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tbperfilKeyReleased
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tbperfil;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables

 public void Novo() {
     
     txtnome.setEnabled(true);
        txtdescricao.setEnabled(true);
        
        btncadastrar.setEnabled(true);
        btnatualizar.setEnabled(false);
        btnexcluir.setEnabled(false);
 }

 public void Cadastrar() {
     
     txtnome.setEnabled(false);
        txtdescricao.setEnabled(false);
        
        btncadastrar.setEnabled(true);
        btnatualizar.setEnabled(false);
        btnexcluir.setEnabled(false);
        
        txtnome.setText("");
        txtdescricao.setText("");
 }

 public void Atualizar() {
     
     txtnome.setEnabled(true);
        txtdescricao.setEnabled(true);
        
        btncadastrar.setEnabled(false);
        btnatualizar.setEnabled(true);
        btnexcluir.setEnabled(false); 
        btnnovo.setEnabled(false);
 
}
 public void Excluir() {
     
     txtnome.setEnabled(true);
        txtdescricao.setEnabled(true);
        
        btncadastrar.setEnabled(false);
        btnatualizar.setEnabled(false);
        btnexcluir.setEnabled(true);
        btnnovo.setEnabled(false);


}
 
 public void Cancelar() {
     
     txtnome.setEnabled(false);
        txtdescricao.setEnabled(false);
        
        btncadastrar.setEnabled(true);
        btnatualizar.setEnabled(true);
        btnexcluir.setEnabled(true);
 
}
 
}