/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Esteban
 */
public class provincia {

    /**
     * @return the id_provincia
     */
    private int id_provincia;
    private String nombre;
    private int id_departamento;
            
    

    public provincia(int id, String name){
        this.id_provincia = id;
        this.nombre = name;
    }
    
    public int getId_provincia() {
        return id_provincia;
    }

    /**
     * @param id_provincia the id_provincia to set
     */
    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
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
     * @return the id_departamento
     */
    public int getId_departamento() {
        return id_departamento;
    }

    /**
     * @param id_departamento the id_departamento to set
     */
    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }
    
     public String toString(){
        return this.nombre;
    }
    
}
