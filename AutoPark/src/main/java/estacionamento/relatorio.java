/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author gusta
 */
public class relatorio {
        private String veiculo,modelo,placa,horaEntrada,data,horasaida,preço,status;
    
    public relatorio(String veiculo, String modelo, String placa, String horaEntrada, String horasaida, String data, String preço, String status){
        this.veiculo=veiculo;
        this.modelo=modelo;
        this.placa=placa;
        this.horaEntrada=horaEntrada;
        this.data=data;
        this.horasaida=horasaida;
        this.preço=preço;
        this.status=status;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
    
    public String getHoraEntrada() {
        return horaEntrada;
    }

    public String getHorasaida() {
        return horasaida;
    }
    
    public String getData() {
        return data;
    }

    public String getPreço() {
        return preço;
    }

    public String getStatus() {
        return status;
    }
    
    
}

