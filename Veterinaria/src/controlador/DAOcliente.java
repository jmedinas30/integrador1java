/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import interfaces.Icliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.ConexionMysql;
import modelo.cliente;

/**
 *
 * @author Esteban
 */
public class DAOcliente implements Icliente{
    
    
    
    
    public void adicion(cliente ep) {
          Connection cn = ConexionMysql.getConexion();
        try {
            String sql= "insert into cliente(id_cliente, nombre,apellidos, sexo,tdoc,dni,celular,correo,direccion, id_departamento, id_provincia, id_distrito, foto, Observaciones, fcreacion) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setInt(1, ep.getIdcliente());
            st.setString(2, ep.getNombre());
            st.setString(3, ep.getApellidos());
            st.setString(4, ep.getSexo());
            st.setString(5, ep.getTdoc());
            st.setString(6, ep.getDni());
            st.setString(7, ep.getTelefono());
            st.setString(8, ep.getCorreo());
            st.setString(9, ep.getDireccion());
           st.setInt(10, ep.getId_dpto());
           st.setInt(11, ep.getId_pro());
           st.setInt(12, ep.getId_dist());
           st.setBytes(13, ep.getFoto());
            st.setString(14, ep.getObs());
            st.setString(15, ep.getFcreacion());
            st.executeUpdate();
            
            
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    
  public List<cliente> listado() {
      List<cliente> lista = new ArrayList();
      
      Connection cn = ConexionMysql.getConexion();
      
        try {
            String sql = "select * from cliente";
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
            cliente ep = new cliente();
            ep.setIdcliente(rs.getInt(1));
            ep.setNombre(rs.getString(2));
            ep.setApellidos(rs.getString(3));
            ep.setSexo(rs.getString(4));
            ep.setTdoc(rs.getString(5));
            ep.setDni(rs.getString(6));
            ep.setTelefono(rs.getString(7));
            ep.setCorreo(rs.getString(8));
            ep.setDireccion(rs.getString(9));
            ep.setId_dpto(rs.getInt(10));
            ep.setId_pro(rs.getInt(11));
            ep.setId_dist(rs.getInt(12));
            ep.setFoto(rs.getBytes(13));
            ep.setObs(rs.getString(14));
            ep.setFcreacion(rs.getString(15));
            lista.add(ep);
            
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return lista;
    }
  
  
   public void anula(int id) {
         Connection cn = ConexionMysql.getConexion();
        try {
            String sql= "delete from cliente WHERE id_cliente = ? ";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
            
            
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    
}
