/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.ConexionMysql;
import modelo.raza;
import interfaces.Iraza;
import java.util.ArrayList;
import java.util.List;
import modelo.cliente;

/**
 *
 * @author Esteban
 */
public class DAOraza implements Iraza{
    
    
  /*  public raza busca(int id) {
        raza ep = null;
       Connection cn = ConexionMysql.getConexion();
      
        try {
            String sql = "select id_raza, nombre from raza where id_especie = ?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()){
           ep = new raza();
            ep.setId_raza(rs.getInt(1));
            ep.setNombre(rs.getString(2));
            
           
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ep; 
    }*/
      public List<raza> listado(int id) {
      List<raza> lista = new ArrayList();
      
      Connection cn = ConexionMysql.getConexion();
      
        try {
            String sql = "select id_raza, nombre from raza where id_especie = ?";
             PreparedStatement st = cn.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
            raza ep = new raza();
            ep.setId_raza(rs.getInt(1));
            ep.setNombre(rs.getString(2));
            lista.add(ep);
            
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return lista;
}
}