/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import java.awt.Image;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import controlador.DAOdepartamento;
import controlador.DAOprovincia;
import controlador.DAOdistrito;
import controlador.DAOmascota;
import controlador.DAOcliente;
import controlador.DAOraza;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.ZoneId;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionMysql;
import modelo.cliente;
import modelo.mascota;
import modelo.provincia;
import modelo.raza;


/**
 *
 * @author Esteban
 */
public class FRMmascotaup extends javax.swing.JInternalFrame {
  DAOdepartamento de = new DAOdepartamento();
  DAOprovincia pr = new DAOprovincia();
  DAOdistrito di = new DAOdistrito();
   String ruta = null;
   ButtonGroup sexo;
   private FRMlistamascota mascota;
   DAOmascota obj = new DAOmascota();
   DAOcliente obj2 = new DAOcliente();
    DAOraza obj3 = new DAOraza();
   private String dato;
   
   public void setFormulario2(FRMlistamascota mascota) {
    this.mascota = mascota;
    
    
}
   public void setValorTextBox2(String valor3, String valor4 ) {
    txtcliente.setText(valor3);
    lblcodigo.setText(valor4);
    
}
     public void setrazavalor(int valor ) {
       int cod = 0;
       cod = valor;
       lblmascota.setText(String.valueOf(cod));
 //   DefaultTableModel dt = (DefaultTableModel)tblraza.getModel();
   //     dt.setRowCount(0);
     
         for (mascota x:obj.listado(Integer.parseInt(lblmascota.getText()))){

                   
           txtreg.setText(String.valueOf(x.getId_mascota()));
           txtmascota.setText(x.getNombre());
           lblcodigo.setText(String.valueOf(x.getId_cliente()));
           txtpeso.setText(String.valueOf(x.getPeso()));
           txtfecha.setText(String.valueOf(x.getFcreacion()));
           lblcodraza.setText(String.valueOf(x.getId_raza()));
           txtobs.setText(x.getInfadi());
byte[] imageBytes = x.getFoto(); // Supongamos que x es tu objeto y x.getFoto() devuelve el array de bytes de la imagen
ImageIcon imageIcon = new ImageIcon(imageBytes);
// Obtiene la imagen original del ImageIcon
Image imagenOriginal = imageIcon.getImage();
// Redimensiona la imagen al tamaño deseado
Image imagenRedimensionada = imagenOriginal.getScaledInstance(176, 198, Image.SCALE_SMOOTH);
// Crea un nuevo ImageIcon con la imagen redimensionada
ImageIcon imagenRedimensionadaIcono = new ImageIcon(imagenRedimensionada);

lblimagen.setIcon(imagenRedimensionadaIcono);



            fnac.setDate((x.getFecha_nac()));
           
           String  sexo  = x.getSexo();
           if (sexo == "Macho"){
           rbtmen.setSelected(true);
            } else {
           rbtfem.setSelected(true);
           }
           
           String especie = x.getEspecie();
           
           if(especie =="1"){
               Cboespecie.setSelectedItem("GATOS");
           }    else{
                         Cboespecie.setSelectedItem("PERROS");
                       }
               
           
           
                   
           
            }
         int cod_cli = Integer.parseInt(lblcodigo.getText());
         for (cliente x:obj2.listado2(cod_cli)){
             
              txtcliente.setText(x.getNombre());
              
             
         }
         int cod_raza = Integer.parseInt(lblcodraza.getText());
         for (raza x:obj3.listado2(cod_raza)){
             
              txtraza.setText(x.getNombre());
              
             
         }
   
}
   
   
   
   
    public FRMmascotaup() {
        initComponents();  
        sexo = new ButtonGroup();
        sexo.add(rbtmen);
        sexo.add(rbtfem);
       nuevocliente();
       txtreg.setEnabled(false);
       txtfecha.setEnabled(false);
      Cboespecie.removeAllItems();
        Cboespecie.addItem("--Seleccione--");
        Cboespecie.addItem("GATOS");
        Cboespecie.addItem("PERROS");
        txtraza.setEnabled(false);
        LocalDate fechaActual = LocalDate.now();
        this.txtfecha.setText(fechaActual.toString());
        txtcliente.setEnabled(false);
        Cboespecie.setEnabled(false);
        
    }
    
