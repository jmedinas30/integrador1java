/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import interfaces.Ipersonal;


import java.util.*;
import modelo.personal;
import modelo.veterinarios;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import modelo.ConexionMysql;
import modelo.cliente;
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
      
       public void adicion(personal ep) {
          Connection cn = ConexionMysql.getConexion();
        try {
            String sql= "insert into personal(nombres,apellidos, dni, direccion,  id_distrito, id_provincia, id_departamento, telefono,correo, tipo_personal, usuario, contrasena, estado) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, ep.getNombres());
            st.setString(2, ep.getApellidos());
            st.setString(3, ep.getDni());
            st.setString(4, ep.getDireccion());
            st.setInt(5,ep.getId_dist() );
            st.setInt(6,ep.getId_prov() );
            st.setInt(7,ep.getId_dep() );
             st.setString(8, ep.getTelef());
              st.setString(9, ep.getCorreo());
               st.setString(10, ep.getTipo());
                st.setString(11, ep.getUsuario());
                 st.setString(12, ep.getContra());
                  st.setString(13, ep.getEstado());
           
            st.executeUpdate();
            
            
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
       
       public void listar_medicos(JComboBox box){
        
        Connection cn = ConexionMysql.getConexion();
        DefaultComboBoxModel value;
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT id_personal, concat(nombres, ' ',apellidos) as veterinario from personal where tipo_personal = 'veterinario'");
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while(rs.next()){
             value.addElement(new modelo.veterinarios(rs.getInt(1),rs.getString(2)));
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                st.close();
                rs.close();
               cn.close();
            }catch(Exception ex){
            }
        }
     
     }

    
}
