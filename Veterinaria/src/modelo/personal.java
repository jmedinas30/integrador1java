
package modelo;

/**
 *
 * @author Esteban
 */
public class personal {

      private int idpersonal;
    private String nombres;
    private String apellidos;
    private String dni;
    private String direccion;
    private int id_dist;
    private int id_prov;
   private int id_dep;
 private String telef;
 private String correo;
 private String tipo;
private String usuario;
   private String contra;
 private String estado;
 
 
 public personal(){
 
 }
    
    public personal( String usuario, String contra) {
       
        this.usuario = usuario;
        this.contra = contra;
    
    }

    /**
     * @return the idpersonal
     */
    public int getIdpersonal() {
        return idpersonal;
    }

    /**
     * @param idpersonal the idpersonal to set
     */
    public void setIdpersonal(int idpersonal) {
        this.idpersonal = idpersonal;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
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
     * @return the id_prov
     */
    public int getId_prov() {
        return id_prov;
    }

    /**
     * @param id_prov the id_prov to set
     */
    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }

    /**
     * @return the id_dep
     */
    public int getId_dep() {
        return id_dep;
    }

    /**
     * @param id_dep the id_dep to set
     */
    public void setId_dep(int id_dep) {
        this.id_dep = id_dep;
    }

    /**
     * @return the telef
     */
    public String getTelef() {
        return telef;
    }

    /**
     * @param telef the telef to set
     */
    public void setTelef(String telef) {
        this.telef = telef;
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
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contra
     */
    public String getContra() {
        return contra;
    }

    /**
     * @param contra the contra to set
     */
    public void setContra(String contra) {
        this.contra = contra;
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



    /**
     * @return the idpersonal
     */

   
   
}
