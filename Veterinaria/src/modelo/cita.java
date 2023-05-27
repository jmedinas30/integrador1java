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

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the mascota
     */
    public String getMascota() {
        return mascota;
    }

    /**
     * @param mascota the mascota to set
     */
    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    /**
     * @return the veterinario
     */
    public String getVeterinario() {
        return veterinario;
    }

    /**
     * @param veterinario the veterinario to set
     */
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public cita (){
    
    }

    public cita(int idcita, Date fecha_hora, int idmascota, int idveterinario, String estado, String mascota, String veterinario, String cliente, String correo, String celular, String tipo) {
        this.idcita = idcita;
        this.fecha_hora = fecha_hora;
        this.idmascota = idmascota;
        this.idveterinario = idveterinario;
        this.estado = estado;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.cliente = cliente;
        this.correo = correo;
        this.celular = celular;
        this.tipo = tipo;
    }

  private int idcita;
    private Date fecha_hora;
    private int idmascota;
    
    private int idveterinario;
    private String estado;
    private String mascota;
    private String veterinario;
    private String cliente;
    private String correo;
    private String celular;
    private String tipo;
   

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
