/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import modelo.cliente;

/**
 *
 * @author Esteban
 */
public interface Icliente {
    void adicion (cliente ep);
  void anula (int id);
     List<cliente> listado();
}
