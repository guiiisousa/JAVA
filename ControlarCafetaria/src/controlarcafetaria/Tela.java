/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controlarcafetaria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame {
    ArrayList<Cliente> listaCliente = new ArrayList<>(); 
    ArrayList<Pedido> listaPedido = new ArrayList<>();

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Tela.class.getName());

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bebida = new javax.swing.JComboBox<>();
        Tamanho = new javax.swing.JComboBox<>();
        AdicionalCheckBox = new javax.swing.JCheckBox();
        Nome = new javax.swing.JTextField();
        Código = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Verificar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Código: ");

        Bebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Café Expresso", "Cappuccino", "Chocolate Quente" }));

        Tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Médio", "Grande" }));

        AdicionalCheckBox.setText("Adicional ??? (R$ 2,5)");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Verificar.setText("Verificar");
        Verificar.addActionListener(this::VerificarActionPerformed);

        Fechar.setText("Fechar");
        Fechar.addActionListener(this::FecharActionPerformed);

        Limpar.setText("Limpar");
        Limpar.addActionListener(this::LimparActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Verificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fechar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AdicionalCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Código)))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Código, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdicionalCheckBox))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fechar)
                    .addComponent(Verificar)
                    .addComponent(Limpar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarActionPerformed
        
        try{
        String nome = Nome.getText();
        int codigo = Integer.parseInt(Código.getText());       
        Cliente cliente = new Cliente(nome, codigo);           
        String bebida = Bebida.getSelectedItem().toString();
        String tamanho  = Tamanho.getSelectedItem().toString();
        double valor_tamanho = 0;
        double valor_bebida = 0;
        int contador = 0;
        
        for (Cliente c : listaCliente){
            
            if(c.codigo == codigo){
                contador++;
            }   
        }

        if("Pequeno".equals(tamanho)){
            valor_tamanho = 1;
        }
        else if ("Médio".equals(tamanho)) {
            valor_tamanho = 1.3;
        }
        else{
            valor_tamanho = 1.6;
        }
        
        if("Café Expresso".equals(bebida)){
            valor_bebida = 6;
        }
        else if ("Cappuccino".equals(bebida)){
            valor_bebida = 9;
        }
        else{
           valor_bebida = 11;
        }
        
        Pedido pedido = new Pedido(bebida, tamanho, valor_tamanho, valor_bebida);    
        
        if(contador < 3){
            listaCliente.add(cliente);
            listaPedido.add(pedido);
        }
        else{
            JOptionPane.showMessageDialog(null, "Já fez 3 pedidos");
        }
  
        String texto = "";
        
        if(AdicionalCheckBox.isSelected()){
            for(int i = 0; i < listaCliente.size(); i++){

                Cliente c = listaCliente.get(i);

                Pedido p = listaPedido.get(i);

                texto += "\nNome: "+ c.nome +"\nBebida: "+ p.nome_da_bebida +"\nAdicional? Sim \nValor: "+ p.valor_bebida +"\nValor Total: R$"+p.Calcular_valorTotal_Adicional(p)+"\n------------------------------";

            } 
        }
        else{
            for(int i = 0; i < listaCliente.size(); i++){

                Cliente c = listaCliente.get(i);

                Pedido p = listaPedido.get(i);

                texto += "\nNome: "+ c.nome +"\nBebida: "+ p.nome_da_bebida +"\nAdicional? Não \nValor: "+ p.valor_bebida +"\nValor Total: R$"+p.Calcular_valorTotal(p)+"\n------------------------------";

            } 
        }

        jTextArea1.setText(texto);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite os campos corretamente");
        }
           
    }//GEN-LAST:event_VerificarActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        jTextArea1.setText("");
        listaCliente.removeAll(listaCliente);
        listaPedido.removeAll(listaPedido);
       
    }//GEN-LAST:event_LimparActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Tela().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AdicionalCheckBox;
    private javax.swing.JComboBox<String> Bebida;
    private javax.swing.JTextField Código;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextField Nome;
    private javax.swing.JComboBox<String> Tamanho;
    private javax.swing.JButton Verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
