/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.ConexionMysql;
import modelo.cita;
import modelo.personal;
import interfaces.Icita;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.mascota;

/**
 *
 * @author Esteban
 */
public class DAOcita implements Icita{
    
      public void adicion(cita ep) {
          Connection cn = ConexionMysql.getConexion();
        try {
            String sql= "insert into cita(fecha_hora, id_mascota, id_veterinario, estado) values (?,?,?,?)";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setObject(1, ep.getFecha_hora());
            st.setInt(2, ep.getIdmascota());
            st.setInt(3, ep.getIdveterinario());
            st.setString(4,ep.getEstado());
            st.executeUpdate();
            
            
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
      
       public List<cita> listado(Date fecha) {
      List<cita> lista = new ArrayList();
      
      Connection cn = ConexionMysql.getConexion();
      
        try {
            String sql = "select fecha_hora,id_veterinario from cita  where date(fecha_hora) = ? ";
            PreparedStatement st = cn.prepareStatement(sql);
              st.setObject(1, fecha);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
            cita ep = new cita();
            ep.setFecha_hora(rs.getTimestamp(1));
            ep.setIdveterinario(rs.getInt(2));
            lista.add(ep);
            
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return lista;
    }
    
}
