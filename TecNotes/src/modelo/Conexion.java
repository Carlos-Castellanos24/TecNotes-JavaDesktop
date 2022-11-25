package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

 Connection conexion;

 public Conexion() {
  try
  {
   String host = "localhost";
   String db = "tecnotes_db";
   String usuario = "root";
   String pw = "";

   String cadenaConexion = "jdbc:mysql://" + host + "/" + db;

   conexion = DriverManager.getConnection(cadenaConexion, usuario, pw);

   // Los procesos seran automaticos sin que tengamos que confirmar
   conexion.setAutoCommit(true);
  } catch (SQLException ex)
  {
   System.out.println("Error inesperado | +info: " + ex.getMessage());
  }

 }

 public Connection getConexion() {
  return conexion;
 }
}