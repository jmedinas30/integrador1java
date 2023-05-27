/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Esteban
 */
import interfaces.Imascota;
import java.sql.*;
import modelo.mascota;
import modelo.ConexionMysql;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import modelo.cliente;
import modelo.raza;
public class DAOmascota implements Imascota {
    
    public void adicion(mascota ep) {
          Connection cn = ConexionMysql.getConexion();
        try {
            String sql= "insert into mascota(nombre, fecha_nacimiento, id_cliente, id_especie, id_raza, sexo, peso, foto, infadic,fcreacion) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, ep.getNombre());
            st.setObject(2, ep.getFecha_nac());
            st.setInt(3, ep.getId_cliente());
            st.setInt(4, ep.getId_especie());
            st.setInt(5, ep.getId_raza());
            st.setString(6, ep.getSexo());
            st.setFloat(7,ep.getPeso());
            st.setBytes(8, ep.getFoto());
            st.setString(9, ep.getInfadi());
            st.setObject(10, ep.getFcreacion());
          
            st.executeUpdate();
            
            
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    
    
    @Override
     public List<mascota> listado() {
      List<mascota> lista = new ArrayList();
      
      Connection cn = ConexionMysql.getConexion();
      
        try {
            String sql = "select * from mascotasregistradas";
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
            mascota ep = new mascota();
            ep.setId_mascota(rs.getInt(1));
            ep.setNombre(rs.getString(2));
            ep.setFecha_nac(rs.getDate(3));
            ep.setId_cliente(rs.getInt(4));
            ep.setId_especie(rs.getInt(5));
            ep.setId_raza(rs.getInt(6));
            ep.setSexo(rs.getString(7));
            ep.setPeso(rs.getFloat(8));
            ep.setFoto(rs.getBytes(9));
            ep.setInfadi(rs.getString(10));
            ep.setFcreacion(rs.getDate(11));
            ep.setEspecie(rs.getString(12));
            ep.setRaza(rs.getString(13));
            ep.setCliente(rs.getString(14));
            lista.add(ep);
            
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return lista;
    }
     
    @Override
     public void anula(int id) {
         Connection cn = ConexionMysql.getConexion();
        try {
            String sql= "delete from mascota WHERE id_mascota = ? ";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
            
            
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
     
    @Override
      public void modifica(mascota ep) {
        Connection cn = ConexionMysql.getConexion();
        try {
            String sql= "UPDATE mascota SET nombre=?,fecha_nacimiento=?,id_cliente=?,id_especie=?,id_raza=?,sexo=?,peso=?,infadic=?,foto=? WHERE id_mascota = ? ";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, ep.getNombre());
            st.setObject(2, ep.getFecha_nac());
            st.setInt(3, ep.getId_cliente());
            st.setInt(4, ep.getId_especie());
              st.setInt(5, ep.getId_raza());
           st.setString(6, ep.getSexo());
           st.setFloat(7, ep.getPeso());
           st.setString(8, ep.getInfadi());
            st.setBytes(9, ep.getFoto());
           st.setInt(10, ep.getId_mascota());
            st.executeUpdate();
            
            
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
      
        public List<mascota> listado(int id) {
      List<mascota> lista = new ArrayList();
      
      Connection cn = ConexionMysql.getConexion();
      
        try {
            String sql = "select * from mascota where id_mascota = ?";
             PreparedStatement st = cn.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
            mascota ep = new mascota();
             ep.setId_mascota(rs.getInt(1));
            ep.setNombre(rs.getString(2));
            ep.setFecha_nac(rs.getDate(3));
            ep.setId_cliente(rs.getInt(4));
            ep.setId_especie(rs.getInt(5));
            ep.setId_raza(rs.getInt(6));
            ep.setSexo(rs.getString(7));
            ep.setPeso(rs.getFloat(8));
            ep.setFoto(rs.getBytes(9));
            ep.setInfadi(rs.getString(10));
            ep.setFcreacion(rs.getDate(11));
            lista.add(ep);
            
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return lista;
}
}
