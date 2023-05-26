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
public class mascota {

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
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

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fecha_nac
     */
    public Date getFecha_nac() {
        return fecha_nac;
    }

    /**
     * @param fecha_nac the fecha_nac to set
     */
    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the id_especie
     */
    public int getId_especie() {
        return id_especie;
    }

    /**
     * @param id_especie the id_especie to set
     */
    public void setId_especie(int id_especie) {
        this.id_especie = id_especie;
    }

    /**
     * @return the id_raza
     */
    public int getId_raza() {
        return id_raza;
    }

    /**
     * @param id_raza the id_raza to set
     */
    public void setId_raza(int id_raza) {
        this.id_raza = id_raza;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the foto
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    /**
     * @return the infadi
     */
    public String getInfadi() {
        return infadi;
    }

    /**
     * @param infadi the infadi to set
     */
    public void setInfadi(String infadi) {
        this.infadi = infadi;
    }

    /**
     * @return the fcreacion
     */
    public Date getFcreacion() {
        return fcreacion;
    }

    /**
     * @param fcreacion the fcreacion to set
     */
    public void setFcreacion(Date fcreacion) {
        this.fcreacion = fcreacion;
    }

    public mascota(int id_mascota, String nombre, Date fecha_nac, int id_cliente, int id_especie, int id_raza, String sexo, float peso, byte[] foto, String infadi, Date fcreacion, String especie, String raza, String cliente) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.fecha_nac = fecha_nac;
        this.id_cliente = id_cliente;
        this.id_especie = id_especie;
        this.id_raza = id_raza;
        this.sexo = sexo;
        this.peso = peso;
        this.foto = foto;
        this.infadi = infadi;
        this.fcreacion = fcreacion;
        this.especie = especie;
        this.raza = raza;
        this.cliente = cliente;
    }
    
    private int id_mascota;
    private String nombre;
    private Date fecha_nac;
    private int id_cliente;
    private int id_especie;
    private int id_raza;
    private String sexo;
    private float peso;
    private byte[] foto;
    private String infadi;
    private Date fcreacion;
    private String especie;
    private String raza;
    private String cliente;
    
    public mascota(){
    
    }

   
    
    
}
