package com.br.kaoi.bridgebuilderproxy;


public class FormPizza extends javax.swing.JFrame {

    Pizza p;
    public FormPizza() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMontar = new javax.swing.JButton();
        cbxPizza = new javax.swing.JComboBox();
        cbxModoAssar = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAMontagem = new javax.swing.JTextArea();
        lblForno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMontar.setText("Montar Pizza");
        btnMontar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontarActionPerformed(evt);
            }
        });

        cbxPizza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Calabresa", "Queijo", "Queijo Builder" }));

        cbxModoAssar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elétrico", "Lenha", "Rápido", " " }));

        txtAMontagem.setColumns(20);
        txtAMontagem.setRows(5);
        jScrollPane1.setViewportView(txtAMontagem);

        lblForno.setText("Forno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblForno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxModoAssar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnMontar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxModoAssar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblForno)))
                    .addComponent(btnMontar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnMontarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontarActionPerformed
          String pizza = (String) cbxPizza.getSelectedItem();
          String modoDeAssar = (String) cbxModoAssar.getSelectedItem();
          
          if(pizza == "Calabresa"){          
                p = new Calabresa();               
                
                txtAMontagem.setText(montagemPizza(pizza, modoDeAssar)); 
                
          }else if(pizza == "Queijo"){
                p = Queijo.getQueijo();
                txtAMontagem.setText(montagemPizza(pizza, modoDeAssar));                
                                      
          }else if(pizza == "Queijo Builder"){
                p = new PizzaQueijoBuilder()
                            .assarPizzaQueijo();
                txtAMontagem.setText(montagemPizza(pizza, "Rápido"));
                
          }        
      
        
    }//GEN-LAST:event_btnMontarActionPerformed
    public String modoDeAssar(String modo){
        if(modo == "Elétrico"){  
            p.setModo(new FornoEletrico());
            return "Assando no Forno Elétrico";
        }else if(modo == "Rápido"){
            p.setModo(new FornoRapido());
            return "Assando no Forno Rápido";
        }else{
            p.setModo(new FornoLenha());
            return "Assando no Forno à Lenha";
        }        
    }
    public String montagemPizza(String pizza,String modo){        
        
        return "1. Fazendo a massa"+"\n"+
                "2. Recheiando com "+pizza+"\n" +
                "3. Assando no "+modoDeAssar(modo)+"\n"+
                "4. Embalando para entregar";
    }
    
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
            java.util.logging.Logger.getLogger(FormPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMontar;
    private javax.swing.JComboBox cbxModoAssar;
    private javax.swing.JComboBox cbxPizza;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblForno;
    private javax.swing.JTextArea txtAMontagem;
    // End of variables declaration//GEN-END:variables
}
