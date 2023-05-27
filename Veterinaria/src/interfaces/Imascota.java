/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import modelo.cliente;
import modelo.mascota;

/**
 *
 * @author Esteban
 */
public interface Imascota {
     void adicion (mascota ep);
     List<mascota> listado();
      void anula (int id);
      void modifica (mascota ep);
}
