/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Esteban
 */
public class BackupController {
   public boolean crearBackup(String rutaBackup) {
    try {
        String comando = "C:\\xampp\\mysql\\bin\\mysqldump --user=root --password= --databases dbveterinaria > " + rutaBackup;
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", comando);
        pb.start();

        return true;  // Indicar que el backup se creó exitosamente
    } catch (IOException e) {
        e.printStackTrace();
        return false;  // Indicar que hubo un error al crear el backup
    }
}
}
