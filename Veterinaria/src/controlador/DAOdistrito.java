/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import modelo.ConexionMysql;
public class DAOdistrito {
    public void listar_distrito(JComboBox box, int id){
         Connection cn = ConexionMysql.getConexion();
        DefaultComboBoxModel value;
      
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        try{
          
            ps = cn.prepareStatement("SELECT * FROM distrito where id_provincia = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while(rs.next()){
                value.addElement(new modelo.distrito(rs.getInt(1),rs.getString(2)));
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
