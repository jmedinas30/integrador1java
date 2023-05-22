/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Esteban
 */
public class distrito {

    private int id_distrito;
    private String nombre;
    private int id_provincia;
    
    
     public distrito(int id, String name){
        this.id_distrito = id;
        this.nombre = name;
    }
    
    public int getId_distrito() {
        return id_distrito;
    }

    /**
     * @param id_distrito the id_distrito to set
     */
    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
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
     * @return the id_provincia
     */
    public int getId_provincia() {
        return id_provincia;
    }

    /**
     * @param id_provincia the id_provincia to set
     */
    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }
    
     public String toString(){
        return this.nombre;
    }
   
    
}
