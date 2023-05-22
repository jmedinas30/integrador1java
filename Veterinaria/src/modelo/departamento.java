/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Esteban
 */
public class departamento {
  private int id_depa;
    private String depa;
    
    public departamento(){
    
    }
    
     public departamento(int id_depa, String depa) {
        this.id_depa = id_depa;
        this.depa = depa;
    }
    /**
     * @return the id_depa
     */
    public int getId_depa() {
        return id_depa;
    }

    /**
     * @param id_depa the id_depa to set
     */
    public void setId_depa(int id_depa) {
        this.id_depa = id_depa;
    }

    /**
     * @return the depa
     */
    public String getDepa() {
        return depa;
    }

    /**
     * @param depa the depa to set
     */
    public void setDepa(String depa) {
        this.depa = depa;
    }
  
  @Override
 public String toString (){
     return this.depa;
 }
   
}
