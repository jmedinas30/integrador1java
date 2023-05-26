/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Esteban
 */
public class raza {

    public raza(int id_raza, int id_especie, String nombre) {
        this.id_raza = id_raza;
        this.id_especie = id_especie;
        this.nombre = nombre;
    }

    public raza(){
    
    
    }
    
   private int id_raza;
   private int id_especie;
   private String nombre;
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
    
    
}
