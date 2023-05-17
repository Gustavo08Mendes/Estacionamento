/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

/**
 *
 * @author gustavo
 */
public class CadastroVeiculo {
    
    private String placa;
    private String veiculo;
    private String modelo;
    private String estacionado;
    private String idveiculo;
    private String horaEntrada;
    private String data;
    private String status;
    private String horaSaida;
    private String preco;
    private String mensal;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstacionado() {
        return estacionado;
    }

    public void setEstacionado(String estacionado) {
        this.estacionado = estacionado;
    }

    public String getIdveiculo() {
        return idveiculo;
    }

    public void setIdveiculo(String idveiculo) {
        this.idveiculo = idveiculo;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }  

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getMensal() {
        return mensal;
    }

    public void setMensal(String mensal) {
        this.mensal = mensal;
    }
    
    
    
    
    public void inserir(){
        String sql = "INSERT INTO cadastroveiculos(veiculo, modelo, placa, HoraEntrada, data, mensal) VALUES (?, ?, ?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, veiculo);
            ps.setString(2, modelo);
            ps.setString(3, placa);
            ps.setString(4, horaEntrada);
            ps.setString(5,data);
            ps.setString(6, mensal);
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void inserirSim(){
        String sql = "INSERT INTO cadastroveiculos(estacionado) VALUES (?)";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, estacionado);
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public CadastroVeiculo consulta(){

        CadastroVeiculo a = null;
        //Comando Sql
        String sql = "SELECT * FROM cadastroveiculos WHERE placa = ? ";
        //Abre uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, placa);
            //Compila os commandos
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                a = new CadastroVeiculo();
                //Preenche os campos faltando
                a.setModelo(rs.getString("modelo"));
                a.setPlaca(rs.getString("placa"));
                a.setHoraEntrada(rs.getString("HoraEntrada"));
                a.setData(rs.getString("data"));
                a.setMensal(rs.getString("mensal"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return a;
    }
    public void atualizar(){
        String sql = "UPDATE cadastroveiculos SET estacionado = ?, horasaida = ?, preço = ?, status = ?  WHERE placa = ?";
                
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql); 
            ps.setString(1, estacionado);
            ps.setString(2, horaSaida);
            ps.setString(3, preco);
            ps.setString(4, status);
            ps.setString(5, placa);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void atualizarEntrada(){
        String sql = "UPDATE cadastroveiculos SET estacionado = ?, status = ?  WHERE placa = ?";
                
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql); 
            ps.setString(1, estacionado);
            ps.setString(2, status);
            ps.setString(3, placa);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}