/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Esteban
 */
public class historial_medico {

    /**
     * @return the id_historia
     */
    public int getId_historia() {
        return id_historia;
    }

    /**
     * @param id_historia the id_historia to set
     */
    public void setId_historia(int id_historia) {
        this.id_historia = id_historia;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @return the id_mascota
     */
    public int getId_mascota() {
        return id_mascota;
    }

    /**
     * @param id_mascota the id_mascota to set
     */
    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public historial_medico(int id_historia, Date fecha, String diagnostico, int id_mascota) {
        this.id_historia = id_historia;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.id_mascota = id_mascota;
    }
    
    public historial_medico(){
    
    }
    private int id_historia;
    private Date fecha;
    private String diagnostico;
    private int id_mascota;
    
    
    
}
