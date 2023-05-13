/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import interfaces.Ipersonal;


import java.util.*;
import modelo.personal;
import java.sql.*;
import modelo.ConexionMysql;
public class DAOpersonal implements Ipersonal{
    
      public personal login(String usuario, String pass) {
        personal ep = null;
       Connection cn = ConexionMysql.getConexion();
      
        try {
            String sql = "select usuario, contrasena from personal where usuario = ? and contrasena= ?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, usuario);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()){
           ep = new personal();
            ep.setUsuario(rs.getString(1));
            ep.setContra(rs.getString(2));         
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ep;
    }
    
}
