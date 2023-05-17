/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento.preço;

import estacionamento.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gustavo
 */
public class cadastroPreco {
    private String veiculo;
    private String preco;

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    
        public void inserir(){
            String sql = "INSERT INTO preco_veiculo(veiculo, preco) VALUES (?, ?)";
            ConnectionFactory factory = new ConnectionFactory();
            try (Connection c = factory.obtemConexao()){
                PreparedStatement ps = c.prepareStatement(sql);
                ps.setString(1, veiculo);
                ps.setString(2, preco);
                ps.execute();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        
        public cadastroPreco consulta(){

        cadastroPreco a = null;
        //Comando Sql
        String sql = "SELECT * FROM preco_veiculo WHERE veiculo = ? ";
        //Abre uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, veiculo);
            //Compila os commandos
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                a = new cadastroPreco();
                //Preenche os campos faltando
                a.setPreco(rs.getString("preco"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return a;
        }
        
        public cadastroPreco consultaVeiculos(){

        cadastroPreco a = null;
        //Comando Sql
        String sql = "SELECT veiculo FROM preco_veiculo";
        //Abre uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            //Compila os commandos
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                a = new cadastroPreco();
                //Preenche os campos faltando
                a.setVeiculo(rs.getString("veiculo"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return a;
        }
        
}
