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
public class licencia {

    /**
     * @return the id_licencia
     */
    public int getId_licencia() {
        return id_licencia;
    }

    /**
     * @param id_licencia the id_licencia to set
     */
    public void setId_licencia(int id_licencia) {
        this.id_licencia = id_licencia;
    }

    /**
     * @return the fecha_fin
     */
    public Date getFecha_fin() {
        return fecha_fin;
    }

    /**
     * @param fecha_fin the fecha_fin to set
     */
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    private int id_licencia;
    private Date fecha_fin;

    public licencia() {
    }

    public licencia(int id_licencia, Date fecha_fin) {
        this.id_licencia = id_licencia;
        this.fecha_fin = fecha_fin;
    }
}
