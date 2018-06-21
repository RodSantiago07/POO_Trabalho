/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodprosposta;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class Principal extends javax.swing.JFrame {
    ArrayList<Proposta> ListaProp;
    String modo;
    
    public void LoadTableProp(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Dias Entrega", "Preço Total", "Descrição"}, 0);
        
        
        for(int i = 0; i < ListaProp.size(); i++) {
            Object linha[] = new Object[]{ListaProp.get(i).getDiasEntrega(),
                                          ListaProp.get(i).getPrecoTotal(),
                                          ListaProp.get(i).getDescricao()};
            
            modelo.addRow(linha);
        }
                
        tbl_prop_props.setModel(modelo);
        tbl_prop_props.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_prop_props.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbl_prop_props.getColumnModel().getColumn(2).setPreferredWidth(200);
    }
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        ListaProp = new ArrayList();
        modo = "Navegar";
        ManipulaInterface();
        
        /*btn_prop_salvar.setEnabled(false);
        btn_prop_cancelar.setEnabled(false);
        c_prop_descricao.setEnabled(false);
        c_prop_diasEntrega.setEnabled(false);
        c_prop_precoTotal.setEnabled(false);*/
    }
    
    public void ManipulaInterface(){
        switch(modo) {
            case "Navegar":
                btn_prop_salvar.setEnabled(false);
                btn_prop_cancelar.setEnabled(false);
                c_prop_descricao.setEnabled(false);
                c_prop_diasEntrega.setEnabled(false);
                c_prop_precoTotal.setEnabled(false);
                btn_prop_novo.setEnabled(true);
                btn_prop_excluir.setEnabled(false);
                btn_prop_editar.setEnabled(false);
                break;
                
            case "Novo":
                btn_prop_salvar.setEnabled(true);
                btn_prop_cancelar.setEnabled(true);
                c_prop_descricao.setEnabled(true);
                c_prop_diasEntrega.setEnabled(true);
                c_prop_precoTotal.setEnabled(true);
                btn_prop_novo.setEnabled(false);
                btn_prop_excluir.setEnabled(false);
                c_prop_precoTotal.setEnabled(true);
                btn_prop_editar.setEnabled(false);
                
                break;
                
            case "Editar":
                btn_prop_salvar.setEnabled(true);
                btn_prop_cancelar.setEnabled(true);
                c_prop_descricao.setEnabled(true);
                c_prop_diasEntrega.setEnabled(true);
                c_prop_precoTotal.setEnabled(true);
                btn_prop_novo.setEnabled(true);
                btn_prop_excluir.setEnabled(false);
                btn_prop_editar.setEnabled(false);
                
                break;
                
            case "Excluir":
                btn_prop_salvar.setEnabled(false);
                btn_prop_cancelar.setEnabled(false);
                c_prop_descricao.setEnabled(false);
                c_prop_diasEntrega.setEnabled(false);
                c_prop_precoTotal.setEnabled(false);
                btn_prop_novo.setEnabled(true);
                btn_prop_excluir.setEnabled(false);
                btn_prop_editar.setEnabled(false);
                
                break;
                
                case "Selecao":
                btn_prop_salvar.setEnabled(false);
                btn_prop_cancelar.setEnabled(false);
                c_prop_descricao.setEnabled(false);
                c_prop_diasEntrega.setEnabled(false);
                c_prop_precoTotal.setEnabled(false);
                btn_prop_novo.setEnabled(true);
                btn_prop_excluir.setEnabled(true);
                btn_prop_editar.setEnabled(true);
                
                break;
                
            default: System.out.println("Modo Inválido");
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prop_props = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        c_prop_diasEntrega = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_prop_precoTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_prop_descricao = new javax.swing.JTextField();
        btn_prop_salvar = new javax.swing.JButton();
        btn_prop_cancelar = new javax.swing.JButton();
        btn_prop_novo = new javax.swing.JButton();
        btn_prop_editar = new javax.swing.JButton();
        btn_prop_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_prop_props.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dias Entrega", "Preço Total", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_prop_props.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_prop_propsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_prop_props);
        if (tbl_prop_props.getColumnModel().getColumnCount() > 0) {
            tbl_prop_props.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_prop_props.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbl_prop_props.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Proposta"));

        jLabel1.setText("Dias Entrega:");

        c_prop_diasEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_prop_diasEntregaActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço Total:");

        jLabel3.setText("Descrição:");

        btn_prop_salvar.setText("Salvar");
        btn_prop_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prop_salvarActionPerformed(evt);
            }
        });

        btn_prop_cancelar.setText("Cancelar");
        btn_prop_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prop_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_prop_diasEntrega)
                            .addComponent(c_prop_precoTotal)
                            .addComponent(c_prop_descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btn_prop_salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_prop_cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_prop_diasEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_prop_precoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_prop_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prop_salvar)
                    .addComponent(btn_prop_cancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btn_prop_novo.setText("Novo");
        btn_prop_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prop_novoActionPerformed(evt);
            }
        });

        btn_prop_editar.setText("Editar");
        btn_prop_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prop_editarActionPerformed(evt);
            }
        });

        btn_prop_excluir.setText("Excluir");
        btn_prop_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prop_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_prop_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_prop_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_prop_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prop_novo)
                    .addComponent(btn_prop_editar)
                    .addComponent(btn_prop_excluir))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Propostas", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_prop_diasEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_prop_diasEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_prop_diasEntregaActionPerformed

    private void btn_prop_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prop_editarActionPerformed
        modo = "Editar";
        ManipulaInterface();
    }//GEN-LAST:event_btn_prop_editarActionPerformed

    private void btn_prop_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prop_excluirActionPerformed
        //remover a linha que foi selecionada
        int index = tbl_prop_props.getSelectedRow();
        if(index >= 0 && index < ListaProp.size()){
            ListaProp.remove(index);
        }
        LoadTableProp(); 
        modo = "Navegar";
        ManipulaInterface();
    }//GEN-LAST:event_btn_prop_excluirActionPerformed

    private void btn_prop_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prop_novoActionPerformed
        c_prop_diasEntrega.setText("");
        c_prop_precoTotal.setText("");
        c_prop_descricao.setText("");
       
        modo = "Novo";
        ManipulaInterface();
        
        /*btn_prop_salvar.setEnabled(true);
        btn_prop_cancelar.setEnabled(true);
        c_prop_descricao.setEnabled(true);
        c_prop_diasEntrega.setEnabled(true);
        c_prop_precoTotal.setEnabled(true);*/
    }//GEN-LAST:event_btn_prop_novoActionPerformed

    private void btn_prop_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prop_cancelarActionPerformed
        /*btn_prop_salvar.setEnabled(false);
        btn_prop_cancelar.setEnabled(false);
        c_prop_descricao.setEnabled(false);
        c_prop_diasEntrega.setEnabled(false);
        c_prop_precoTotal.setEnabled(false);*/ 
        
        //para limpar os campos
        c_prop_diasEntrega.setText("");
        c_prop_precoTotal.setText("");
        c_prop_descricao.setText("");
        
        modo = "Navegar";
        ManipulaInterface();
    }//GEN-LAST:event_btn_prop_cancelarActionPerformed

    private void btn_prop_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prop_salvarActionPerformed
        int diasEntreg = Integer.parseInt(c_prop_diasEntrega.getText());
        double precoTota = Double.parseDouble(c_prop_precoTotal.getText());
        if(modo.equals("Novo")){
        //int diasEntreg = Integer.parseInt(c_prop_diasEntrega.getText());
        //double precoTota = Double.parseDouble(c_prop_precoTotal.getText());
        
        Proposta P = new Proposta(diasEntreg, precoTota, c_prop_descricao.getText());
        ListaProp.add(P);
        }else if(modo.equals("Editar")){
            //saber a linha que foi selecionada pelo usuario
            int index = tbl_prop_props.getSelectedRow();
            ListaProp.get(index).setDiasEntrega(diasEntreg);
            ListaProp.get(index).setPrecoTotal(precoTota); 
            ListaProp.get(index).setDescricao(c_prop_descricao.getText());
            
        }
        LoadTableProp();
        
        modo = "Navegar";
        ManipulaInterface();
        
        //limpar
        c_prop_diasEntrega.setText("");
        c_prop_precoTotal.setText("");
        c_prop_descricao.setText("");
    }//GEN-LAST:event_btn_prop_salvarActionPerformed

    private void tbl_prop_propsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prop_propsMouseClicked
        //linha que foi selecionada
        int index = tbl_prop_props.getSelectedRow();
        if(index >= 0 && index < ListaProp.size()){
            Proposta P = ListaProp.get(index);
            c_prop_diasEntrega.setText(String.valueOf(P.getDiasEntrega()));
            c_prop_precoTotal.setText(String.valueOf(P.getPrecoTotal()));
            c_prop_descricao.setText(P.getDescricao());
            
            modo = "Selecao";
            ManipulaInterface();
        }
        
    }//GEN-LAST:event_tbl_prop_propsMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_prop_cancelar;
    private javax.swing.JButton btn_prop_editar;
    private javax.swing.JButton btn_prop_excluir;
    private javax.swing.JButton btn_prop_novo;
    private javax.swing.JButton btn_prop_salvar;
    private javax.swing.JTextField c_prop_descricao;
    private javax.swing.JTextField c_prop_diasEntrega;
    private javax.swing.JTextField c_prop_precoTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tbl_prop_props;
    // End of variables declaration//GEN-END:variables
}