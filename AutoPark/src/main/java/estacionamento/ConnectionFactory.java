/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estacionamento;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Gustavo
 */

public class ConnectionFactory{
    
    private String usuario = "root";
    private String senha = "903390";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "estacionamento";
    
    public Connection obtemConexao (){
        try{
        Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd,usuario,senha);
        return c;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

