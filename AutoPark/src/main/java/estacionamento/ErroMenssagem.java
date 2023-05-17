/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gusta
 */
public class ErroMenssagem {
    String placa;

    
    public ErroMenssagem(String placa){
    this.placa = placa;
    } 
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    
   
    public boolean existeCarro(ErroMenssagem carro) throws Exception{
    String sql = "SELECT * FROM cadastroveiculos WHERE placa = ?";
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao();            
        PreparedStatement ps = c.prepareStatement(sql)){
    ps.setString(1, carro.getPlaca());
    try (ResultSet rs = ps.executeQuery()){ 
      return rs.next();
        }
      }
    }
}
