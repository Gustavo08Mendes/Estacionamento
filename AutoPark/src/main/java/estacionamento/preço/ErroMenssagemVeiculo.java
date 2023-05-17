/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.preço;

import estacionamento.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gusta
 */
public class ErroMenssagemVeiculo {
    String veiculo;

    
    public ErroMenssagemVeiculo(String veiculo){
    this.veiculo = veiculo;
    } 
    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    
    
   
    public boolean existeVeiculo(ErroMenssagemVeiculo carro) throws Exception{
    String sql = "SELECT * FROM preco_veiculo WHERE veiculo = ?";
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao();            
        PreparedStatement ps = c.prepareStatement(sql)){
    ps.setString(1, carro.getVeiculo());
    try (ResultSet rs = ps.executeQuery()){ 
      return rs.next();
        }
      }
    }
}
