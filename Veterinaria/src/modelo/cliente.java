/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Esteban
 */
public class cliente {
 private int idcliente;
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private String correo;
    private String direccion;
    private int id_dpto;
    private int id_pro;
    private int id_dist;
    private String foto;

    public cliente(int idcliente, String nombre, String apellidos, String dni, String telefono, String correo, String direccion, int id_dpto, int id_pro, int id_dist, String foto) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.id_dpto = id_dpto;
        this.id_pro = id_pro;
        this.id_dist = id_dist;
        this.foto = foto;
    }
    /**
     * @return the idcliente
     */
    public int getIdcliente() {
        return idcliente;
    }

    /**
     * @param idcliente the idcliente to set
     */
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
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
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the id_dpto
     */
    public int getId_dpto() {
        return id_dpto;
    }

    /**
     * @param id_dpto the id_dpto to set
     */
    public void setId_dpto(int id_dpto) {
        this.id_dpto = id_dpto;
    }

    /**
     * @return the id_pro
     */
    public int getId_pro() {
        return id_pro;
    }

    /**
     * @param id_pro the id_pro to set
     */
    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    /**
     * @return the id_dist
     */
    public int getId_dist() {
        return id_dist;
    }

    /**
     * @param id_dist the id_dist to set
     */
    public void setId_dist(int id_dist) {
        this.id_dist = id_dist;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
   
            
    
}
