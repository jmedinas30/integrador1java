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
public class cita {
  private int idcita;
    private Date fecha_hora;
    private int idmascota;
    private int idveterinario;
    
    public cita(int idcita, Date fecha_hora, int idmascota, int idveterinario) {
        this.idcita = idcita;
        this.fecha_hora = fecha_hora;
        this.idmascota = idmascota;
        this.idveterinario = idveterinario;
    }

    /**
     * @return the idcita
     */
    public int getIdcita() {
        return idcita;
    }

    /**
     * @param idcita the idcita to set
     */
    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    /**
     * @return the fecha_hora
     */
    public Date getFecha_hora() {
        return fecha_hora;
    }

    /**
     * @param fecha_hora the fecha_hora to set
     */
    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    /**
     * @return the idmascota
     */
    public int getIdmascota() {
        return idmascota;
    }

    /**
     * @param idmascota the idmascota to set
     */
    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    /**
     * @return the idveterinario
     */
    public int getIdveterinario() {
        return idveterinario;
    }

    /**
     * @param idveterinario the idveterinario to set
     */
    public void setIdveterinario(int idveterinario) {
        this.idveterinario = idveterinario;
    }
  
    
}
