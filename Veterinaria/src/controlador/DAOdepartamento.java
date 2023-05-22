/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;




import interfaces.Idepartamento;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import modelo.departamento;
import modelo.ConexionMysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DAOdepartamento {
    
       public void listar_departamento(JComboBox box){
        
        Connection cn = ConexionMysql.getConexion();
        DefaultComboBoxModel value;
        Statement st = null;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM departamento");
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while(rs.next()){
              value.addElement(new modelo.departamento(rs.getInt(1),rs.getString(2)));
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
    

