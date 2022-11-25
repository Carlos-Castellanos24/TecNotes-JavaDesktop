package clases;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Personalizados {

 public static void desabilitar_botones(JButton btnGuardar, JButton btnBorrar, JButton btnLimpiar, JButton btnActualizar) {
  btnGuardar.setEnabled(false);
  btnBorrar.setEnabled(false);
  btnLimpiar.setEnabled(false);
  btnActualizar.setEnabled(true);
 }

 public static void habilitar_botones(JButton btnGuardar, JButton btnBorrar, JButton btnLimpiar, JButton btnActualizar) {
  btnGuardar.setEnabled(true);
  btnBorrar.setEnabled(true);
  btnLimpiar.setEnabled(true);
  btnActualizar.setEnabled(false);
 }
 
 public static void validar_carnet(java.awt.event.KeyEvent evt, JTextField txtCarnet)
 {
  int key = evt.getKeyChar();

  // De acuerdo a los códigos de la tabla ASCII
  boolean numeros = key >= 48 && key <= 57;

  if (!numeros)
  {
   evt.consume();
  }
  if (txtCarnet.getText().trim().length() == 10)
  {
   evt.consume();
  }
 }
 
 public static void validar_telefono(java.awt.event.KeyEvent evt, JTextField txtTelefono){
  int key = evt.getKeyChar();

  // De acuerdo a los códigos de la tabla ASCII
  boolean numeros = key >= 48 && key <= 57;

  if (!numeros)
  {
   evt.consume();
  }
  if (txtTelefono.getText().trim().length() == 8)
  {
   evt.consume();
  }
 }
}
