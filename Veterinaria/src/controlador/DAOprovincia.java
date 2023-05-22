/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.ConexionMysql;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class DAOprovincia {

public void listar_provincia(JComboBox box, int id){
        
        DefaultComboBoxModel value;
        Connection cn = ConexionMysql.getConexion();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        try{
           ps = cn.prepareStatement("SELECT * FROM provincia where id_departamento = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while(rs.next()){
                value.addElement(new modelo.provincia(rs.getInt(1),rs.getString(2)));
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                con.close();
            }catch(Exception ex){
            }
        }
        
    }
    

    
    
}