    void nuevocliente() {
    int maxIdmascota = 0;

  for (mascota x : obj.listado()) {
        if (x.getId_mascota()> maxIdmascota) {
            maxIdmascota = x.getId_mascota();
        }
    }

    int nuevoIdmascota = maxIdmascota + 1;
    txtreg.setText(String.valueOf(nuevoIdmascota));

    // Aquí puedes utilizar el nuevoIdCliente para realizar alguna acción, como asignarlo a un nuevo cliente.
    // Por ejemplo: cliente nuevoCliente = new cliente(nuevoIdCliente, ...);
}
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtreg = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        lblcodigo = new javax.swing.JLabel();
        lblmascota = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbtmen = new javax.swing.JRadioButton();
        rbtfem = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtdir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobs = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        txtmascota = new javax.swing.JTextField();
        lblimagen = new javax.swing.JLabel();
        fnac = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbledad = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Cboespecie = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtraza = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblcodraza = new javax.swing.JLabel();
        lblruta = new javax.swing.JLabel();
        btnadd1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Actualizar registro mascotas");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel2.setText("Fecha de registro");

        txtreg.setText("C000001");
        txtreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregActionPerformed(evt);
            }
        });

        txtfecha.setText("19/05/2023");

        jLabel1.setText("N° de registro");

        lblcodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblcodigo.setText("idcliente-oculto");

        lblmascota.setForeground(new java.awt.Color(255, 255, 255));
        lblmascota.setText("lblmascota-oculto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblmascota))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtreg, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(lblcodigo)
                    .addComponent(lblmascota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtreg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));

        jLabel3.setText("Nombre de la mascota");

        jLabel6.setText("Sexo");

        rbtmen.setText("Macho");
        rbtmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtmenActionPerformed(evt);
            }
        });

        rbtfem.setText("Hembra");
        rbtfem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtfemActionPerformed(evt);
            }
        });

        jLabel10.setText("Información adicional sobre la mascota");

        jLabel12.setText("Fecha Nacimiento");

        txtobs.setColumns(20);
        txtobs.setRows(5);
        jScrollPane1.setViewportView(txtobs);

        lblimagen.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblimagen.setText("        FOTO");
        lblimagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        fnac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnacMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fnacMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fnacMousePressed(evt);
            }
        });
        fnac.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                fnacInputMethodTextChanged(evt);
            }
        });

        jLabel17.setText("Peso:");

        jButton1.setText("Subir foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbledad.setText("...");

        jLabel16.setText("Ruta:");

        jLabel7.setText("Especie");

        Cboespecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Raza");

        txtraza.setToolTipText("");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblcodraza.setForeground(new java.awt.Color(255, 255, 255));
        lblcodraza.setText("jLabel4");

        lblruta.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdir)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel6))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(rbtmen)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbtfem)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel17))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(fnac, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(txtmascota, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel7))
                                            .addComponent(jButton2))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lbledad))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jLabel8))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Cboespecie, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(118, 118, 118)
                                                .addComponent(lblcodraza))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtraza, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 22, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblruta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jSeparator2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmascota, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel17))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rbtmen)
                                            .addComponent(rbtfem)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(txtpeso))))
                            .addComponent(fnac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbledad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(lblcodraza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cboespecie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtraza, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel16)
                    .addComponent(lblruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnadd1.setBackground(new java.awt.Color(0, 102, 102));
        btnadd1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd1.setText("Actualizar Cambios");
        btnadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnadd1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtregActionPerformed

    public void setDato(String dato){
        txtcliente.setText(dato);

    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Date fecha = fnac.getDate();
      long fechas = fecha.getTime();
      java.sql.Date fecha_sql = new java.sql.Date(fechas);
      
      // Obtén la fecha de nacimiento
Date fechaNacimiento = fnac.getDate();

// Convierte la fecha de nacimiento a LocalDate
LocalDate fechaNacimientoLocalDate = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

// Obtén la fecha actual
LocalDate fechaActual = LocalDate.now();

// Calcula la diferencia entre la fecha de nacimiento y la fecha actual
Period periodo = Period.between(fechaNacimientoLocalDate, fechaActual);

// Obtiene los componentes de la diferencia
int años = periodo.getYears();
int meses = periodo.getMonths();
int días = periodo.getDays();

// Muestra el resultado
String resultado = "Años: " + años + ", Meses: " + meses + ", Días: " + días;
lbledad.setText(resultado);

      
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          JFileChooser j = new JFileChooser();

        int ap = j.showOpenDialog(this);

        if (ap == JFileChooser.APPROVE_OPTION){
            ruta = j.getSelectedFile().getAbsolutePath();
            ImageIcon imagenOriginal = new ImageIcon(ruta);

            // Obtiene la imagen y redimensiona al tamaño deseado (200x200)
            Image imagen = imagenOriginal.getImage();
            Image imagenRedimensionada = imagen.getScaledInstance(176, 198, Image.SCALE_SMOOTH);

            // Crea un nuevo ImageIcon con la imagen redimensionada
            ImageIcon imagenRedimensionadaIcono = new ImageIcon(imagenRedimensionada);

            lblimagen.setIcon(imagenRedimensionadaIcono);

            lblruta.setText(ruta);

        } 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbtfemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtfemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtfemActionPerformed

    private void rbtmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtmenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtmenActionPerformed

    private void btnadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd1ActionPerformed
       
      
        mascota cli = new mascota();
        String sexo = null;
     //   cli.setIdcliente(Integer.parseInt(txtreg.getText()));
        cli.setNombre(txtmascota.getText());
         Date fecha = fnac.getDate();
      long fechas = fecha.getTime();
      java.sql.Date fecha_sql = new java.sql.Date(fechas);
        cli.setFecha_nac(fecha_sql);
        cli.setId_cliente(Integer.parseInt(lblcodigo.getText()));
        
        String especie = Cboespecie.getSelectedItem().toString();
        int id_especie = 0;
        if (especie == "GATOS"){
            id_especie = 1;
        }else {
            id_especie = 2;
        }
        cli.setId_especie(id_especie);
        cli.setId_raza(Integer.parseInt(lblcodraza.getText()));
        
        
        if (rbtfem.isSelected()){
            sexo = "Hembra";
        }
        else{
            sexo = "Macho";
        }
        cli.setSexo(sexo);
        cli.setPeso(Float.parseFloat(txtpeso.getText()));
        
       
        cli.setInfadi(txtobs.getText());
      

      String fechaTexto = txtfecha.getText();

try {
    LocalDate fechaLocal = LocalDate.parse(fechaTexto);
    Date fecha2 = java.sql.Date.valueOf(fechaLocal);
 
} catch (Exception e) {
    // Manejo de errores en caso de que el formato de fecha sea incorrecto
        
}        File imageFile = new File(lblruta.getText());
        byte[] imageBytes = new byte[(int) imageFile.length()];
        try (FileInputStream  fileInputStream = new FileInputStream(imageFile)) {
            fileInputStream.read(imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Establecer la imagen como un campo BLOB
        cli.setFoto(imageBytes);


        cli.setId_mascota( Integer.parseInt(txtreg.getText()));
        obj.modifica(cli);
    
        JOptionPane.showMessageDialog(null, "ACTUALIZADO CORRECTAMENTE"); 
        dispose();

        
        

    }//GEN-LAST:event_btnadd1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void fnacInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_fnacInputMethodTextChanged
       
    }//GEN-LAST:event_fnacInputMethodTextChanged

    private void fnacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnacMouseExited
      // TODO add your handling code here:
    }//GEN-LAST:event_fnacMouseExited

    private void fnacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnacMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_fnacMousePressed

    private void fnacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnacMouseClicked
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"cambio");  
    }//GEN-LAST:event_fnacMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cboespecie;
    private javax.swing.JButton btnadd1;
    private com.toedter.calendar.JDateChooser fnac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblcodraza;
    private javax.swing.JLabel lbledad;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblmascota;
    private javax.swing.JLabel lblruta;
    private javax.swing.JRadioButton rbtfem;
    private javax.swing.JRadioButton rbtmen;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtmascota;
    private javax.swing.JTextArea txtobs;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtraza;
    private javax.swing.JTextField txtreg;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeTo(JDesktopPane desktopPane) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
