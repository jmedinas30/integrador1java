/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.ConexionMysql;
import modelo.licencia;
import modelo.raza;
import interfaces.Ilicencia;
import java.util.Calendar;
import modelo.mascota;

/**
 *
 * @author Esteban
 */
public class DAOlicencia implements Ilicencia{

    /**
     * @return the id_licencia
     */
    @Override
    public List<licencia> listado() {
      List<licencia> lista = new ArrayList();
      
      Connection cn = ConexionMysql.getConexion();
      
        try {
            String sql = "select id_licencia, fecha_fin from licencia";
             PreparedStatement st = cn.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
            
            while(rs.next()){
            licencia ep = new licencia();
            ep.setId_licencia(rs.getInt(1));
            ep.setFecha_fin(rs.getDate(2));
            lista.add(ep);
            
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return lista;
    }
    
     public void modifica(licencia ep) {
        Connection cn = ConexionMysql.getConexion();
        try {
            String sql= "UPDATE licencia SET ID_licencia=?,fecha_fin=? WHERE ID_licencia = ? ";
            PreparedStatement st = cn.prepareStatement(sql);
           int nuevalicencia = ep.getId_licencia() + 10; //SUMO 10 al id de licencia para que no pueda ser usada nuevamente
            Date fechaFin = ep.getFecha_fin(); // Obtener la fecha de fin

            Calendar calendar = Calendar.getInstance(); // Crear instancia de Calendar
            calendar.setTime(fechaFin); // Establecer la fecha de fin en el Calendar
            calendar.add(Calendar.YEAR, 1); // Sumar un año al Calendar
            Date nuevaFechaFin = calendar.getTime(); // Obtener la nueva fecha de fin

            
            st.setInt(1, nuevalicencia);
            st.setObject(2, nuevaFechaFin);
            st.setInt(3, ep.getId_licencia());

            st.executeUpdate();
                       
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
