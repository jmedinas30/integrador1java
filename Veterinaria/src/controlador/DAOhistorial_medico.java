/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.ConexionMysql;
import modelo.cita;
import modelo.historial_medico;

/**
 *
 * @author Esteban
 */
public class DAOhistorial_medico {
    
    
     public void modifica(historial_medico ep) {
          Connection cn = ConexionMysql.getConexion();
        try {
            String sql= "update historial_medico set diagnostico = ? where id_mascota=?";
            PreparedStatement st = cn.prepareStatement(sql);
           
            st.setString(1, ep.getDiagnostico());
            st.setInt(2, ep.getId_mascota());
            st.executeUpdate();
            
            
        } catch (Exception e) {
        e.printStackTrace();
        }}
}
