/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento.preço;

/**
 *
 * @author gustavo
 */
public class relatorioVeiculos {
    private String veiculo,preco;
    
    public relatorioVeiculos(String veiculo, String preco){
        this.veiculo=veiculo;
        this.preco=preco;

    }

    public String getVeiculo() {
        return veiculo;
    }
    public String getPreco() {
        return preco;
    }

}

