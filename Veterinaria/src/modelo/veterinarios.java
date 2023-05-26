/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Esteban
 */
public class veterinarios {

    /**
     * @return the id_personal
     */
    public int getId_personal() {
        return id_personal;
    }

    /**
     * @param id_personal the id_personal to set
     */
    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
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
    private int id_personal;
    private String veterinario;

    public veterinarios(int id_personal, String veterinario) {
        this.id_personal = id_personal;
        this.veterinario = veterinario;
    }
    
      public veterinarios() {
      
    }
       public String toString (){
     return this.veterinario;
 }
   
}
    

