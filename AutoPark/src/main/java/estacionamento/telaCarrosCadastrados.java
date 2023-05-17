/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estacionamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class telaCarrosCadastrados extends javax.swing.JFrame {

    /**
     * Creates new form telaTres
     */
    public telaCarrosCadastrados() {
        initComponents();
    }

    
    public ArrayList<relatorio> userList(){
        ArrayList<relatorio> usersList = new ArrayList<>();
        
        String sql = "SELECT * FROM cadastroveiculos WHERE idveiculo <> ''";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            relatorio re;
            while (rs.next()) {
                re = new relatorio(rs.getString("veiculo"),
                            rs.getString("modelo"),
                            rs.getString("placa"), 
                            rs.getString("horaEntrada"), 
                            rs.getString("data"),
                            rs.getString("horasaida"),
                            rs.getString("preço"),
                            rs.getString("status"));
                                   
                usersList.add(re);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void show_car(){
        ArrayList<relatorio> list = userList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        Object[] row = new Object[8];
        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getVeiculo();
            row[1]=list.get(i).getModelo();
            row[2]=list.get(i).getPlaca();
            row[3]=list.get(i).getHoraEntrada();
            row[4]=list.get(i).getData();
            row[5]=list.get(i).getHorasaida();
            row[6]=list.get(i).getPreço();
            row[7]=list.get(i).getStatus();
            model.addRow(row);
        }
    }
    
    public ArrayList<relatorio> carlistUmDia(){
        ArrayList<relatorio> usersList = new ArrayList<>();
        
        String sql = "SELECT * FROM cadastroveiculos WHERE data >= NOW() - INTERVAL 1 DAY <> ''";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            relatorio re;
            while (rs.next()) {
                re = new relatorio(rs.getString("veiculo"),
                            rs.getString("modelo"),
                            rs.getString("placa"), 
                            rs.getString("horaEntrada"), 
                            rs.getString("data"),
                            rs.getString("horasaida"),
                            rs.getString("preço"),
                            rs.getString("status"));
                                   
                usersList.add(re);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void show_car_Um(){
        ArrayList<relatorio> list = carlistUmDia();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        Object[] row = new Object[8];
        
        for(int i=0;i<list.size();i++){
            
            row[0]=list.get(i).getVeiculo();
            row[1]=list.get(i).getModelo();
            row[2]=list.get(i).getPlaca();
            row[3]=list.get(i).getHoraEntrada();
            row[4]=list.get(i).getData();
            row[5]=list.get(i).getHorasaida();
            row[6]=list.get(i).getPreço();
            row[7]=list.get(i).getStatus();
            model.addRow(row);
            
            
            
            
        }
        
    }
    public ArrayList<relatorio> carlistseven(){
        ArrayList<relatorio> usersList = new ArrayList<>();
        
        String sql = "SELECT * FROM cadastroveiculos WHERE data >= NOW() - INTERVAL 7 DAY <> ''";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            relatorio re;
            while (rs.next()) {
                re = new relatorio(rs.getString("veiculo"),
                            rs.getString("modelo"),
                            rs.getString("placa"), 
                            rs.getString("horaEntrada"), 
                            rs.getString("data"),
                            rs.getString("horasaida"),
                            rs.getString("preço"),
                            rs.getString("status"));
                                   
                usersList.add(re);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void show_car_sete(){
        ArrayList<relatorio> list = carlistseven();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        Object[] row = new Object[8];
        
        for(int i=0;i<list.size();i++){
            
            row[0]=list.get(i).getVeiculo();
            row[1]=list.get(i).getModelo();
            row[2]=list.get(i).getPlaca();
            row[3]=list.get(i).getHoraEntrada();
            row[4]=list.get(i).getData();
            row[5]=list.get(i).getHorasaida();
            row[6]=list.get(i).getPreço();
            row[7]=list.get(i).getStatus();
            model.addRow(row);
            
            
            
            
        }
        
    }
    
    public ArrayList<relatorio> carlistauinse(){
        ArrayList<relatorio> usersList = new ArrayList<>();
        
        String sql = "SELECT * FROM cadastroveiculos WHERE data >= NOW() - INTERVAL 15 DAY <> ''";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            relatorio re;
            while (rs.next()) {
                re = new relatorio(rs.getString("veiculo"),
                            rs.getString("modelo"),
                            rs.getString("placa"), 
                            rs.getString("horaEntrada"), 
                            rs.getString("data"),
                            rs.getString("horasaida"),
                            rs.getString("preço"),
                            rs.getString("status"));
                                   
                usersList.add(re);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void show_car_quinse(){
        ArrayList<relatorio> list = carlistauinse();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        Object[] row = new Object[8];
        
        for(int i=0;i<list.size();i++){
            
            row[0]=list.get(i).getVeiculo();
            row[1]=list.get(i).getModelo();
            row[2]=list.get(i).getPlaca();
            row[3]=list.get(i).getHoraEntrada();
            row[4]=list.get(i).getData();
            row[5]=list.get(i).getHorasaida();
            row[6]=list.get(i).getPreço();
            row[7]=list.get(i).getStatus();
            model.addRow(row);
            
            
            
            
        }
        
    }
        
    public ArrayList<relatorio> carlisttrinta(){
        ArrayList<relatorio> usersList = new ArrayList<>();
        
        String sql = "SELECT * FROM cadastroveiculos WHERE data >= NOW() - INTERVAL 30 DAY <> ''";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            relatorio re;
            while (rs.next()) {
                re = new relatorio(rs.getString("veiculo"),
                            rs.getString("modelo"),
                            rs.getString("placa"), 
                            rs.getString("horaEntrada"), 
                            rs.getString("data"),
                            rs.getString("horasaida"),
                            rs.getString("preço"),
                            rs.getString("status"));
                                   
                usersList.add(re);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void show_car_mes(){
        ArrayList<relatorio> list = carlisttrinta();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        Object[] row = new Object[8];
        
        for(int i=0;i<list.size();i++){
            
            row[0]=list.get(i).getVeiculo();
            row[1]=list.get(i).getModelo();
            row[2]=list.get(i).getPlaca();
            row[3]=list.get(i).getHoraEntrada();
            row[4]=list.get(i).getData();
            row[5]=list.get(i).getHorasaida();
            row[6]=list.get(i).getPreço();
            row[7]=list.get(i).getStatus();
            model.addRow(row);
            
            
            
            
        }
        
    }
    
    public ArrayList<relatorio> carlistnoventa(){
        ArrayList<relatorio> usersList = new ArrayList<>();
        
        String sql = "SELECT * FROM cadastroveiculos WHERE data >= NOW() - INTERVAL 90 DAY <> ''";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            relatorio re;
            while (rs.next()) {
                re = new relatorio(rs.getString("veiculo"),
                            rs.getString("modelo"),
                            rs.getString("placa"), 
                            rs.getString("horaEntrada"), 
                            rs.getString("data"),
                            rs.getString("horasaida"),
                            rs.getString("preço"),
                            rs.getString("status"));
                                   
                usersList.add(re);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void show_car_noventa(){
        ArrayList<relatorio> list = carlistnoventa();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        Object[] row = new Object[8];
        
        for(int i=0;i<list.size();i++){
            
            row[0]=list.get(i).getVeiculo();
            row[1]=list.get(i).getModelo();
            row[2]=list.get(i).getPlaca();
            row[3]=list.get(i).getHoraEntrada();
            row[4]=list.get(i).getData();
            row[5]=list.get(i).getHorasaida();
            row[6]=list.get(i).getPreço();
            row[7]=list.get(i).getStatus();
            model.addRow(row);
            
            
            
            
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        historicoComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Veiculo", "Modelo", "Placa", "Hora Entrada", "Hora Saida", "Utima Data", "Preço pago", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Carros Relatorio");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/icons8-pesquisar-mais-48.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        historicoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carros Cadastrados", "Ultimas 24 horas", "Ultimos 7 Dias", "Ultimos 15 Dias", "Ultimos 30 Dias", "Ultimos 90 Dias" }));
        historicoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(historicoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(historicoComboBox))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 6, 790, 361);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 810, 380);

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 102));
        jMenuBar1.setBorder(null);

        jMenu1.setText("Menu");

        jMenuItem1.setText("Entrada");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cadastro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Saida");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Carros Estacionados");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Carros Cadastrados");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 818, 435);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(historicoComboBox.getSelectedItem().equals("Carros Cadastrados")){
            show_car();
        }else if(historicoComboBox.getSelectedItem().equals("Ultimas 24 horas")){
            jTable1.removeAll();
            show_car_Um();
        }else if(historicoComboBox.getSelectedItem().equals("Ultimos 7 Dias")){
            jTable1.removeAll();
            show_car_sete();
        }else if(historicoComboBox.getSelectedItem().equals("Ultimos 15 Dias")){
            jTable1.removeAll();
            show_car_quinse();
        }else if(historicoComboBox.getSelectedItem().equals("Ultimos 30 Dias")){
            jTable1.removeAll();
            show_car_mes();
        }else if(historicoComboBox.getSelectedItem().equals("Ultimos 90 Dias")){
            jTable1.removeAll();
            show_car_noventa();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        telaEntrada te = new telaEntrada();
        te.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        telaCadastro tc = new telaCadastro();
        tc.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        telaSaida telasaida = new telaSaida();
        telasaida.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
        telaCarrosEstacionados tcc = new telaCarrosEstacionados();
        tcc.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
        telaCarrosCadastrados tcc = new telaCarrosCadastrados();
        tcc.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void historicoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historicoComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(telaCarrosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCarrosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCarrosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCarrosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCarrosCadastrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> historicoComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
