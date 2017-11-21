
package TrabalhoAV2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Endereco extends javax.swing.JInternalFrame {


    public Endereco() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tbendereco.getModel();
        tbendereco.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) tbendereco.getModel();
        modelo.setNumRows(0);
        
        EnderecoDAO edao = new EnderecoDAO();
        
                
        for(ClassEndereco ender: edao.read()) {
            
            modelo.addRow(new Object[] {
                ender.getId_endereco(),
                ender.getLogradouro(),
                ender.getComplemento(),
                ender.getBairro(),
                ender.getNumero(),
                ender.getCEP()
                });
        }

    }
    
         public void readJTableDescre(String descre) {
        
        DefaultTableModel modelo = (DefaultTableModel) tbendereco.getModel();
        modelo.setNumRows(0);
        EnderecoDAO edao = new EnderecoDAO();

        for (ClassEndereco ender : edao.readDescre(descre)) {

            modelo.addRow(new Object[]{
                ender.getId_endereco(),
                ender.getLogradouro(),
                ender.getComplemento(),
                ender.getBairro(),
                ender.getNumero(),
                ender.getCEP()
               });

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtlogradouro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcomplemento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtbairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcep = new javax.swing.JFormattedTextField();
        btncadastrar = new javax.swing.JButton();
        btnnovo = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        txtnumero = new javax.swing.JFormattedTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbendereco = new javax.swing.JTable();
        btnpesquisar = new javax.swing.JButton();
        txtpesquisar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(" ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Logradouro");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Complemento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Número");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Bairro");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("CEP");

        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcepActionPerformed(evt);
            }
        });

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

        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnatualizar.setText("Atualizar");
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });

        try {
            txtnumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtlogradouro)
                    .addComponent(txtbairro)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txtcomplemento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btncadastrar)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnatualizar)
                                    .addComponent(btnexcluir))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcep)
                    .addComponent(btnnovo)
                    .addComponent(btnatualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadastrar)
                    .addComponent(btnexcluir))
                .addGap(4, 4, 4))
        );

        tbendereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Logradouro", "Complemento", "Bairro", "Número", "CEP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbendereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbenderecoMouseClicked(evt);
            }
        });
        tbendereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbenderecoKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tbendereco);

        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnpesquisar)
                            .addComponent(txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcepActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtcepActionPerformed

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        // TODO add your handling code here:
        //Novo();
        
        
        
    }//GEN-LAST:event_btnnovoActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        // TODO add your handling code here:
        
         ClassEndereco ender = new ClassEndereco();
         EnderecoDAO daoEnder = new EnderecoDAO();
         
         ender.setLogradouro(txtlogradouro.getText());
         ender.setComplemento(txtcomplemento.getText());
         ender.setBairro(txtbairro.getText());
         ender.setNumero(txtnumero.getText());
         ender.setCEP(txtcep.getText());
         
                  
         daoEnder.create(ender);
         
         //Cadastrar();
         
         txtlogradouro.setText("");
         txtcomplemento.setText("");
         txtbairro.setText("");
         txtnumero.setText("");
         txtcep.setText("");
         
         readJTable();
        
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void tbenderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbenderecoMouseClicked
        // TODO add your handling code here:
         if (tbendereco.getSelectedRow() != -1) {

            txtlogradouro.setText(tbendereco.getValueAt(tbendereco.getSelectedRow(), 1).toString());
            txtcomplemento.setText(tbendereco.getValueAt(tbendereco.getSelectedRow(), 2).toString());
            txtbairro.setText(tbendereco.getValueAt(tbendereco.getSelectedRow(), 3).toString());
            txtnumero.setText(tbendereco.getValueAt(tbendereco.getSelectedRow(), 4).toString());
            txtcep.setText(tbendereco.getValueAt(tbendereco.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tbenderecoMouseClicked
    }
    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        // TODO add your handling code here:
        if (tbendereco.getSelectedRow() != -1) {
        
         ClassEndereco ender = new ClassEndereco();
         EnderecoDAO daoender = new EnderecoDAO();
         
         ender.setLogradouro(txtlogradouro.getText());
         ender.setComplemento(txtcomplemento.getText());
         ender.setBairro(txtbairro.getText());
         ender.setNumero(txtnumero.getText());
         ender.setCEP(txtcep.getText());
         ender.setId_endereco((int) tbendereco.getValueAt(tbendereco.getSelectedRow(), 0));
         daoender.update(ender);
         
         
         txtlogradouro.setText("");
         txtcomplemento.setText("");
         txtbairro.setText("");
         txtnumero.setText("");
         txtcep.setText("");
         
         readJTable();
    }//GEN-LAST:event_btnatualizarActionPerformed
    }
    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // TODO add your handling code here:
        if (tbendereco.getSelectedRow() != -1) {
        
        ClassEndereco ender = new ClassEndereco();
         EnderecoDAO daoender = new EnderecoDAO();
         
         ender.setId_endereco((int) tbendereco.getValueAt(tbendereco.getSelectedRow(), 0));
         
         daoender.delete(ender);
         
         txtlogradouro.setText("");
         txtcomplemento.setText("");
         txtbairro.setText("");
         txtnumero.setText("");
         txtcep.setText("");
         
         readJTable();
    } 
        
        else {
            JOptionPane.showMessageDialog(null, "Selecione um endereco para excluir.");
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void tbenderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbenderecoKeyReleased
        // TODO add your handling code here:
        if (tbendereco.getSelectedRow() != -1) {
            
            txtlogradouro.setText(tbendereco.getValueAt(tbendereco.getSelectedRow(), 1).toString());
            txtcomplemento.setText(tbendereco.getValueAt(tbendereco.getSelectedRow(), 2).toString());
            txtbairro.setText(tbendereco.getValueAt(tbendereco.getSelectedRow(), 3).toString());
            txtnumero.setText(tbendereco.getValueAt(tbendereco.getSelectedRow(), 4).toString());
            txtcep.setText(tbendereco.getValueAt(tbendereco.getSelectedRow(), 5).toString());
            
        }
    }//GEN-LAST:event_tbenderecoKeyReleased

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // TODO add your handling code here:
        readJTableDescre(txtpesquisar.getText());
    }//GEN-LAST:event_btnpesquisarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbendereco;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JTextField txtcomplemento;
    private javax.swing.JTextField txtlogradouro;
    private javax.swing.JFormattedTextField txtnumero;
    private javax.swing.JTextField txtpesquisar;
    // End of variables declaration//GEN-END:variables




 public void Novo() {
     
     txtlogradouro.setEnabled(true);
        txtcomplemento.setEnabled(true);
        txtbairro.setEnabled(true);
        txtnumero.setEnabled(true);
        txtcep.setEnabled(true);
        
        btncadastrar.setEnabled(true);
        btnatualizar.setEnabled(false);
        btnexcluir.setEnabled(false);
 }

 public void Cadastrar() {
     
        txtlogradouro.setEnabled(true);
        txtcomplemento.setEnabled(true);
        txtbairro.setEnabled(true);
        txtnumero.setEnabled(true);
        txtcep.setEnabled(true);
        
        btncadastrar.setEnabled(true);
        btnatualizar.setEnabled(false);
        btnexcluir.setEnabled(false);
        
        txtlogradouro.setText("");
        txtcomplemento.setText("");
        txtbairro.setText("");
        txtnumero.setText("");
        txtcep.setText("");
 }

 public void Atualizar() {
     
        txtlogradouro.setEnabled(true);
        txtcomplemento.setEnabled(true);
        txtbairro.setEnabled(true);
        txtnumero.setEnabled(true);
        txtcep.setEnabled(true);
        
        btncadastrar.setEnabled(false);
        btnatualizar.setEnabled(true);
        btnexcluir.setEnabled(false); 
        btnnovo.setEnabled(false);
 
}
 public void Excluir() {
     
        txtlogradouro.setEnabled(true);
        txtcomplemento.setEnabled(true);
        txtbairro.setEnabled(true);
        txtnumero.setEnabled(true);
        txtcep.setEnabled(true);
        
        btncadastrar.setEnabled(false);
        btnatualizar.setEnabled(false);
        btnexcluir.setEnabled(true);
        btnnovo.setEnabled(false);


}
 
 public void Cancelar() {
     
        txtlogradouro.setEnabled(true);
        txtcomplemento.setEnabled(true);
        txtbairro.setEnabled(true);
        txtnumero.setEnabled(true);
        txtcep.setEnabled(true);
        
        btncadastrar.setEnabled(true);
        btnatualizar.setEnabled(true);
        btnexcluir.setEnabled(true);
 
}
}